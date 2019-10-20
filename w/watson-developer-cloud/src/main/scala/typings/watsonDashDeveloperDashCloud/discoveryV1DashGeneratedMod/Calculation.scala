package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Calculation. */
trait Calculation extends js.Object {
  /** The field where the aggregation is located in the document. */
  var field: js.UndefOr[String] = js.undefined
  /** Value of the aggregation. */
  var value: js.UndefOr[Double] = js.undefined
}

object Calculation {
  @scala.inline
  def apply(field: String = null, value: Int | Double = null): Calculation = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calculation]
  }
}

