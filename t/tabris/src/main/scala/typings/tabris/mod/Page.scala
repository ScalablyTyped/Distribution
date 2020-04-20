package typings.tabris.mod

import typings.tabris.OmitPageset
import typings.tabris.tabrisStrings.autoDispose
import typings.tabris.tabrisStrings.image
import typings.tabris.tabrisStrings.title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Page")
@js.native
class Page () extends Composite[Widget] {
  def this(properties: Properties[Page, OmitPageset]) = this()
  /**
    * Defines whether this page will be automatically disposed when popped from the NavigationView, e.g.
    * using native back navigation.
    */
  var autoDispose: Boolean = js.native
  /**
    * An image to be displayed in the navigation bar
    */
  var image: ImageValue = js.native
  /**
    * Fired when the page is about to become visible, i.e. it has become the active page.
    */
  var onAppear: Listeners[EventObject[this.type]] = js.native
  /**
    * Fired when the [*autoDispose*](#autoDispose) property has changed.
    */
  var onAutoDisposeChanged: ChangeListeners[this.type, autoDispose] = js.native
  /**
    * Fired when the page is no longer visible, i.e. another page has become the active page.
    */
  var onDisappear: Listeners[EventObject[this.type]] = js.native
  /**
    * Fired when the [*image*](#image) property has changed.
    */
  var onImageChanged: ChangeListeners[this.type, image] = js.native
  /**
    * Fired when the [*title*](#title) property has changed.
    */
  var onTitleChanged: ChangeListeners[this.type, title] = js.native
  /**
    * The page title to be displayed in the navigation bar.
    */
  var title: String = js.native
  /**
    * Appends this widget to the given `NavigationView` instance.
    * @param parent
    */
  def appendTo(parent: NavigationView[Page, Action]): this.type = js.native
  /**
    * Inserts this widget directly after the given `Action`.
    * @param widget
    */
  def insertAfter(widget: Page): this.type = js.native
  /**
    * Inserts this widget directly before the given `Page`.
    * @param widget
    */
  def insertBefore(widget: Page): this.type = js.native
}

