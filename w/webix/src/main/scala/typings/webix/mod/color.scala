package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait color extends js.Object {
  def hexToDec(hex: String): Double = js.native
  def hsvToRgb(h: Double, s: Double, v: Double): js.Array[_] = js.native
  def rgbToHsv(r: Double, g: Double, b: Double): js.Array[_] = js.native
  def toHex(number: Double): String = js.native
  def toHex(number: Double, length: Double): String = js.native
  def toRgb(rgb: String): js.Array[_] = js.native
}

@JSImport("webix", "color")
@js.native
object color
  extends TopLevel[typings.webix.webix.color]

