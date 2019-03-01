package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Signals that the user manually requested signature help.
  * The language service will unconditionally attempt to provide a result.
  */
trait SignatureHelpInvokedReason extends SignatureHelpTriggerReason {
  var kind: typescriptLib.typescriptLibStrings.invoked
  var triggerCharacter: js.UndefOr[scala.Nothing] = js.undefined
}

object SignatureHelpInvokedReason {
  @scala.inline
  def apply(
    kind: typescriptLib.typescriptLibStrings.invoked,
    triggerCharacter: js.UndefOr[scala.Nothing] = js.undefined
  ): SignatureHelpInvokedReason = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    if (!js.isUndefined(triggerCharacter)) __obj.updateDynamic("triggerCharacter")(triggerCharacter)
    __obj.asInstanceOf[SignatureHelpInvokedReason]
  }
}

