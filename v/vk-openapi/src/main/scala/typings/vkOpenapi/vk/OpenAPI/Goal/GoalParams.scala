package typings.vkOpenapi.vk.OpenAPI.Goal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoalParams extends js.Object {
  var value: js.UndefOr[Double] = js.undefined
}

object GoalParams {
  @scala.inline
  def apply(value: Int | Double = null): GoalParams = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoalParams]
  }
}

