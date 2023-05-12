package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SignatureHelpTriggerKind extends StObject
@JSImport("vscode", "SignatureHelpTriggerKind")
@js.native
object SignatureHelpTriggerKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SignatureHelpTriggerKind & Double] = js.native
  
  /**
  		 * Signature help was triggered by the cursor moving or by the document content changing.
  		 */
  @js.native
  sealed trait ContentChange
    extends StObject
       with SignatureHelpTriggerKind
  /* 3 */ val ContentChange: typings.vscode.mod.SignatureHelpTriggerKind.ContentChange & Double = js.native
  
  /**
  		 * Signature help was invoked manually by the user or by a command.
  		 */
  @js.native
  sealed trait Invoke
    extends StObject
       with SignatureHelpTriggerKind
  /* 1 */ val Invoke: typings.vscode.mod.SignatureHelpTriggerKind.Invoke & Double = js.native
  
  /**
  		 * Signature help was triggered by a trigger character.
  		 */
  @js.native
  sealed trait TriggerCharacter
    extends StObject
       with SignatureHelpTriggerKind
  /* 2 */ val TriggerCharacter: typings.vscode.mod.SignatureHelpTriggerKind.TriggerCharacter & Double = js.native
}
