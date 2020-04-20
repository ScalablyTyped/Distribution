package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeadless extends js.Object {
  var headless: js.UndefOr[Boolean] = js.undefined
}

object AnonHeadless {
  @scala.inline
  def apply(headless: js.UndefOr[Boolean] = js.undefined): AnonHeadless = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(headless)) __obj.updateDynamic("headless")(headless.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeadless]
  }
}

