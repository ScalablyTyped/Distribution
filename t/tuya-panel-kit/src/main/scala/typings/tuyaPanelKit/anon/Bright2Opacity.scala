package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bright2Opacity extends StObject {
  
  def bright2Opacity(bright: Double, option: Max): Double = js.native
  
  def brightKelvin2rgb(bright: Double): String = js.native
  def brightKelvin2rgb(bright: Double, kelvin: js.UndefOr[scala.Nothing], option: TemperatureMax): String = js.native
  def brightKelvin2rgb(bright: Double, kelvin: Double): String = js.native
  def brightKelvin2rgb(bright: Double, kelvin: Double, option: TemperatureMax): String = js.native
  
  def brightKelvin2rgba(bright: Double, kelvin: Double): String = js.native
  
  def complement(color: String): String = js.native
  
  def decodeColorData(data: String): js.Array[Double] = js.native
  
  def decodeColorDataWithPosition(data: String): js.Array[Double] = js.native
  
  def encodeColorData(rgbhsv: String): String = js.native
  
  def hex2RgbString(hex: String): String = js.native
  def hex2RgbString(hex: String, alpha: Double): String = js.native
  
  def hex2hsb(hex: String): js.Array[Double] = js.native
  
  def hex2hsl(hex: String): js.Array[Double] = js.native
  
  def hex2hsv(hex: String): js.Array[Double] = js.native
  
  def hex2yuv(hex: String): js.Array[Double] = js.native
  
  def hsb2hex(h: Double, s: Double, b: Double): String = js.native
  
  def hsb2rgb(h: Double, s: Double, v: Double, a: Double): js.Array[Double] = js.native
  
  def hsl2RgbString(h: Double, s: Double, l: Double, a: Double): String = js.native
  
  def hsl2hex(h: Double, s: Double, l: Double): String = js.native
  
  def hsl2rgb(h: Double, s: Double, l: Double, a: Double): js.Array[Double] = js.native
  
  def hsv2RgbString(h: Double, s: Double, v: Double, a: Double): String = js.native
  
  def hsv2hex(h: Double, s: Double, v: Double): String = js.native
  
  def hsv2rgb(h: Double, s: Double, v: Double, a: Double): js.Array[Double] = js.native
  
  def hsv2rgba(h: Double, s: Double, v: Double): String = js.native
  
  def kelvin2rgb(kelvin: Double): js.Array[Double] = js.native
  
  def randomHsb(): js.Array[Double] = js.native
  
  def randomRgb(min: Double, max: Double): js.Array[Double] = js.native
  
  def reversed(color: String): String = js.native
  
  def rgb2hex(r: Double, g: Double, b: Double): String = js.native
  
  def rgb2hsb(rgb: Double*): js.Array[Double] = js.native
  
  def rgb2hsl(r: Double, g: Double, b: Double): js.Array[Double] = js.native
  
  def rgb2hsv(args: Double*): js.Array[Double] = js.native
  
  def temp2rgb(kelvin: Double): String = js.native
  def temp2rgb(kelvin: Double, option: TemperatureMax): String = js.native
  
  def yuv2RgbString(y: Double, u: Double, v: Double, a: Double): String = js.native
  
  def yuv2rgb(y: Double, u: Double, v: Double, a: Double): js.Array[Double] = js.native
}
