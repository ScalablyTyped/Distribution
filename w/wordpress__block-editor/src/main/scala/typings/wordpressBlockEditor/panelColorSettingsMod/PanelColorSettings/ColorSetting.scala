package typings.wordpressBlockEditor.panelColorSettingsMod.PanelColorSettings

import typings.wordpressComponents.colorPaletteMod.ColorPalette.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/components.@wordpress/components.ColorPalette.Props> & std.Pick<@wordpress/components.@wordpress/components.ColorPalette.Props, 'onChange' | 'value'> & {  label  :string} */
trait ColorSetting extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  var disableCustomColors: js.UndefOr[Boolean] = js.undefined
  var label: String
  var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var value: js.UndefOr[Color] = js.undefined
}

object ColorSetting {
  @scala.inline
  def apply(
    label: String,
    className: String = null,
    colors: js.Array[Color] = null,
    disableCustomColors: js.UndefOr[Boolean] = js.undefined,
    onChange: () => Unit = null,
    value: Color = null
  ): ColorSetting = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCustomColors)) __obj.updateDynamic("disableCustomColors")(disableCustomColors.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction0(onChange))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSetting]
  }
}

