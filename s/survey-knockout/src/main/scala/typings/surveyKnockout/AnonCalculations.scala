package typings.surveyKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCalculations extends js.Object {
  var calculations: js.UndefOr[js.Array[AnonPropertyName]] = js.undefined
  var includeEmpty: js.UndefOr[Boolean] = js.undefined
}

object AnonCalculations {
  @scala.inline
  def apply(calculations: js.Array[AnonPropertyName] = null, includeEmpty: js.UndefOr[Boolean] = js.undefined): AnonCalculations = {
    val __obj = js.Dynamic.literal()
    if (calculations != null) __obj.updateDynamic("calculations")(calculations.asInstanceOf[js.Any])
    if (!js.isUndefined(includeEmpty)) __obj.updateDynamic("includeEmpty")(includeEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCalculations]
  }
}

