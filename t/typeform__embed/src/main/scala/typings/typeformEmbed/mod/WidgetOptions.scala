package typings.typeformEmbed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetOptions extends js.Object {
  var buttonText: js.UndefOr[String] = js.undefined
  var disableTracking: js.UndefOr[Boolean] = js.undefined
  var hideFooter: js.UndefOr[Boolean] = js.undefined
  var hideHeaders: js.UndefOr[Boolean] = js.undefined
  var hideScrollbars: js.UndefOr[Boolean] = js.undefined
  var onSubmit: js.UndefOr[js.Function0[_]] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object WidgetOptions {
  @scala.inline
  def apply(
    buttonText: String = null,
    disableTracking: js.UndefOr[Boolean] = js.undefined,
    hideFooter: js.UndefOr[Boolean] = js.undefined,
    hideHeaders: js.UndefOr[Boolean] = js.undefined,
    hideScrollbars: js.UndefOr[Boolean] = js.undefined,
    onSubmit: () => _ = null,
    opacity: js.UndefOr[Double] = js.undefined
  ): WidgetOptions = {
    val __obj = js.Dynamic.literal()
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTracking)) __obj.updateDynamic("disableTracking")(disableTracking.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideFooter)) __obj.updateDynamic("hideFooter")(hideFooter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideHeaders)) __obj.updateDynamic("hideHeaders")(hideHeaders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideScrollbars)) __obj.updateDynamic("hideScrollbars")(hideScrollbars.get.asInstanceOf[js.Any])
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction0(onSubmit))
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetOptions]
  }
}

