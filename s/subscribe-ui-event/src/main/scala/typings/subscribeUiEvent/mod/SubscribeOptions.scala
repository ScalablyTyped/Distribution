package typings.subscribeUiEvent.mod

import typings.std.AddEventListenerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeOptions extends js.Object {
  var context: js.UndefOr[js.Any] = js.native
  var enableResizeInfo: js.UndefOr[Boolean] = js.native
  var enableScrollInfo: js.UndefOr[Boolean] = js.native
  var enableTouchInfo: js.UndefOr[Boolean] = js.native
  var eventOptions: js.UndefOr[AddEventListenerOptions] = js.native
  var throttleRate: js.UndefOr[Double] = js.native
  var useRAF: js.UndefOr[Boolean] = js.native
}

object SubscribeOptions {
  @scala.inline
  def apply(): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeOptions]
  }
  @scala.inline
  implicit class SubscribeOptionsOps[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
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
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setEnableResizeInfo(value: Boolean): Self = this.set("enableResizeInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableResizeInfo: Self = this.set("enableResizeInfo", js.undefined)
    @scala.inline
    def setEnableScrollInfo(value: Boolean): Self = this.set("enableScrollInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableScrollInfo: Self = this.set("enableScrollInfo", js.undefined)
    @scala.inline
    def setEnableTouchInfo(value: Boolean): Self = this.set("enableTouchInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTouchInfo: Self = this.set("enableTouchInfo", js.undefined)
    @scala.inline
    def setEventOptions(value: AddEventListenerOptions): Self = this.set("eventOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventOptions: Self = this.set("eventOptions", js.undefined)
    @scala.inline
    def setThrottleRate(value: Double): Self = this.set("throttleRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottleRate: Self = this.set("throttleRate", js.undefined)
    @scala.inline
    def setUseRAF(value: Boolean): Self = this.set("useRAF", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseRAF: Self = this.set("useRAF", js.undefined)
  }
  
}

