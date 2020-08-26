package typings.wordpressBlockEditor.panelColorSettingsMod.PanelColorSettings

import typings.wordpressComponents.colorPaletteMod.ColorPalette.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/components.@wordpress/components.ColorPalette.Props> & std.Pick<@wordpress/components.@wordpress/components.ColorPalette.Props, 'onChange' | 'value'> & {  label :string} */
@js.native
trait ColorSetting extends js.Object {
  var className: js.UndefOr[String] = js.native
  var colors: js.UndefOr[js.Array[Color]] = js.native
  var disableCustomColors: js.UndefOr[Boolean] = js.native
  var label: String = js.native
  var onChange: js.UndefOr[js.Function0[Unit]] with js.Function0[Unit] = js.native
  var value: js.UndefOr[Color] with Color = js.native
}

object ColorSetting {
  @scala.inline
  def apply(
    label: String,
    onChange: js.UndefOr[js.Function0[Unit]] with js.Function0[Unit],
    value: js.UndefOr[Color] with Color
  ): ColorSetting = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSetting]
  }
  @scala.inline
  implicit class ColorSettingOps[Self <: ColorSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: js.UndefOr[js.Function0[Unit]] with js.Function0[Unit]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.UndefOr[Color] with Color): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColorsVarargs(value: Color*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[Color]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setDisableCustomColors(value: Boolean): Self = this.set("disableCustomColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableCustomColors: Self = this.set("disableCustomColors", js.undefined)
  }
  
}

