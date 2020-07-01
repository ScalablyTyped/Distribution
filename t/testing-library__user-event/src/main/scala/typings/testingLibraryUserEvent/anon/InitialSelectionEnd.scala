package typings.testingLibraryUserEvent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitialSelectionEnd extends js.Object {
  var initialSelectionEnd: js.UndefOr[Double] = js.undefined
  var initialSelectionStart: js.UndefOr[Double] = js.undefined
}

object InitialSelectionEnd {
  @scala.inline
  def apply(
    initialSelectionEnd: js.UndefOr[Double] = js.undefined,
    initialSelectionStart: js.UndefOr[Double] = js.undefined
  ): InitialSelectionEnd = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(initialSelectionEnd)) __obj.updateDynamic("initialSelectionEnd")(initialSelectionEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialSelectionStart)) __obj.updateDynamic("initialSelectionStart")(initialSelectionStart.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialSelectionEnd]
  }
}

