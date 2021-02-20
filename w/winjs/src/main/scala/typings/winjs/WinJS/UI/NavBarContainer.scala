package typings.winjs.WinJS.UI

import typings.std.CustomEvent
import typings.std.HTMLElement
import typings.winjs.WinJS.Binding.List
import typings.winjs.WinJS.Binding.Template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a group of NavBarCommand objects in a NavBar.
  **/
@js.native
trait NavBarContainer extends StObject {
  
  //#endregion Events
  //#region Methods
  /**
    * Registers an event handler for the specified event.
    * @param eventName The name of the event to handle. Note that you drop the "on" when specifying the event name. For example, instead of specifying "onclick", you specify "click".
    * @param eventHandler The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(eventName: String, eventHandler: js.Function): Unit = js.native
  def addEventListener(eventName: String, eventHandler: js.Function, useCapture: Boolean): Unit = js.native
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the index of the current item.
    **/
  var currentIndex: Double = js.native
  
  /**
    * Gets or sets a WinJS.Binding.List that generates NavBarCommand objects.
    **/
  var data: List[NavBarCommand] = js.native
  
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = js.native
  
  /**
    * Releases resources held by this NavBarCommand. Call this method when the NavBarCommand is no longer needed. After calling this method, the NavBarCommand becomes unusable.
    **/
  def dispose(): Unit = js.native
  
  /**
    * Gets the HTML element that hosts this NavBarContainer.
    **/
  var element: HTMLElement = js.native
  
  /**
    * Gets or sets a value that specifies whether NavBarCommand objects in this container use a fixed or dynamic width.
    **/
  var fixedSize: Boolean = js.native
  
  /**
    * Forces the NavBarContainer to update its layout. Use this function when making the NavBarContainer visible again after you set its style.display property to "none".
    **/
  def forceLayout(): Unit = js.native
  
  /**
    * Gets or sets a value that specifies whether the NavBarContainer has a horizontal or vertical layout.
    **/
  var layout: Orientation = js.native
  
  /**
    * Gets or sets a value that specifies how many rows of navigation commands to display on a page.
    **/
  var maxRows: Double = js.native
  
  //#endregion Constructors
  //#region Events
  /**
    * Occurs when a child NavBarCommand object's click event fires.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.index, detail.navbarcommand, detail.data.
    **/
  def oninvoked(eventInfo: CustomEvent[_]): Unit = js.native
  
  /**
    * Occurs when the split button of a child NavBarCommand is opened or closed. A split button is toggled when the user navigates to another page or opens another split button.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.opened, detail.index, detail.navbarcommand, detail.data.
    **/
  def onsplittoggle(eventInfo: CustomEvent[_]): Unit = js.native
  
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param eventName The name of the event that the event handler is registered for.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: String, eventCallback: js.Function): Unit = js.native
  def removeEventListener(eventName: String, eventCallback: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Gets or sets the WinJS.Binding.Template or templating function that creates the DOM elements for each item in the data source. Each item can contain multiple elements, but it must have a single root element.
    **/
  var template: Template = js.native
}
