package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait color extends StObject {
  
  def hexToDec(hex: String): Double = js.native
  
  def hsvToRgb(h: Double, s: Double, v: Double): js.Array[Any] = js.native
  
  def rgbToHex(rgb: String): String = js.native
  def rgbToHex(rgb: js.Array[String | Double]): String = js.native
  
  def rgbToHsv(r: Double, g: Double, b: Double): js.Array[Any] = js.native
  
  def toHex(number: Double): String = js.native
  def toHex(number: Double, length: Double): String = js.native
  
  def toRgb(rgb: String): js.Array[Any] = js.native
}
