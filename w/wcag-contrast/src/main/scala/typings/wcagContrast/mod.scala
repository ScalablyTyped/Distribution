package typings.wcagContrast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wcag-contrast", "hex")
  @js.native
  def hex(a: String, b: String): Double = js.native
  
  @JSImport("wcag-contrast", "luminance")
  @js.native
  def luminance(a: Double, b: Double): Double = js.native
  
  @JSImport("wcag-contrast", "rgb")
  @js.native
  def rgb(a: RGBColor, b: RGBColor): Double = js.native
  
  @JSImport("wcag-contrast", "score")
  @js.native
  def score(contrast: Double): Score_ = js.native
  
  type RGBColor = js.Tuple3[Double, Double, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wcagContrast.wcagContrastStrings.AAA
    - typings.wcagContrast.wcagContrastStrings.AA
    - typings.wcagContrast.wcagContrastStrings.`AA Large`
    - typings.wcagContrast.wcagContrastStrings.Fail
  */
  trait Score_ extends StObject
  object Score_ {
    
    @scala.inline
    def AA: typings.wcagContrast.wcagContrastStrings.AA = "AA".asInstanceOf[typings.wcagContrast.wcagContrastStrings.AA]
    
    @scala.inline
    def `AA Large`: typings.wcagContrast.wcagContrastStrings.`AA Large` = ("AA Large").asInstanceOf[typings.wcagContrast.wcagContrastStrings.`AA Large`]
    
    @scala.inline
    def AAA: typings.wcagContrast.wcagContrastStrings.AAA = "AAA".asInstanceOf[typings.wcagContrast.wcagContrastStrings.AAA]
    
    @scala.inline
    def Fail: typings.wcagContrast.wcagContrastStrings.Fail = "Fail".asInstanceOf[typings.wcagContrast.wcagContrastStrings.Fail]
  }
}
