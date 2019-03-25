package typings
package vscodeLib.vscodeMod

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
  sealed trait ContentChange
    extends vscodeLib.vscodeMod.SignatureHelpTriggerKind
  
  /**
  		 * Signature help was invoked manually by the user or by a command.
  		 */
  @js.native
  sealed trait Invoke
    extends vscodeLib.vscodeMod.SignatureHelpTriggerKind
  
  /**
  		 * Signature help was triggered by a trigger character.
  		 */
  @js.native
  sealed trait TriggerCharacter
    extends vscodeLib.vscodeMod.SignatureHelpTriggerKind
  
  /* 3 */ val ContentChange: ContentChange with scala.Double = js.native
  /* 1 */ val Invoke: Invoke with scala.Double = js.native
  /* 2 */ val TriggerCharacter: TriggerCharacter with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.SignatureHelpTriggerKind with scala.Double] = js.native
}

