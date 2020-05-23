package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeEmpty extends js.Object {
  var calculations: js.UndefOr[js.Array[PropertyName]] = js.undefined
  var includeEmpty: js.UndefOr[Boolean] = js.undefined
  var includeQuestionTypes: js.UndefOr[Boolean] = js.undefined
}

object IncludeEmpty {
  @scala.inline
  def apply(
    calculations: js.Array[PropertyName] = null,
    includeEmpty: js.UndefOr[Boolean] = js.undefined,
    includeQuestionTypes: js.UndefOr[Boolean] = js.undefined
  ): IncludeEmpty = {
    val __obj = js.Dynamic.literal()
    if (calculations != null) __obj.updateDynamic("calculations")(calculations.asInstanceOf[js.Any])
    if (!js.isUndefined(includeEmpty)) __obj.updateDynamic("includeEmpty")(includeEmpty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeQuestionTypes)) __obj.updateDynamic("includeQuestionTypes")(includeQuestionTypes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeEmpty]
  }
}

