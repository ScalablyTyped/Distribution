package typings.wordpressBlockEditor.fontSizesMod.FontSizePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@wordpress/components.@wordpress/components.FontSizePicker.Props, 'disableCustomFontSizes' | 'fontSizes'> */
trait Props extends js.Object {
  var fallbackFontSize: js.UndefOr[Double] = js.undefined
  var onChange: js.Function0[Unit]
  var value: js.UndefOr[Double] = js.undefined
  var withSlider: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    onChange: () => Unit,
    fallbackFontSize: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined,
    withSlider: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction0(onChange))
    if (!js.isUndefined(fallbackFontSize)) __obj.updateDynamic("fallbackFontSize")(fallbackFontSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withSlider)) __obj.updateDynamic("withSlider")(withSlider.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

