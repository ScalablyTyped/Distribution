package typings.wordpressComponents.panelBodyMod.PanelBody

import typings.react.mod.ReactNode
import typings.wordpressComponents.iconMod.Icon.IconType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactNode
  /**
    * The class that will be added with `components-panel__body`, if the
    * panel is currently open, the `is-opened` class will also be passed
    * to the classes of the wrapper div. If no `className` is passed then
    * only `components-panel__body` and `is-opened` is used.
    */
  var className: js.UndefOr[js.Any] = js.undefined
  /**
    * An icon to be shown next to the `PanelBody` title.
    */
  var icon: js.UndefOr[IconType[js.Object]] = js.undefined
  /**
    * Whether or not the panel will start open.
    * @defaultValue true
    */
  var initialOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * A function that is called when the user clicks on the `PanelBody`
    * title after the open state is changed.
    */
  var onToggle: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * If opened is true then the `Panel` will remain open regardless of
    * the `initialOpen` prop and the panel will be prevented from being
    * closed.
    */
  var opened: js.UndefOr[Boolean] = js.undefined
  /**
    * Title of the `PanelBody`. This shows even when it is closed.
    */
  var title: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: ReactNode = null,
    className: js.Any = null,
    icon: IconType[js.Object] = null,
    initialOpen: js.UndefOr[Boolean] = js.undefined,
    onToggle: () => Unit = null,
    opened: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(initialOpen)) __obj.updateDynamic("initialOpen")(initialOpen.get.asInstanceOf[js.Any])
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction0(onToggle))
    if (!js.isUndefined(opened)) __obj.updateDynamic("opened")(opened.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

