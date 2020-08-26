package typings.web3CoreHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReconnectOptions extends js.Object {
  var auto: js.UndefOr[Boolean] = js.native
  var delay: js.UndefOr[Double] = js.native
  var maxAttempts: js.UndefOr[Double] = js.native
  var onTimeout: js.UndefOr[Boolean] = js.native
}

object ReconnectOptions {
  @scala.inline
  def apply(): ReconnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReconnectOptions]
  }
  @scala.inline
  implicit class ReconnectOptionsOps[Self <: ReconnectOptions] (val x: Self) extends AnyVal {
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
    def setAuto(value: Boolean): Self = this.set("auto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuto: Self = this.set("auto", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setMaxAttempts(value: Double): Self = this.set("maxAttempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAttempts: Self = this.set("maxAttempts", js.undefined)
    @scala.inline
    def setOnTimeout(value: Boolean): Self = this.set("onTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTimeout: Self = this.set("onTimeout", js.undefined)
  }
  
}

