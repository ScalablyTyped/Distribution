package typings.titanium.Titanium.UI.iOS

import typings.titanium.AnimatedOptions
import typings.titanium.MenuPopupShowParams
import typings.titanium.Titanium.Proxy
import typings.titanium.titaniumStrings.click
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A menu popup provides the ability to create custom tooltip options using the `items` property
  * covering the native `UIMenuController` class.
  * See also:
  * * [iOS Developer Library: UIMenuController](https://developer.apple.com/documentation/uikit/uimenucontroller)
  */
@js.native
trait MenuPopup extends Proxy {
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_click(
    name: click,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ MenuPopupClickEvent, Unit]
  ): Unit = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_click(name: click): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: MenuPopupClickEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.MenuPopup.items> property.
    * @deprecated Access <Titanium.UI.iOS.MenuPopup.items> instead.
    */
  def getItems(): js.Array[String] = js.native
  
  /**
    * Hides the menu popup.
    */
  def hide(): Unit = js.native
  def hide(options: AnimatedOptions): Unit = js.native
  
  /**
    * Indicates whether the menu popup is currently visible.
    */
  def isVisible(): Unit = js.native
  
  /**
    * The items of the menu popup.
    */
  var items: js.Array[String] = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_click(
    name: click,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ MenuPopupClickEvent, Unit]
  ): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.MenuPopup.items> property.
    * @deprecated Set the value using <Titanium.UI.iOS.MenuPopup.items> instead.
    */
  def setItems(items: js.Array[String]): Unit = js.native
  
  /**
    * Shows the menu popup.
    */
  def show(options: MenuPopupShowParams): Unit = js.native
}
