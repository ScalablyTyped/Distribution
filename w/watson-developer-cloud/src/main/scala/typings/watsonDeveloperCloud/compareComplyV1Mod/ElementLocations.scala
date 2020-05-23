package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A list of `begin` and `end` indexes that indicate the locations of the elements in the input document. */
trait ElementLocations extends js.Object {
  /** An integer that indicates the starting position of the element in the input document. */
  var begin: js.UndefOr[Double] = js.undefined
  /** An integer that indicates the ending position of the element in the input document. */
  var end: js.UndefOr[Double] = js.undefined
}

object ElementLocations {
  @scala.inline
  def apply(begin: js.UndefOr[Double] = js.undefined, end: js.UndefOr[Double] = js.undefined): ElementLocations = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(begin)) __obj.updateDynamic("begin")(begin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementLocations]
  }
}

