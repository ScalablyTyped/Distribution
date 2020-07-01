package typings.testingLibraryUserEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClickOptions extends js.Object {
  var clickCount: js.UndefOr[Double] = js.undefined
  var skipHover: js.UndefOr[Boolean] = js.undefined
}

object IClickOptions {
  @scala.inline
  def apply(clickCount: js.UndefOr[Double] = js.undefined, skipHover: js.UndefOr[Boolean] = js.undefined): IClickOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickCount)) __obj.updateDynamic("clickCount")(clickCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipHover)) __obj.updateDynamic("skipHover")(skipHover.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClickOptions]
  }
}

