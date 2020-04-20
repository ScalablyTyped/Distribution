package typings.winrtUwp.Windows.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a color in terms of alpha, red, green, and blue channels. */
trait Color extends js.Object {
  /** Gets or sets the sRGB alpha channel value of the color. */
  var a: Double
  /** Gets or sets the sRGB blue channel value of the color. */
  var b: Double
  /** Gets or sets the sRGB green channel value of the color. */
  var g: Double
  /** Gets or sets the sRGB red channel value of the color. */
  var r: Double
}

object Color {
  @scala.inline
  def apply(a: Double, b: Double, g: Double, r: Double): Color = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

