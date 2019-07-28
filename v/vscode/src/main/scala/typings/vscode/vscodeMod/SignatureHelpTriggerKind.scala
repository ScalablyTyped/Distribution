package typings.vscode.vscodeMod

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
  
  /* 3 */ val ContentChange: typings.vscode.vscodeMod.SignatureHelpTriggerKind.ContentChange with Double = js.native
  /* 1 */ val Invoke: typings.vscode.vscodeMod.SignatureHelpTriggerKind.Invoke with Double = js.native
  /* 2 */ val TriggerCharacter: typings.vscode.vscodeMod.SignatureHelpTriggerKind.TriggerCharacter with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SignatureHelpTriggerKind with Double] = js.native
}

