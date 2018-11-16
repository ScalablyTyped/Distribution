package typings
package webixLib.webixNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait color extends js.Object {
  def hexToDec(hex: java.lang.String): scala.Double = js.native
  def hsvToRgb(h: scala.Double, s: scala.Double, v: scala.Double): js.Array[_] = js.native
  def rgbToHsv(r: scala.Double, g: scala.Double, b: scala.Double): js.Array[_] = js.native
  def toHex(number: scala.Double): java.lang.String = js.native
  def toHex(number: scala.Double, length: scala.Double): java.lang.String = js.native
  def toRgb(rgb: java.lang.String): js.Array[_] = js.native
}

