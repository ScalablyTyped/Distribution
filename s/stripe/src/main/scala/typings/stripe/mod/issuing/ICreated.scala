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
    gt: js.UndefOr[Double] = js.undefined,
    gte: js.UndefOr[Double] = js.undefined,
    lt: js.UndefOr[Double] = js.undefined,
    lte: js.UndefOr[Double] = js.undefined
  ): ICreated = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gt)) __obj.updateDynamic("gt")(gt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gte)) __obj.updateDynamic("gte")(gte.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lt)) __obj.updateDynamic("lt")(lt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lte)) __obj.updateDynamic("lte")(lte.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreated]
  }
}

