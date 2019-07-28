package typings.venn.vennMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Overlap extends js.Object {
  var sets: js.Array[String]
  var size: Double
  var weight: js.UndefOr[Double] = js.undefined
}

object Overlap {
  @scala.inline
  def apply(sets: js.Array[String], size: Double, weight: Int | Double = null): Overlap = {
    val __obj = js.Dynamic.literal(sets = sets, size = size)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overlap]
  }
}

