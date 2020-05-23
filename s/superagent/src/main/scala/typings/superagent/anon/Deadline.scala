package typings.superagent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deadline extends js.Object {
  var deadline: js.UndefOr[Double] = js.undefined
  var response: js.UndefOr[Double] = js.undefined
}

object Deadline {
  @scala.inline
  def apply(deadline: js.UndefOr[Double] = js.undefined, response: js.UndefOr[Double] = js.undefined): Deadline = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deadline)) __obj.updateDynamic("deadline")(deadline.get.asInstanceOf[js.Any])
    if (!js.isUndefined(response)) __obj.updateDynamic("response")(response.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deadline]
  }
}

