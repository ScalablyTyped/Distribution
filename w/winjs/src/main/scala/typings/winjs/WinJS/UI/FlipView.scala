package typings.winjs.WinJS.UI

import typings.std.CustomEvent
import typings.std.Event
import typings.std.HTMLElement
import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Displays a collection, such as a set of photos, one item at a time.
  **/
@js.native
trait FlipView[T] extends js.Object {
  
  //#endregion Events
  //#region Methods
  /**
    * Registers an event handler for the specified event.
    * @param eventName The name of the event to handle. For a list of events, see the FlipView object page.
    * @param eventHandler The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(eventName: String, eventHandler: js.Function): Unit = js.native
  def addEventListener(eventName: String, eventHandler: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Returns the number of items in the FlipView control's itemDataSource.
    * @returns A Promise that contains the number of items in the list or WinJS.UI.CountResult.unknown if the count is unavailable.
    **/
  def count(): Promise[Double] = js.native
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the index of the currently displayed page.
    **/
  var currentPage: Double = js.native
  
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = js.native
  
  /**
    * Releases resources held by this FlipView. Call this method when the FlipView is no longer needed. After calling this method, the FlipView becomes unusable.
    **/
  def dispose(): Unit = js.native
  
  /**
    * Gets the HTML element that hosts this FlipView.
    **/
  var element: HTMLElement = js.native
  
  /**
    * Forces the FlipView to update its layout. Use this function when making the FlipView visible again after its style.display property had been set to "none".
    **/
  def forceLayout(): Unit = js.native
  
  /**
    * Gets or sets the data source that provides the FlipView with items to display. The FlipView displays one item at a time, on its own page.
    **/
  var itemDataSource: IListDataSource[T] = js.native
  
  /**
    * Gets or sets the spacing between each item, in pixels.
    **/
  var itemSpacing: Double = js.native
  
  /**
    * Gets or sets a Template or function that defines the HTML for each item's page.
    **/
  var itemTemplate: js.Any = js.native
  
  /**
    * Navigates to the next page.
    * @returns true if the FlipView begins navigating to the next page; false if the FlipView is already at the last item or is in the middle of another navigation animation.
    **/
  def next(): Boolean = js.native
  
  //#endregion Constructors
  //#region Events
  /**
    * Occurs when the datasource count changes.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: source.
    **/
  def ondatasourcecountchanged(eventInfo: Event): Unit = js.native
  
  /**
    * Raised when the FlipView flips to a page and its renderer function completes.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.source.
    **/
  def onpagecompleted(eventInfo: CustomEvent[_]): Unit = js.native
  
  /**
    * Raised when the FlipView flips to a page.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.source.
    **/
  def onpageselected(eventInfo: CustomEvent[_]): Unit = js.native
  
  /**
    * Occurs when an item becomes invisible or visible.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.source, detail.visible.
    **/
  def onpagevisibilitychanged(eventInfo: CustomEvent[_]): Unit = js.native
  
  /**
    * Gets or sets the orientation of the FlipView, horizontal or vertical.
    **/
  var orientation: String = js.native
  
  /**
    * Navigates to the previous item.
    * @returns true if the FlipView begins navigating to the previous page; nfalse if the FlipView is already at the first page or is in the middle of another navigation animation.
    **/
  def previous(): Boolean = js.native
  
  /**
    * Unregisters an event handler for the specified event.
    * @param eventName The name of the event.
    * @param eventHandler The event handler function to remove.
    * @param useCapture Set to true to unregister the event handler for the capturing phase; otherwise, set to false to unregister the event handler for the bubbling phase.
    **/
  def removeEventListener(eventName: String, eventHandler: js.Function): Unit = js.native
  def removeEventListener(eventName: String, eventHandler: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Sets custom animations for the FlipView to use when navigating between pages.
    * @param animations An object that contains up to three fields, one for each navigation action: next, previous, and jump. Each of those fields must be a function with this signature: function (outgoingPage, incomingPage) Each function must return a WinJS.Promise that completes once the animations are finished. If a field is null or undefined, the FlipView reverts to its default animation for that action.
    **/
  def setCustomAnimations(animations: js.Any): Unit = js.native
}
