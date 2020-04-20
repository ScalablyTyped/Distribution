package typings.tabris.mod

import typings.tabris.OmitTabset
import typings.tabris.tabrisStrings.badge
import typings.tabris.tabrisStrings.badgeColor
import typings.tabris.tabrisStrings.image
import typings.tabris.tabrisStrings.selectedImage
import typings.tabris.tabrisStrings.title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Tab")
@js.native
class Tab () extends Composite[Widget] {
  def this(properties: Properties[Tab, OmitTabset]) = this()
  /**
    * A badge to attach on the tab. The property only has an effect when the parent `TabFolder` has its
    * `tabBarLocation` set to `bottom`. Setting the `badge` to `0` hides the badge. The background color of
    * the badge can be controlled with the `badgeColor` property.
    */
  var badge: Double = js.native
  /**
    * The background color used for the `badge` indicator.
    */
  var badgeColor: ColorValue = js.native
  /**
    * An image to be displayed on the tab.  Will not be shown on iOS if the `TabFolder`'s `tabBarLocation`
    * is set to `top`
    */
  var image: ImageValue = js.native
  /**
    * Fired when the tab will become visible, i.e. the selection of its TabFolder.
    */
  var onAppear: Listeners[EventObject[this.type]] = js.native
  /**
    * Fired when the [*badge*](#badge) property has changed.
    */
  var onBadgeChanged: ChangeListeners[this.type, badge] = js.native
  /**
    * Fired when the [*badgeColor*](#badgeColor) property has changed.
    */
  var onBadgeColorChanged: ChangeListeners[this.type, badgeColor] = js.native
  /**
    * Fired when the tab is no longer visible, i.e. it no longer is the selection of its TabFolder.
    */
  var onDisappear: Listeners[EventObject[this.type]] = js.native
  /**
    * Fired when the [*image*](#image) property has changed.
    */
  var onImageChanged: ChangeListeners[this.type, image] = js.native
  /**
    * Fired when the tab is tapped by the user while it is already visible.
    */
  var onReselect: Listeners[EventObject[this.type]] = js.native
  /**
    * Fired when the tab is tapped by the user. The event is fired either when the tab is first selected or
    * when it is already visible and tapped.
    */
  var onSelect: Listeners[EventObject[this.type]] = js.native
  /**
    * Fired when the [*selectedImage*](#selectedImage) property has changed.
    */
  var onSelectedImageChanged: ChangeListeners[this.type, selectedImage] = js.native
  /**
    * Fired when the [*title*](#title) property has changed.
    */
  var onTitleChanged: ChangeListeners[this.type, title] = js.native
  /**
    * An image to be displayed on the currently active tab.
    */
  var selectedImage: ImageValue = js.native
  /**
    * The title to be displayed on the tab.
    */
  var title: String = js.native
  /**
    * Appends this widget to the given `TabFolder` instance.
    * @param parent
    */
  def appendTo(parent: TabFolder[Tab]): this.type = js.native
  /**
    * Inserts this widget directly after the given `Tab`.
    * @param widget
    */
  def insertAfter(widget: Tab): this.type = js.native
  /**
    * Inserts this widget directly before the given `Tab`.
    * @param widget
    */
  def insertBefore(widget: Tab): this.type = js.native
}

