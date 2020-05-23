package typings.winjs.WinJS.UI

import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enables the user to zoom between two different views supplied by two child controls. One child control supplies the zoomed-out view and the other provides the zoomed-in view.
  **/
@js.native
trait SemanticZoom extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * Gets the DOM element that hosts the SemanticZoom control.
    **/
  var element: HTMLElement = js.native
  /**
    * Gets or a sets a value that specifies whether to display the SemanticZoom zoom out button.
    **/
  var enableButton: Boolean = js.native
  /**
    * Gets or sets a value that indicates whether SemanticZoom is locked and zooming between views is disabled.
    **/
  var locked: Boolean = js.native
  /**
    * Gets or sets a value that specifies how much the scaling the cross-fade animation performs when the SemanticZoom transitions between views.
    **/
  var zoomFactor: Double = js.native
  /**
    * Gets or sets a value that indicates whether the control is zoomed out.
    **/
  var zoomedOut: Boolean = js.native
  //#endregion Events
  //#region Methods
  /**
    * Registers an event handler for the specified event.
    * @param eventName The name of the event to handle.
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
    * Releases resources held by this SemanticZoom. Call this method when the SemanticZoom is no longer needed. After calling this method, the SemanticZoom becomes unusable.
    **/
  def dispose(): Unit = js.native
  /**
    * Forces the SemanticZoom to update its layout. Use this function when making the SemanticZoom visible again after its style.display property had been set to "none".
    **/
  def forceLayout(): Unit = js.native
  //#endregion Constructors
  //#region Events
  /**
    * Occurs when the control zooms in or out.
    * @param eventInfo An object that contains information about the event. The detail property of this object is true when the control is zoomed out. Otherwise, it's false.
    **/
  def onzoomchanged(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * Unregisters an event handler for the specified event.
    * @param eventName The name of the event that the event handler is registered for.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: String, eventCallback: js.Function): Unit = js.native
  def removeEventListener(eventName: String, eventCallback: js.Function, useCapture: Boolean): Unit = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def setTimeoutAfterTTFF(callback: js.Function, delay: Double): Unit = js.native
  /**
    * Gets or sets a mapping function which can be used to change the item that is targeted on zoom in.
    **/
  def zoomedInItem(any: js.Any): js.Any = js.native
  /**
    * Gets or sets a mapping function which can be used to change the item that is targeted on zoom out.
    **/
  def zoomedOutItem(any: js.Any): js.Any = js.native
}

