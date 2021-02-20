package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HslToRgb extends StObject {
  
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
  implicit class HslToRgbMutableBuilder[Self <: HslToRgb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Bright2Opacity): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHslToRgb(value: (Double, Double, Double) => G): Self = StObject.set(x, "hslToRgb", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHsvToRgb(value: (Double, Double, Double) => G): Self = StObject.set(x, "hsvToRgb", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRgbToHsl(value: (Double, Double, Double) => H): Self = StObject.set(x, "rgbToHsl", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRgbToHsv(value: (Double, Double, Double) => H): Self = StObject.set(x, "rgbToHsv", js.Any.fromFunction3(value))
  }
}
