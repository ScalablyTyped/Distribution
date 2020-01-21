package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGt extends js.Object {
  /**
    * Return values where the created field is after this timestamp.
    */
  var gt: js.UndefOr[String] = js.undefined
  /**
    * Return values where the created field is after or equal to this timestamp.
    */
  var gte: js.UndefOr[String] = js.undefined
  /**
    * Return values where the created field is before this timestamp.
    */
  var lt: js.UndefOr[String] = js.undefined
  /**
    * Return values where the created field is before or equal to this timestamp.
    */
  var lte: js.UndefOr[String] = js.undefined
}

object AnonGt {
  @scala.inline
  def apply(gt: String = null, gte: String = null, lt: String = null, lte: String = null): AnonGt = {
    val __obj = js.Dynamic.literal()
    if (gt != null) __obj.updateDynamic("gt")(gt.asInstanceOf[js.Any])
    if (gte != null) __obj.updateDynamic("gte")(gte.asInstanceOf[js.Any])
    if (lt != null) __obj.updateDynamic("lt")(lt.asInstanceOf[js.Any])
    if (lte != null) __obj.updateDynamic("lte")(lte.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGt]
  }
}

