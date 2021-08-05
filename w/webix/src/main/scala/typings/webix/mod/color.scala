package typings.webix.mod

import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait color extends StObject {
  
  def hexToDec(hex: String): Double = js.native
  
  def hsvToRgb(h: Double, s: Double, v: Double): js.Array[js.Any] = js.native
  
  def rgbToHsv(r: Double, g: Double, b: Double): js.Array[js.Any] = js.native
  
  def toHex(number: Double): String = js.native
  def toHex(number: Double, length: Double): String = js.native
  
  def toRgb(rgb: String): js.Array[js.Any] = js.native
}
object color {
  
  inline def apply: typings.webix.webix.color = ^.asInstanceOf[js.Dynamic].selectDynamic("color").asInstanceOf[typings.webix.webix.color]
}
