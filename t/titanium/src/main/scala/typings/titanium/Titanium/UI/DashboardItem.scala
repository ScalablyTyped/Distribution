package typings.titanium.Titanium.UI

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Proxy
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.delete
import typings.titanium.titaniumStrings.move
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A dashboard item is a view that is displayed as an icon in a <Titanium.UI.DashboardView>.
  */
@js.native
trait DashboardItem extends Proxy {
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_click(
    name: click,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DashboardItemClickEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_delete(
    name: delete,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DashboardItemDeleteEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_move(
    name: move,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DashboardItemMoveEvent, Unit]
  ): Unit = js.native
  
  /**
    * Integer value displayed in a badge.
    */
  var badge: Double = js.native
  
  /**
    * Determines whether this item can be deleted when it edit mode.
    */
  var canDelete: Boolean = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_click(name: click): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: DashboardItemClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_delete(name: delete): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_delete(name: delete, event: DashboardItemDeleteEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_move(name: move): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_move(name: move, event: DashboardItemMoveEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.DashboardItem.badge> property.
    * @deprecated Access <Titanium.UI.DashboardItem.badge> instead.
    */
  def getBadge(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.DashboardItem.canDelete> property.
    * @deprecated Access <Titanium.UI.DashboardItem.canDelete> instead.
    */
  def getCanDelete(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.DashboardItem.image> property.
    * @deprecated Access <Titanium.UI.DashboardItem.image> instead.
    */
  def getImage(): String | Blob = js.native
  
  /**
    * Gets the value of the <Titanium.UI.DashboardItem.selectedImage> property.
    * @deprecated Access <Titanium.UI.DashboardItem.selectedImage> instead.
    */
  def getSelectedImage(): String | Blob = js.native
  
  /**
    * Image or path to image to display in the item by default.
    */
  var image: String | Blob = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_click(
    name: click,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DashboardItemClickEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_delete(
    name: delete,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DashboardItemDeleteEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_move(
    name: move,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DashboardItemMoveEvent, Unit]
  ): Unit = js.native
  
  /**
    * Image or path to image to display in the item as it is selected.
    */
  var selectedImage: String | Blob = js.native
  
  /**
    * Sets the value of the <Titanium.UI.DashboardItem.badge> property.
    * @deprecated Set the value using <Titanium.UI.DashboardItem.badge> instead.
    */
  def setBadge(badge: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.DashboardItem.canDelete> property.
    * @deprecated Set the value using <Titanium.UI.DashboardItem.canDelete> instead.
    */
  def setCanDelete(canDelete: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.DashboardItem.image> property.
    * @deprecated Set the value using <Titanium.UI.DashboardItem.image> instead.
    */
  def setImage(image: String): Unit = js.native
  def setImage(image: Blob): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.DashboardItem.selectedImage> property.
    * @deprecated Set the value using <Titanium.UI.DashboardItem.selectedImage> instead.
    */
  def setSelectedImage(selectedImage: String): Unit = js.native
  def setSelectedImage(selectedImage: Blob): Unit = js.native
}
