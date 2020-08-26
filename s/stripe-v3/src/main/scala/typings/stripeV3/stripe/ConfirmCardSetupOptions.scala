package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmCardSetupOptions extends js.Object {
  /*
    * Set this to false if you want to handle next actions yourself, or if
    * you want to defer next action handling until later (e.g. for use in
    * the PaymentRequest API). Default is true.
    */
  var handleActions: js.UndefOr[Boolean] = js.native
}

object ConfirmCardSetupOptions {
  @scala.inline
  def apply(): ConfirmCardSetupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmCardSetupOptions]
  }
  @scala.inline
  implicit class ConfirmCardSetupOptionsOps[Self <: ConfirmCardSetupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHandleActions(value: Boolean): Self = this.set("handleActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleActions: Self = this.set("handleActions", js.undefined)
  }
  
}

