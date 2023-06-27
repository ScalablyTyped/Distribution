package typings.vanillaColorful

import typings.vanillaColorful.libTypesMod.HslColor
import typings.vanillaColorful.libTypesMod.HslaColor
import typings.vanillaColorful.libTypesMod.HsvColor
import typings.vanillaColorful.libTypesMod.HsvaColor
import typings.vanillaColorful.libTypesMod.RgbColor
import typings.vanillaColorful.libTypesMod.RgbaColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsConvertMod {
  
  @JSImport("vanilla-colorful/lib/utils/convert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hexToHsva(hex: String): HsvaColor = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToHsva")(hex.asInstanceOf[js.Any]).asInstanceOf[HsvaColor]
  
  inline def hexToRgba(hex: String): RgbaColor = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRgba")(hex.asInstanceOf[js.Any]).asInstanceOf[RgbaColor]
  
  inline def hslStringToHsva(hslString: String): HsvaColor = ^.asInstanceOf[js.Dynamic].applyDynamic("hslStringToHsva")(hslString.asInstanceOf[js.Any]).asInstanceOf[HsvaColor]
  
  inline def hslaStringToHsva(hslString: String): HsvaColor = ^.asInstanceOf[js.Dynamic].applyDynamic("hslaStringToHsva")(hslString.asInstanceOf[js.Any]).asInstanceOf[HsvaColor]
  
  inline def hslaToHsl(param0: HslaColor): HslColor = ^.asInstanceOf[js.Dynamic].applyDynamic("hslaToHsl")(param0.asInstanceOf[js.Any]).asInstanceOf[HslColor]
  
  inline def hslaToHsva(param0: HslaColor): HsvaColor = ^.asInstanceOf[js.Dynamic].applyDynamic("hslaToHsva")(param0.asInstanceOf[js.Any]).asInstanceOf[HsvaColor]
  
  inline def hsvStringToHsva(hsvString: String): HsvaColor = ^.asInstanceOf[js.Dynamic].applyDynamic("hsvStringToHsva")(hsvString.asInstanceOf[js.Any]).asInstanceOf[HsvaColor]
  
  inline def hsvaStringToHsva(hsvString: String): HsvaColor = ^.asInstanceOf[js.Dynamic].applyDynamic("hsvaStringToHsva")(hsvString.asInstanceOf[js.Any]).asInstanceOf[HsvaColor]
  
  inline def hsvaToHex(hsva: HsvaColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hsvaToHex")(hsva.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hsvaToHslString(hsva: HsvaColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hsvaToHslString")(hsva.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hsvaToHsla(param0: HsvaColor): HslaColor = ^.asInstanceOf[js.Dynamic].applyDynamic("hsvaToHsla")(param0.asInstanceOf[js.Any]).asInstanceOf[HslaColor]
  
  inline def hsvaToHslaString(hsva: HsvaColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hsvaToHslaString")(hsva.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hsvaToHsv(hsva: HsvaColor): HsvColor = ^.asInstanceOf[js.Dynamic].applyDynamic("hsvaToHsv")(hsva.asInstanceOf[js.Any]).asInstanceOf[HsvColor]
  
  inline def hsvaToHsvString(hsva: HsvaColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hsvaToHsvString")(hsva.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hsvaToHsvaString(hsva: HsvaColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hsvaToHsvaString")(hsva.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hsvaToRgbString(hsva: HsvaColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hsvaToRgbString")(hsva.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hsvaToRgba(param0: HsvaColor): RgbaColor = ^.asInstanceOf[js.Dynamic].applyDynamic("hsvaToRgba")(param0.asInstanceOf[js.Any]).asInstanceOf[RgbaColor]
  
  inline def hsvaToRgbaString(hsva: HsvaColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hsvaToRgbaString")(hsva.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseHue(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHue")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def parseHue(value: String, unit: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHue")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def rgbStringToHsva(rgbaString: String): HsvaColor = ^.asInstanceOf[js.Dynamic].applyDynamic("rgbStringToHsva")(rgbaString.asInstanceOf[js.Any]).asInstanceOf[HsvaColor]
  
  inline def rgbaStringToHsva(rgbaString: String): HsvaColor = ^.asInstanceOf[js.Dynamic].applyDynamic("rgbaStringToHsva")(rgbaString.asInstanceOf[js.Any]).asInstanceOf[HsvaColor]
  
  inline def rgbaToHex(param0: RgbaColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rgbaToHex")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def rgbaToHsva(param0: RgbaColor): HsvaColor = ^.asInstanceOf[js.Dynamic].applyDynamic("rgbaToHsva")(param0.asInstanceOf[js.Any]).asInstanceOf[HsvaColor]
  
  inline def rgbaToRgb(param0: RgbaColor): RgbColor = ^.asInstanceOf[js.Dynamic].applyDynamic("rgbaToRgb")(param0.asInstanceOf[js.Any]).asInstanceOf[RgbColor]
  
  inline def roundHsva(hsva: HsvaColor): HsvaColor = ^.asInstanceOf[js.Dynamic].applyDynamic("roundHsva")(hsva.asInstanceOf[js.Any]).asInstanceOf[HsvaColor]
}
