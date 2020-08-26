package typings.webdriverio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alpha extends js.Object {
  var alpha: js.UndefOr[Double] = js.native
  // color
  var hex: js.UndefOr[String] = js.native
  var rgba: js.UndefOr[String] = js.native
  var string: String = js.native
  var `type`: js.UndefOr[String] = js.native
  // other
  var unit: js.UndefOr[String] = js.native
  // font-family
  var value: js.UndefOr[js.Any] = js.native
}

object Alpha {
  @scala.inline
  def apply(string: String): Alpha = {
    val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alpha]
  }
  @scala.inline
  implicit class AlphaOps[Self <: Alpha] (val x: Self) extends AnyVal {
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
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setHex(value: String): Self = this.set("hex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHex: Self = this.set("hex", js.undefined)
    @scala.inline
    def setRgba(value: String): Self = this.set("rgba", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRgba: Self = this.set("rgba", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

