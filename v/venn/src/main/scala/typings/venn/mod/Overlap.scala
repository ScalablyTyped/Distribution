package typings.venn.mod

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
  def apply(sets: js.Array[String], size: Double, weight: js.UndefOr[Double] = js.undefined): Overlap = {
    val __obj = js.Dynamic.literal(sets = sets.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overlap]
  }
}

