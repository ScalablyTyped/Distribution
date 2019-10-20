package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

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
  def apply(begin: Int | Double = null, end: Int | Double = null): ElementLocations = {
    val __obj = js.Dynamic.literal()
    if (begin != null) __obj.updateDynamic("begin")(begin.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementLocations]
  }
}

