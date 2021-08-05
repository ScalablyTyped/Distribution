package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HslToRgb extends StObject {
  
  var color: Bright2Opacity
  
  def hslToRgb(h: Double, s: Double, l: Double): G
  
  def hsvToRgb(h: Double, s: Double, v: Double): G
  
  def rgbToHsl(rr: Double, gg: Double, bb: Double): H
  
  def rgbToHsv(r: Double, g: Double, b: Double): H
}
object HslToRgb {
  
  inline def apply(
    color: Bright2Opacity,
    hslToRgb: (Double, Double, Double) => G,
    hsvToRgb: (Double, Double, Double) => G,
    rgbToHsl: (Double, Double, Double) => H,
    rgbToHsv: (Double, Double, Double) => H
  ): HslToRgb = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], hslToRgb = js.Any.fromFunction3(hslToRgb), hsvToRgb = js.Any.fromFunction3(hsvToRgb), rgbToHsl = js.Any.fromFunction3(rgbToHsl), rgbToHsv = js.Any.fromFunction3(rgbToHsv))
    __obj.asInstanceOf[HslToRgb]
  }
  
  extension [Self <: HslToRgb](x: Self) {
    
    inline def setColor(value: Bright2Opacity): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setHslToRgb(value: (Double, Double, Double) => G): Self = StObject.set(x, "hslToRgb", js.Any.fromFunction3(value))
    
    inline def setHsvToRgb(value: (Double, Double, Double) => G): Self = StObject.set(x, "hsvToRgb", js.Any.fromFunction3(value))
    
    inline def setRgbToHsl(value: (Double, Double, Double) => H): Self = StObject.set(x, "rgbToHsl", js.Any.fromFunction3(value))
    
    inline def setRgbToHsv(value: (Double, Double, Double) => H): Self = StObject.set(x, "rgbToHsv", js.Any.fromFunction3(value))
  }
}
