package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaitUntilOptions extends js.Object {
  var interval: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var timeoutMsg: js.UndefOr[String] = js.native
}

object WaitUntilOptions {
  @scala.inline
  def apply(): WaitUntilOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitUntilOptions]
  }
  @scala.inline
  implicit class WaitUntilOptionsOps[Self <: WaitUntilOptions] (val x: Self) extends AnyVal {
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
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTimeoutMsg(value: String): Self = this.set("timeoutMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutMsg: Self = this.set("timeoutMsg", js.undefined)
  }
  
}

