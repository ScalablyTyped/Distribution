package typings
package winrtDashUwpLib.WindowsNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a color in terms of alpha, red, green, and blue channels. */
trait Color extends js.Object {
  /** Gets or sets the sRGB alpha channel value of the color. */
  var a: scala.Double
  /** Gets or sets the sRGB blue channel value of the color. */
  var b: scala.Double
  /** Gets or sets the sRGB green channel value of the color. */
  var g: scala.Double
  /** Gets or sets the sRGB red channel value of the color. */
  var r: scala.Double
}

object Color {
  @scala.inline
  def apply(a: scala.Double, b: scala.Double, g: scala.Double, r: scala.Double): Color = {
    val __obj = js.Dynamic.literal(a = a, b = b, g = g, r = r)
  
    __obj.asInstanceOf[Color]
  }
}

