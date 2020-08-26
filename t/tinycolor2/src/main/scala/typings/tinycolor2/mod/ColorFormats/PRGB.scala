package typings.tinycolor2.mod.ColorFormats

import typings.tinycolor2.mod._ColorInputWithoutInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PRGB extends _ColorInputWithoutInstance {
  var b: String = js.native
  var g: String = js.native
  var r: String = js.native
}

object PRGB {
  @scala.inline
  def apply(b: String, g: String, r: String): PRGB = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[PRGB]
  }
  @scala.inline
  implicit class PRGBOps[Self <: PRGB] (val x: Self) extends AnyVal {
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
    def setB(value: String): Self = this.set("b", value.asInstanceOf[js.Any])
    @scala.inline
    def setG(value: String): Self = this.set("g", value.asInstanceOf[js.Any])
    @scala.inline
    def setR(value: String): Self = this.set("r", value.asInstanceOf[js.Any])
  }
  
}

