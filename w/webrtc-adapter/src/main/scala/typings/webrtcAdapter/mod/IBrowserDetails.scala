package typings.webrtcAdapter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBrowserDetails extends js.Object {
  var browser: String = js.native
  var supportsUnifiedPlan: js.UndefOr[Boolean] = js.native
  var version: js.UndefOr[Double] = js.native
}

object IBrowserDetails {
  @scala.inline
  def apply(browser: String): IBrowserDetails = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBrowserDetails]
  }
  @scala.inline
  implicit class IBrowserDetailsOps[Self <: IBrowserDetails] (val x: Self) extends AnyVal {
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
    def setBrowser(value: String): Self = this.set("browser", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsUnifiedPlan(value: Boolean): Self = this.set("supportsUnifiedPlan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsUnifiedPlan: Self = this.set("supportsUnifiedPlan", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

