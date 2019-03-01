package typings
package winrtDashUwpLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents number values that specify a height and width. */
trait Size extends js.Object {
  /** The height. */
  var height: scala.Double
  /** The width. */
  var width: scala.Double
}

object Size {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): Size = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Size]
  }
}

