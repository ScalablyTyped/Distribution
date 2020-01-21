package typings.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNegative extends js.Object {
  var negative: js.UndefOr[String] = js.undefined
  var positive: js.UndefOr[String] = js.undefined
}

object AnonNegative {
  @scala.inline
  def apply(negative: String = null, positive: String = null): AnonNegative = {
    val __obj = js.Dynamic.literal()
    if (negative != null) __obj.updateDynamic("negative")(negative.asInstanceOf[js.Any])
    if (positive != null) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNegative]
  }
}

