package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureHelpItemsOptions extends js.Object {
  var triggerReason: js.UndefOr[SignatureHelpTriggerReason] = js.undefined
}

object SignatureHelpItemsOptions {
  @scala.inline
  def apply(triggerReason: SignatureHelpTriggerReason = null): SignatureHelpItemsOptions = {
    val __obj = js.Dynamic.literal()
    if (triggerReason != null) __obj.updateDynamic("triggerReason")(triggerReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpItemsOptions]
  }
}

