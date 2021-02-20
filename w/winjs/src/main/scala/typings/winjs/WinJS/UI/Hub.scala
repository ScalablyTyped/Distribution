package typings.winjs.WinJS.UI

import typings.std.CustomEvent
import typings.std.HTMLElement
import typings.winjs.WinJS.Binding.List
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a hub navigation pattern consisting of sections that can be navigated to. Each section is defined by a HubSection object.
  **/
@js.native
trait Hub extends StObject {
  
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
  
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = js.native
  
  /**
    * Releases resources held by this Hub. Call this method when the Hub is no longer needed. After calling this method, the Hub becomes unusable.
    **/
  def dispose(): Unit = js.native
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets the DOM element that hosts the Hub control.
    **/
  var element: HTMLElement = js.native
  
  /**
    * Forces the Hub to update its layout.
    * Use this function when making the Hub visible again after you've set its style.display property to "none” or after style changes have been made that affect the size of the HubSections.
    **/
  def forceLayout(): Unit = js.native
  
  /**
    * Gets or sets the Template or templating function that creates the DOM elements for each HubSection header. Your HubSection object should provide strings for HubSection.header property.
    **/
  var headerTemplate: js.Any = js.native
  
  /**
    * Gets or sets the index of the first HubSection at least partially in view. This property is useful for animating the visible content in the Hub.
    **/
  var indexOfFirstVisible: Double = js.native
  
  /**
    * Gets or sets the index of last HubSection at least partially in view. Used for animating the visible content in the Hub.
    **/
  var indexOfLastVisible: Double = js.native
  
  /**
    * Gets a value that indicates whether the hub is still loading or whether loading is complete. The value changes to complete after all the sections and content inside them has loaded.
    **/
  var loadingState: String = js.native
  
  //#endregion Constructors
  //#region Events
  /**
    * Raised when the Hub is about to play entrance, content transition, insert, or remove animations.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.type, detail.index, detail.section.
    **/
  def oncontentanimating(eventInfo: CustomEvent[_]): Unit = js.native
  
  /**
    * Raised when the user clicks on an interactive header.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.index, detail.section.
    **/
  def onheaderinvoked(eventInfo: CustomEvent[_]): Unit = js.native
  
  /**
    * Raised when the Hub control's loadingState changes.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: loadingState.
    **/
  def onloadingstatechanged(eventInfo: CustomEvent[_]): Unit = js.native
  
  /**
    * Gets or sets the orientation of sections within the Hub.
    **/
  var orientation: Orientation = js.native
  
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param eventName The name of the event that the event handler is registered for.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: String, eventCallback: js.Function): Unit = js.native
  def removeEventListener(eventName: String, eventCallback: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Gets or sets the distance between the start of the Hub and the current viewable area.
    **/
  var scrollPosition: Double = js.native
  
  /**
    * Gets or sets the index of the first visible HubSection.
    **/
  var sectionOnScreen: Double = js.native
  
  /**
    * Gets or sets the List that contains the HubSection objects that belong to this Hub.
    **/
  var sections: List[HubSection] = js.native
  
  /**
    * This API supports the SemanticZoom infrastructure and is not intended to be used directly from your code.
    **/
  var zoomableView: IZoomableView[_] = js.native
}
