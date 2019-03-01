package typings
package superagentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Deadline extends js.Object {
  var deadline: js.UndefOr[scala.Double] = js.undefined
  var response: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Deadline {
  @scala.inline
  def apply(deadline: scala.Int | scala.Double = null, response: scala.Int | scala.Double = null): Anon_Deadline = {
    val __obj = js.Dynamic.literal()
    if (deadline != null) __obj.updateDynamic("deadline")(deadline.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Deadline]
  }
}

