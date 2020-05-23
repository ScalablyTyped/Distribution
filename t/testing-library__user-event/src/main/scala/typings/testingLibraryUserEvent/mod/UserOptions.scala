package typings.testingLibraryUserEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserOptions extends js.Object {
  var allAtOnce: js.UndefOr[Boolean] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
}

object UserOptions {
  @scala.inline
  def apply(allAtOnce: js.UndefOr[Boolean] = js.undefined, delay: js.UndefOr[Double] = js.undefined): UserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allAtOnce)) __obj.updateDynamic("allAtOnce")(allAtOnce.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserOptions]
  }
}

