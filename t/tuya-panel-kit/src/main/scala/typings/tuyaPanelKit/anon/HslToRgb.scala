package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HslToRgb extends js.Object {
  
  var color: Bright2Opacity = js.native
  
  def hslToRgb(h: Double, s: Double, l: Double): G = js.native
  
  def hsvToRgb(h: Double, s: Double, v: Double): G = js.native
  
  def rgbToHsl(rr: Double, gg: Double, bb: Double): H = js.native
  
  def rgbToHsv(r: Double, g: Double, b: Double): H = js.native
}
object HslToRgb {
  
  @scala.inline
  def apply(
    color: Bright2Opacity,
    hslToRgb: (Double, Double, Double) => G,
    hsvToRgb: (Double, Double, Double) => G,
    rgbToHsl: (Double, Double, Double) => H,
    rgbToHsv: (Double, Double, Double) => H
  ): HslToRgb = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], hslToRgb = js.Any.fromFunction3(hslToRgb), hsvToRgb = js.Any.fromFunction3(hsvToRgb), rgbToHsl = js.Any.fromFunction3(rgbToHsl), rgbToHsv = js.Any.fromFunction3(rgbToHsv))
    __obj.asInstanceOf[HslToRgb]
  }
  
  @scala.inline
  implicit class HslToRgbOps[Self <: HslToRgb] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Bright2Opacity): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHslToRgb(value: (Double, Double, Double) => G): Self = this.set("hslToRgb", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHsvToRgb(value: (Double, Double, Double) => G): Self = this.set("hsvToRgb", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRgbToHsl(value: (Double, Double, Double) => H): Self = this.set("rgbToHsl", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRgbToHsv(value: (Double, Double, Double) => H): Self = this.set("rgbToHsv", js.Any.fromFunction3(value))
  }
}
