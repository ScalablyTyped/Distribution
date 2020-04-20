package typings.tabris.mod

import typings.tabris.AnonInstantiableU
import typings.tabris.OmitNavigationViewPageAct
import typings.tabris.tabrisStrings.actionColor
import typings.tabris.tabrisStrings.actionTextColor
import typings.tabris.tabrisStrings.default
import typings.tabris.tabrisStrings.drawerActionVisible
import typings.tabris.tabrisStrings.none
import typings.tabris.tabrisStrings.pageAnimation
import typings.tabris.tabrisStrings.titleTextColor
import typings.tabris.tabrisStrings.toolbarColor
import typings.tabris.tabrisStrings.toolbarHeight
import typings.tabris.tabrisStrings.toolbarVisible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "NavigationView")
@js.native
class NavigationView[PageType /* <: Page */, ActionType /* <: Action */] () extends Composite[PageType | ActionType] {
  def this(properties: Properties[NavigationView[Page, Action], OmitNavigationViewPageAct[PageType, ActionType]]) = this()
  /**
    * The color used for action icons.
    */
  var actionColor: ColorValue = js.native
  /**
    * The color used for action texts. Only applied on Android, IOS uses the `actionColor` to colorize the
    * action text.
    */
  var actionTextColor: ColorValue = js.native
  /**
    * Whether to display the so-called "Burger menu" to open the drawer.
    */
  var drawerActionVisible: Boolean = js.native
  /**
    * Fired when the [*actionColor*](#actionColor) property has changed.
    */
  var onActionColorChanged: ChangeListeners[this.type, actionColor] = js.native
  /**
    * Fired when the [*actionTextColor*](#actionTextColor) property has changed.
    */
  var onActionTextColorChanged: ChangeListeners[this.type, actionTextColor] = js.native
  /**
    * Fired when the [*drawerActionVisible*](#drawerActionVisible) property has changed.
    */
  var onDrawerActionVisibleChanged: ChangeListeners[this.type, drawerActionVisible] = js.native
  /**
    * Fired when the [*pageAnimation*](#pageAnimation) property has changed.
    */
  var onPageAnimationChanged: ChangeListeners[this.type, pageAnimation] = js.native
  /**
    * Fired when the [*titleTextColor*](#titleTextColor) property has changed.
    */
  var onTitleTextColorChanged: ChangeListeners[this.type, titleTextColor] = js.native
  /**
    * Fired when the [*toolbarColor*](#toolbarColor) property has changed.
    */
  var onToolbarColorChanged: ChangeListeners[this.type, toolbarColor] = js.native
  /**
    * Fired when the height of the toolbar changes, e.g. if it changes visibility.
    */
  var onToolbarHeightChanged: ChangeListeners[this.type, toolbarHeight] = js.native
  /**
    * Fired when the [*toolbarVisible*](#toolbarVisible) property has changed.
    */
  var onToolbarVisibleChanged: ChangeListeners[this.type, toolbarVisible] = js.native
  /**
    * Controls what animation to use when animating a page transition.
    */
  var pageAnimation: default | none = js.native
  /**
    * The text color used for page titles.
    */
  var titleTextColor: ColorValue = js.native
  /**
    * The background color of the toolbar.
    */
  var toolbarColor: ColorValue = js.native
  /**
    * The height of the toolbar. Is 0 if not visible.
    */
  var toolbarHeight: Double = js.native
  /**
    * Whether the toolbar is visible.
    */
  var toolbarVisible: Boolean = js.native
  /**
    * Returns the ordered list of pages on the page stack, with the bottommost page as the first and the
    * topmost page as the last element. Same as children(), but only returns children that are of type
    * `Page`.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  def pages(): WidgetCollection[PageType] = js.native
  def pages(selector: Selector[Widget, Widget]): WidgetCollection[PageType] = js.native
  /**
    * Returns the ordered list of pages on the page stack, with the bottommost page as the first and the
    * topmost page as the last element. Same as children(), but only accepts subclasses of `Page`.
    * @param constructor A class to filter the results.
    */
  def pages[U /* <: Page */](constructor: AnonInstantiableU[U]): WidgetCollection[U] = js.native
}

