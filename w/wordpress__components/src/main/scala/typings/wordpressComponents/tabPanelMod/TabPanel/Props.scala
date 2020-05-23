package typings.wordpressComponents.tabPanelMod.TabPanel

import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.wordpressComponentsStrings.horizontal
import typings.wordpressComponents.wordpressComponentsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * The class to add to the active tab.
    * @defaultValue "is-active"
    */
  var activeClass: js.UndefOr[String] = js.undefined
  /**
    * The class to give to the outer container for the `TabPanel`.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Optionally provide a tab name for a tab to be selected upon mounting
    * of component. If this prop is not set, the first tab will be
    * selected by default.
    */
  var initialTabName: js.UndefOr[String] = js.undefined
  /**
    * The function called when a tab has been selected. It is passed the
    * `tabName` as an argument.
    */
  var onSelect: js.UndefOr[js.Function1[/* tabName */ String, Unit]] = js.undefined
  /**
    * The orientation of the tablist.
    * @defaultValue "horizontal"
    */
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  var tabs: js.Array[Tab]
  /**
    * A function which renders the tabviews given the selected tab. The
    * function is passed the active tab object as an argument as defined
    * the the tabs prop. The element to which the tooltip should anchor.
    */
  def children(tab: Tab): Element
}

object Props {
  @scala.inline
  def apply(
    children: Tab => Element,
    tabs: js.Array[Tab],
    activeClass: String = null,
    className: String = null,
    initialTabName: String = null,
    onSelect: /* tabName */ String => Unit = null,
    orientation: horizontal | vertical = null
  ): Props = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), tabs = tabs.asInstanceOf[js.Any])
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (initialTabName != null) __obj.updateDynamic("initialTabName")(initialTabName.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

