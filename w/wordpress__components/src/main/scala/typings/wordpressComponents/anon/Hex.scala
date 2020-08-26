package typings.wordpressComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hex extends js.Object {
  var hex: String = js.native
  var hsl: String = js.native
  var hsv: String = js.native
  var rgb: String = js.native
}

object Hex {
  @scala.inline
  def apply(hex: String, hsl: String, hsv: String, rgb: String): Hex = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], hsv = hsv.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hex]
  }
  @scala.inline
  implicit class HexOps[Self <: Hex] (val x: Self) extends AnyVal {
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
    def setHex(value: String): Self = this.set("hex", value.asInstanceOf[js.Any])
    @scala.inline
    def setHsl(value: String): Self = this.set("hsl", value.asInstanceOf[js.Any])
    @scala.inline
    def setHsv(value: String): Self = this.set("hsv", value.asInstanceOf[js.Any])
    @scala.inline
    def setRgb(value: String): Self = this.set("rgb", value.asInstanceOf[js.Any])
  }
  
}

