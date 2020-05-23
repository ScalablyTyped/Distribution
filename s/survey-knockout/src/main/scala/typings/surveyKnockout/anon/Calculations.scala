package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calculations extends js.Object {
  var calculations: js.UndefOr[js.Array[PropertyName]] = js.undefined
  var includeEmpty: js.UndefOr[Boolean] = js.undefined
}

object Calculations {
  @scala.inline
  def apply(calculations: js.Array[PropertyName] = null, includeEmpty: js.UndefOr[Boolean] = js.undefined): Calculations = {
    val __obj = js.Dynamic.literal()
    if (calculations != null) __obj.updateDynamic("calculations")(calculations.asInstanceOf[js.Any])
    if (!js.isUndefined(includeEmpty)) __obj.updateDynamic("includeEmpty")(includeEmpty.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calculations]
  }
}

