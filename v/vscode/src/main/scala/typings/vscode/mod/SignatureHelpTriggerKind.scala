package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SignatureHelpTriggerKind extends js.Object

@JSImport("vscode", "SignatureHelpTriggerKind")
@js.native
object SignatureHelpTriggerKind extends js.Object {
  /**
    * Signature help was triggered by the cursor moving or by the document content changing.
    */
  @js.native
  sealed trait ContentChange extends SignatureHelpTriggerKind
  
  /**
    * Signature help was invoked manually by the user or by a command.
    */
  @js.native
  sealed trait Invoke extends SignatureHelpTriggerKind
  
  /**
    * Signature help was triggered by a trigger character.
    */
  @js.native
  sealed trait TriggerCharacter extends SignatureHelpTriggerKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SignatureHelpTriggerKind with Double] = js.native
  /* 3 */ @js.native
  object ContentChange extends TopLevel[ContentChange with Double]
  
  /* 1 */ @js.native
  object Invoke extends TopLevel[Invoke with Double]
  
  /* 2 */ @js.native
  object TriggerCharacter extends TopLevel[TriggerCharacter with Double]
  
}

