package typings.wordpressBlockEditor.panelColorSettingsMod.PanelColorSettings

import typings.wordpressComponents.iconMod.Icon.IconType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<@wordpress/components.@wordpress/components.PanelBody.Props, 'children'> */
trait Props extends js.Object {
  var className: js.UndefOr[js.Any] = js.undefined
  var colorSettings: js.Array[ColorSetting]
  var disableCustomColors: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[IconType[js.Object]] = js.undefined
  var initialOpen: js.UndefOr[Boolean] = js.undefined
  var onToggle: js.UndefOr[js.Function0[Unit]] = js.undefined
  var opened: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    colorSettings: js.Array[ColorSetting],
    className: js.Any = null,
    disableCustomColors: js.UndefOr[Boolean] = js.undefined,
    icon: IconType[js.Object] = null,
    initialOpen: js.UndefOr[Boolean] = js.undefined,
    onToggle: () => Unit = null,
    opened: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): Props = {
    val __obj = js.Dynamic.literal(colorSettings = colorSettings.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCustomColors)) __obj.updateDynamic("disableCustomColors")(disableCustomColors.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(initialOpen)) __obj.updateDynamic("initialOpen")(initialOpen.get.asInstanceOf[js.Any])
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction0(onToggle))
    if (!js.isUndefined(opened)) __obj.updateDynamic("opened")(opened.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

