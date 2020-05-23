package typings.watsonDeveloperCloud.v1GeneratedMod

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
  def apply(field: String = null, value: js.UndefOr[Double] = js.undefined): Calculation = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calculation]
  }
}

