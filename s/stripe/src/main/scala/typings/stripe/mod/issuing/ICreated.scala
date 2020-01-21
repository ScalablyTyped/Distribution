package typings.stripe.mod.issuing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreated extends js.Object {
  /**
    * Return results where the created field is greater than this value.
    */
  var gt: js.UndefOr[Double] = js.undefined
  /**
    * Return results where the created field is greater than or equal to this value.
    */
  var gte: js.UndefOr[Double] = js.undefined
  /**
    * Return results where the created field is less than this value.
    */
  var lt: js.UndefOr[Double] = js.undefined
  /**
    * Return results where the created field is less than or equal to this value.
    */
  var lte: js.UndefOr[Double] = js.undefined
}

object ICreated {
  @scala.inline
  def apply(
    gt: Int | Double = null,
    gte: Int | Double = null,
    lt: Int | Double = null,
    lte: Int | Double = null
  ): ICreated = {
    val __obj = js.Dynamic.literal()
    if (gt != null) __obj.updateDynamic("gt")(gt.asInstanceOf[js.Any])
    if (gte != null) __obj.updateDynamic("gte")(gte.asInstanceOf[js.Any])
    if (lt != null) __obj.updateDynamic("lt")(lt.asInstanceOf[js.Any])
    if (lte != null) __obj.updateDynamic("lte")(lte.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreated]
  }
}

