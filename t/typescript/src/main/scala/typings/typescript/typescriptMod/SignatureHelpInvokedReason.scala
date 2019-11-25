package typings.typescript.typescriptMod

import typings.typescript.typescriptStrings.invoked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Signals that the user manually requested signature help.
  * The language service will unconditionally attempt to provide a result.
  */
trait SignatureHelpInvokedReason extends SignatureHelpTriggerReason {
  var kind: invoked
  var triggerCharacter: js.UndefOr[scala.Nothing] = js.undefined
}

object SignatureHelpInvokedReason {
  @scala.inline
  def apply(kind: invoked, triggerCharacter: js.UndefOr[scala.Nothing] = js.undefined): SignatureHelpInvokedReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (!js.isUndefined(triggerCharacter)) __obj.updateDynamic("triggerCharacter")(triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpInvokedReason]
  }
}

