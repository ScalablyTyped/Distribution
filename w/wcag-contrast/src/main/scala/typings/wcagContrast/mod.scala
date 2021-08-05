package typings.wcagContrast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wcag-contrast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hex(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hex")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def luminance(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("luminance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def rgb(a: RGBColor, b: RGBColor): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def score(contrast: Double): Score_ = ^.asInstanceOf[js.Dynamic].applyDynamic("score")(contrast.asInstanceOf[js.Any]).asInstanceOf[Score_]
  
  type RGBColor = js.Tuple3[Double, Double, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wcagContrast.wcagContrastStrings.AAA
    - typings.wcagContrast.wcagContrastStrings.AA
    - typings.wcagContrast.wcagContrastStrings.`AA Large`
    - typings.wcagContrast.wcagContrastStrings.Fail
  */
  trait Score_ extends StObject
  object Score_ {
    
    inline def AA: typings.wcagContrast.wcagContrastStrings.AA = "AA".asInstanceOf[typings.wcagContrast.wcagContrastStrings.AA]
    
    inline def `AA Large`: typings.wcagContrast.wcagContrastStrings.`AA Large` = ("AA Large").asInstanceOf[typings.wcagContrast.wcagContrastStrings.`AA Large`]
    
    inline def AAA: typings.wcagContrast.wcagContrastStrings.AAA = "AAA".asInstanceOf[typings.wcagContrast.wcagContrastStrings.AAA]
    
    inline def Fail: typings.wcagContrast.wcagContrastStrings.Fail = "Fail".asInstanceOf[typings.wcagContrast.wcagContrastStrings.Fail]
  }
}
