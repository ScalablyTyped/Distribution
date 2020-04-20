package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimate extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
}

object AnonAnimate {
  @scala.inline
  def apply(animate: js.UndefOr[Boolean] = js.undefined): AnonAnimate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimate]
  }
}

