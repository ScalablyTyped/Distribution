package typings.tabris.mod

import typings.tabris.AnonChildrenString
import typings.tabris.OmitActionset
import typings.tabris.tabrisStrings.default
import typings.tabris.tabrisStrings.image
import typings.tabris.tabrisStrings.navigation
import typings.tabris.tabrisStrings.overflow
import typings.tabris.tabrisStrings.placement
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Action")
@js.native
class Action () extends Widget {
  def this(properties: Properties[Action, OmitActionset]) = this()
  /**
    * Icon image for the action.
    * On iOS the `image` is tinted with the apps default accent color whereas on Android the `image` is
    * shown as is. When an action is placed into a `NavigationView`, the `NavigationView` property
    * `actionColor` can be used to adjust the action tint color.
    */
  var image: ImageValue = js.native
  /**
    * @constant
    */
  @JSName("jsxAttributes")
  val jsxAttributes_Action: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) with AnonChildrenString = js.native
  /**
    * Fired when the [*image*](#image) property has changed.
    */
  var onImageChanged: ChangeListeners[this.type, image] = js.native
  /**
    * Fired when the [*placement*](#placement) property has changed.
    */
  var onPlacementChanged: ChangeListeners[this.type, placement] = js.native
  /**
    * Fired when the action is invoked.
    */
  var onSelect: Listeners[EventObject[this.type]] = js.native
  /**
    * Fired when the [*title*](#title) property has changed.
    */
  var onTitleChanged: ChangeListeners[this.type, title] = js.native
  /**
    * Actions with 'default' placement will be visible in the toolbar if enough space is available,
    * otherwise moved to the overflow section. Setting the property to 'overflow' makes the action appear
    * there exclusively. Lastly, 'navigation' puts the action in the position normally occupied by the
    * drawer/back button. When 'navigation' is used, only the `Action` image will be shown. If multiple
    * actions have this value only the first one is displayed.
    */
  var placement: default | navigation | overflow = js.native
  /**
    * The text to be displayed for the action.
    * When an action is placed into a `NavigationView`, the `NavigationView` property `actionTextColor` can
    * be used to adjust the action title color on Android.
    */
  var title: String = js.native
  /**
    * Appends this widget to the given `NavigationView` instance.
    * @param parent
    */
  def appendTo(parent: NavigationView[Page, Action]): this.type = js.native
  /**
    * Inserts this widget directly after the given Action.
    * @param widget
    */
  def insertAfter(widget: Action): this.type = js.native
  /**
    * Inserts this widget directly before the given Action.
    * @param widget
    */
  def insertBefore(widget: Action): this.type = js.native
}

