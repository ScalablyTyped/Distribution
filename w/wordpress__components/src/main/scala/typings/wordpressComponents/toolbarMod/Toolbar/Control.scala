package typings.wordpressComponents.toolbarMod.Toolbar

import typings.react.mod.ReactNode
import typings.wordpressComponents.anon.PartialProps
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import typings.wordpressComponents.shortcutMod.Shortcut.ShortcutType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @wordpress/components.@wordpress/components/toolbar-button.default.Props */
trait Control extends js.Object {
  /**
    * Anything to add into the containing element after the button.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  /**
    * `className` for the button element.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * `className` for the container.
    */
  var containerClassName: js.UndefOr[String] = js.undefined
  /**
    * Any additional props to pass down to `IconButton`.
    */
  var extraProps: js.UndefOr[PartialProps] = js.undefined
  /**
    * Dashicon icon slug.
    */
  var icon: Icon
  /**
    * Describes whether or not the button is active.
    */
  var isActive: js.UndefOr[Boolean] = js.undefined
  /**
    * Describes whether or not the control is disabled.
    */
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  var shortcut: js.UndefOr[ShortcutType] = js.undefined
  /**
    * Subscript text to add to the button.
    */
  var subscript: js.UndefOr[String] = js.undefined
  /**
    * Human-readable title for the control.
    */
  var title: String
  /**
    * Function to invoke when the option is selected.
    */
  def onClick(): Unit
}

object Control {
  @scala.inline
  def apply(
    icon: Icon,
    onClick: () => Unit,
    title: String,
    children: ReactNode = null,
    className: String = null,
    containerClassName: String = null,
    extraProps: PartialProps = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    shortcut: ShortcutType = null,
    subscript: String = null
  ): Control = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), title = title.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.get.asInstanceOf[js.Any])
    if (shortcut != null) __obj.updateDynamic("shortcut")(shortcut.asInstanceOf[js.Any])
    if (subscript != null) __obj.updateDynamic("subscript")(subscript.asInstanceOf[js.Any])
    __obj.asInstanceOf[Control]
  }
}

