package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Refers to the density of a typeface, in terms of the lightness or heaviness of the strokes. */
trait FontWeight extends js.Object {
  /** The font weight expressed as a numeric value. See Remarks. */
  var weight: scala.Double
}

object FontWeight {
  @scala.inline
  def apply(weight: scala.Double): FontWeight = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[FontWeight]
  }
}

