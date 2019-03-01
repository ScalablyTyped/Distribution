package typings
package vennLib.vennMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Overlap extends js.Object {
  var sets: js.Array[java.lang.String]
  var size: scala.Double
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object Overlap {
  @scala.inline
  def apply(sets: js.Array[java.lang.String], size: scala.Double, weight: scala.Int | scala.Double = null): Overlap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sets")(sets)
    __obj.updateDynamic("size")(size)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overlap]
  }
}

