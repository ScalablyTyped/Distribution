package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureHelpContext extends js.Object {
  /**
  		 * The currently active [`SignatureHelp`](#SignatureHelp).
  		 *
  		 * The `activeSignatureHelp` has its [`SignatureHelp.activeSignature`] field updated based on
  		 * the user arrowing through available signatures.
  		 */
  val activeSignatureHelp: js.UndefOr[SignatureHelp] = js.undefined
  /**
  		 * `true` if signature help was already showing when it was triggered.
  		 *
  		 * Retriggers occur when the signature help is already active and can be caused by actions such as
  		 * typing a trigger character, a cursor move, or document content changes.
  		 */
  val isRetrigger: Boolean
  /**
  		 * Character that caused signature help to be triggered.
  		 *
  		 * This is `undefined` when signature help is not triggered by typing, such as when manually invoking
  		 * signature help or when moving the cursor.
  		 */
  val triggerCharacter: js.UndefOr[String] = js.undefined
  /**
  		 * Action that caused signature help to be triggered.
  		 */
  val triggerKind: SignatureHelpTriggerKind
}

object SignatureHelpContext {
  @scala.inline
  def apply(
    isRetrigger: Boolean,
    triggerKind: SignatureHelpTriggerKind,
    activeSignatureHelp: SignatureHelp = null,
    triggerCharacter: String = null
  ): SignatureHelpContext = {
    val __obj = js.Dynamic.literal(isRetrigger = isRetrigger, triggerKind = triggerKind)
    if (activeSignatureHelp != null) __obj.updateDynamic("activeSignatureHelp")(activeSignatureHelp)
    if (triggerCharacter != null) __obj.updateDynamic("triggerCharacter")(triggerCharacter)
    __obj.asInstanceOf[SignatureHelpContext]
  }
}

