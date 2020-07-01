package typings.testingLibraryUserEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITypeOpts extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var initialSelectionEnd: js.UndefOr[Double] = js.undefined
  var initialSelectionStart: js.UndefOr[Double] = js.undefined
  var skipAutoClose: js.UndefOr[Boolean] = js.undefined
  var skipClick: js.UndefOr[Boolean] = js.undefined
}

object ITypeOpts {
  @scala.inline
  def apply(
    delay: js.UndefOr[Double] = js.undefined,
    initialSelectionEnd: js.UndefOr[Double] = js.undefined,
    initialSelectionStart: js.UndefOr[Double] = js.undefined,
    skipAutoClose: js.UndefOr[Boolean] = js.undefined,
    skipClick: js.UndefOr[Boolean] = js.undefined
  ): ITypeOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialSelectionEnd)) __obj.updateDynamic("initialSelectionEnd")(initialSelectionEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialSelectionStart)) __obj.updateDynamic("initialSelectionStart")(initialSelectionStart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipAutoClose)) __obj.updateDynamic("skipAutoClose")(skipAutoClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipClick)) __obj.updateDynamic("skipClick")(skipClick.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITypeOpts]
  }
}

