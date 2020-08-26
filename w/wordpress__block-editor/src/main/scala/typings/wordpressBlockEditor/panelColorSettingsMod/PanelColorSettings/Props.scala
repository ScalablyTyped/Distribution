package typings.wordpressBlockEditor.panelColorSettingsMod.PanelColorSettings

import typings.wordpressComponents.iconMod.Icon.IconType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<@wordpress/components.@wordpress/components.PanelBody.Props, 'children'> */
@js.native
trait Props extends js.Object {
  var className: js.UndefOr[js.Any] = js.native
  var colorSettings: js.Array[ColorSetting] = js.native
  var disableCustomColors: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[IconType[js.Object]] = js.native
  var initialOpen: js.UndefOr[Boolean] = js.native
  var onToggle: js.UndefOr[js.Function0[Unit]] = js.native
  var opened: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
}

object Props {
  @scala.inline
  def apply(colorSettings: js.Array[ColorSetting]): Props = {
    val __obj = js.Dynamic.literal(colorSettings = colorSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setColorSettingsVarargs(value: ColorSetting*): Self = this.set("colorSettings", js.Array(value :_*))
    @scala.inline
    def setColorSettings(value: js.Array[ColorSetting]): Self = this.set("colorSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: js.Any): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisableCustomColors(value: Boolean): Self = this.set("disableCustomColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableCustomColors: Self = this.set("disableCustomColors", js.undefined)
    @scala.inline
    def setIcon(value: IconType[js.Object]): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setInitialOpen(value: Boolean): Self = this.set("initialOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialOpen: Self = this.set("initialOpen", js.undefined)
    @scala.inline
    def setOnToggle(value: () => Unit): Self = this.set("onToggle", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnToggle: Self = this.set("onToggle", js.undefined)
    @scala.inline
    def setOpened(value: Boolean): Self = this.set("opened", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpened: Self = this.set("opened", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

