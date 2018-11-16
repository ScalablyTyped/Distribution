package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Creates a hub navigation pattern consisting of sections that can be navigated to. Each section is defined by a HubSection object.
    **/
@JSGlobal("WinJS.UI.Hub")
@js.native
class Hub () extends js.Object {
  //#region Constructors
  /**
           * Creates a new Hub control.
           * @constructor
           * @param element The DOM element that will host the Hub control.
           * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the contentanimating event, add a property named "oncontentanimating" to the options object and set its value to the event handler.
          **/
  def this(element: stdLib.HTMLElement) = this()
  //#region Constructors
  /**
           * Creates a new Hub control.
           * @constructor
           * @param element The DOM element that will host the Hub control.
           * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the contentanimating event, add a property named "oncontentanimating" to the options object and set its value to the event handler.
          **/
  def this(element: stdLib.HTMLElement, options: js.Any) = this()
  //#endregion Methods
  //#region Properties
  /**
           * Gets the DOM element that hosts the Hub control.
          **/
  var element: stdLib.HTMLElement = js.native
  /**
           * Gets or sets the Template or templating function that creates the DOM elements for each HubSection header. Your HubSection object should provide strings for HubSection.header property.
          **/
  var headerTemplate: js.Any = js.native
  /**
           * Gets or sets the index of the first HubSection at least partially in view. This property is useful for animating the visible content in the Hub.
          **/
  var indexOfFirstVisible: scala.Double = js.native
  /**
           * Gets or sets the index of last HubSection at least partially in view. Used for animating the visible content in the Hub.
          **/
  var indexOfLastVisible: scala.Double = js.native
  /**
           * Gets a value that indicates whether the hub is still loading or whether loading is complete. The value changes to complete after all the sections and content inside them has loaded.
          **/
  var loadingState: java.lang.String = js.native
  /**
           * Gets or sets the orientation of sections within the Hub.
          **/
  var orientation: Orientation = js.native
  /**
           * Gets or sets the distance between the start of the Hub and the current viewable area.
          **/
  var scrollPosition: scala.Double = js.native
  /**
           * Gets or sets the index of the first visible HubSection.
          **/
  var sectionOnScreen: scala.Double = js.native
  /**
           * Gets or sets the List that contains the HubSection objects that belong to this Hub.
          **/
  var sections: winjsLib.WinJSNs.BindingNs.List[HubSection] = js.native
  /**
           * This API supports the SemanticZoom infrastructure and is not intended to be used directly from your code.
          **/
  var zoomableView: IZoomableView[_] = js.native
  //#endregion Events
  //#region Methods
  /**
           * Registers an event handler for the specified event.
           * @param eventName The name of the event to handle. Note that you drop the "on" when specifying the event name. For example, instead of specifying "onclick", you specify "click".
           * @param eventHandler The event handler function to associate with the event.
           * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
          **/
  def addEventListener(eventName: java.lang.String, eventHandler: js.Function): scala.Unit = js.native
  //#endregion Events
  //#region Methods
  /**
           * Registers an event handler for the specified event.
           * @param eventName The name of the event to handle. Note that you drop the "on" when specifying the event name. For example, instead of specifying "onclick", you specify "click".
           * @param eventHandler The event handler function to associate with the event.
           * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
          **/
  def addEventListener(eventName: java.lang.String, eventHandler: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  /**
           * Raises an event of the specified type and with additional properties.
           * @param type The type (name) of the event.
           * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
           * @returns true if preventDefault was called on the event, otherwise false.
          **/
  def dispatchEvent(`type`: java.lang.String, eventProperties: js.Any): scala.Boolean = js.native
  /**
           * Releases resources held by this Hub. Call this method when the Hub is no longer needed. After calling this method, the Hub becomes unusable.
          **/
  def dispose(): scala.Unit = js.native
  /**
           * Forces the Hub to update its layout.
           * Use this function when making the Hub visible again after you've set its style.display property to "none” or after style changes have been made that affect the size of the HubSections.
          **/
  def forceLayout(): scala.Unit = js.native
  //#endregion Constructors
  //#region Events
  /**
           * Raised when the Hub is about to play entrance, content transition, insert, or remove animations.
           * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.type, detail.index, detail.section.
          **/
  def oncontentanimating(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
           * Raised when the user clicks on an interactive header.
           * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.index, detail.section.
          **/
  def onheaderinvoked(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
           * Raised when the Hub control's loadingState changes.
           * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: loadingState.
          **/
  def onloadingstatechanged(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
           * Removes an event handler that the addEventListener method registered.
           * @param eventName The name of the event that the event handler is registered for.
           * @param eventCallback The event handler function to remove.
           * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
          **/
  def removeEventListener(eventName: java.lang.String, eventCallback: js.Function): scala.Unit = js.native
  /**
           * Removes an event handler that the addEventListener method registered.
           * @param eventName The name of the event that the event handler is registered for.
           * @param eventCallback The event handler function to remove.
           * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
          **/
  def removeEventListener(eventName: java.lang.String, eventCallback: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
}

/**
     * Creates a hub navigation pattern consisting of sections that can be navigated to. Each section is defined by a HubSection object.
    **/
@JSGlobal("WinJS.UI.Hub")
@js.native
object Hub extends js.Object {
  /**
           * Specifies whether the Hub animation is an entrance animation or a transition animation.
          **/
  var AnimationType: winjsLib.Anon_Entrance = js.native
  /**
           * Gets the current loading state of the Hub.
          **/
  var LoadingState: winjsLib.Anon_Loading = js.native
  /**
           * Indicates that the object is compatibile with declarative processing.
          **/
  var supportedForProcessing: scala.Boolean = js.native
}

