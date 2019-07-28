package typings.surveyDashKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Calculations extends js.Object {
  var calculations: js.UndefOr[js.Array[Anon_PropertyName]] = js.undefined
  var includeEmpty: js.UndefOr[Boolean] = js.undefined
}

object Anon_Calculations {
  @scala.inline
  def apply(calculations: js.Array[Anon_PropertyName] = null, includeEmpty: js.UndefOr[Boolean] = js.undefined): Anon_Calculations = {
    val __obj = js.Dynamic.literal()
    if (calculations != null) __obj.updateDynamic("calculations")(calculations)
    if (!js.isUndefined(includeEmpty)) __obj.updateDynamic("includeEmpty")(includeEmpty)
    __obj.asInstanceOf[Anon_Calculations]
  }
}

