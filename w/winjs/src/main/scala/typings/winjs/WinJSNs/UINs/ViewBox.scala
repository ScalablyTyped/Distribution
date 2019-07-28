package typings.winjs.WinJSNs.UINs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Scales a single child element to fill the available space without resizing it. This control reacts to changes in the size of the container as well as changes in size of the child element. For example, a media query may result in a change in aspect ratio.
  **/
@JSGlobal("WinJS.UI.ViewBox")
@js.native
//#region Constructors
/**
  * Initializes a new instance of the ViewBox control.
  * @constructor
  * @param element The DOM element that functions as the scaling box. This element fills 100% of the width and height allotted to it.
  * @param options The set of options to be applied initially to the ViewBox control. There are currently no options on this control, and any options included in this parameter are ignored.
  **/
class ViewBox () extends js.Object {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
  //#endregion Methods
  //#region Properties
  /**
    * Gets the DOM element that functions as the scaling box.
    **/
  var element: HTMLElement = js.native
  //#endregion Constructors
  //#region Methods
  /**
    * Adds an event handler for the specified event.
    * @param eventName The name of the event to handle.
    * @param eventHandler The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(eventName: String, eventHandler: js.Function): Unit = js.native
  def addEventListener(eventName: String, eventHandler: js.Function, useCapture: Boolean): Unit = js.native
  /**
    * Raises an event of the specified type and with additional properties.
    * @param eventName The name of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(eventName: String, eventProperties: js.Any): Boolean = js.native
  /**
    * Releases resources held by this ViewBox. Call this method when the ViewBox is no longer needed. After calling this method, the ViewBox becomes unusable.
    **/
  def dispose(): Unit = js.native
  /**
    * Forces the ViewBox to update its layout. Use this function when making the ViewBox visible again after its style.display property had been set to "none".
    **/
  def forceLayout(): Unit = js.native
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param eventName The name of the event that the event handler is registered for.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: String, eventCallback: js.Function): Unit = js.native
  def removeEventListener(eventName: String, eventCallback: js.Function, useCapture: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("WinJS.UI.ViewBox")
@js.native
object ViewBox extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

