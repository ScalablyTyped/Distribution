package typings
package winrtLib.WindowsNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var a: scala.Double
  var b: scala.Double
  var g: scala.Double
  var r: scala.Double
}

object Color {
  @scala.inline
  def apply(a: scala.Double, b: scala.Double, g: scala.Double, r: scala.Double): Color = {
    val __obj = js.Dynamic.literal(a = a, b = b, g = g, r = r)
  
    __obj.asInstanceOf[Color]
  }
}

