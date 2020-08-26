package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timeouts extends js.Object {
  var `implicit`: js.UndefOr[Double] = js.native
  var pageLoad: js.UndefOr[Double] = js.native
  var script: js.UndefOr[Double] = js.native
}

object Timeouts {
  @scala.inline
  def apply(): Timeouts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timeouts]
  }
  @scala.inline
  implicit class TimeoutsOps[Self <: Timeouts] (val x: Self) extends AnyVal {
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
    def setImplicit(value: Double): Self = this.set("implicit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImplicit: Self = this.set("implicit", js.undefined)
    @scala.inline
    def setPageLoad(value: Double): Self = this.set("pageLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageLoad: Self = this.set("pageLoad", js.undefined)
    @scala.inline
    def setScript(value: Double): Self = this.set("script", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
  }
  
}

