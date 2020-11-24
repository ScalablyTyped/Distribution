package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SignatureHelpTriggerKind extends js.Object
@JSImport("vscode", "SignatureHelpTriggerKind")
@js.native
object SignatureHelpTriggerKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SignatureHelpTriggerKind with Double] = js.native
  
  /**
    * Signature help was triggered by the cursor moving or by the document content changing.
    */
  @js.native
  sealed trait ContentChange extends SignatureHelpTriggerKind
  /* 3 */ @js.native
  object ContentChange extends TopLevel[ContentChange with Double]
  
  /**
    * Signature help was invoked manually by the user or by a command.
    */
  @js.native
  sealed trait Invoke extends SignatureHelpTriggerKind
  /* 1 */ @js.native
  object Invoke extends TopLevel[Invoke with Double]
  
  /**
    * Signature help was triggered by a trigger character.
    */
  @js.native
  sealed trait TriggerCharacter extends SignatureHelpTriggerKind
  /* 2 */ @js.native
  object TriggerCharacter extends TopLevel[TriggerCharacter with Double]
}
