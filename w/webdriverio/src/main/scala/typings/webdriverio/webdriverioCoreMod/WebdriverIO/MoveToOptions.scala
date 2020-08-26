package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoveToOptions extends js.Object {
  var xOffset: js.UndefOr[Double] = js.native
  var yOffset: js.UndefOr[Double] = js.native
}

object MoveToOptions {
  @scala.inline
  def apply(): MoveToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveToOptions]
  }
  @scala.inline
  implicit class MoveToOptionsOps[Self <: MoveToOptions] (val x: Self) extends AnyVal {
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
    def setXOffset(value: Double): Self = this.set("xOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXOffset: Self = this.set("xOffset", js.undefined)
    @scala.inline
    def setYOffset(value: Double): Self = this.set("yOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYOffset: Self = this.set("yOffset", js.undefined)
  }
  
}

