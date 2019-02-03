package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Displays lightweight UI that is either information, or requires user interaction. Unlike a dialog, a Flyout can be light dismissed by clicking or tapping off of it.
  **/
@JSGlobal("WinJS.UI.Flyout")
@js.native
//#region Constructors
/**
  * Creates a new Flyout object.
  * @constructor
  * @param element The DOM element that will host the control.
  * @param options The set of properties and values to apply to the new Flyout.
  **/
class Flyout () extends js.Object {
  def this(element: stdLib.HTMLElement) = this()
  def this(element: stdLib.HTMLElement, options: js.Any) = this()
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the default alignment to be used for this Flyout.
    **/
  var alignment: java.lang.String = js.native
  /**
    * Gets or sets the default anchor to be used for this Flyout.
    **/
  var anchor: stdLib.HTMLElement = js.native
  /**
    * Gets or sets a value that indicates whether the Flyout is disabled.
    **/
  var disabled: scala.Boolean = js.native
  /**
    * Gets the DOM element that hosts the Flyout.
    **/
  var element: stdLib.HTMLElement = js.native
  /**
    * Gets a value that indicates whether the Flyout is hidden or in the process of becoming hidden, or sets the Flyout to hide or show itself.
    **/
  var hidden: scala.Boolean = js.native
  /**
    * Gets or sets the default placement to be used for this Flyout.
    **/
  var placement: java.lang.String = js.native
  //#endregion Events
  //#region Methods
  /**
    * Registers an event handler for the specified event.
    * @param type The event type to register. It must be beforeshow, beforehide, aftershow, or afterhide.
    * @param listener The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(eventName: java.lang.String, eventProperties: js.Any): scala.Boolean = js.native
  /**
    * Releases resources held by this object. Call this method when the object is no longer needed. After calling this method, the object becomes unusable.
    **/
  def dispose(): scala.Unit = js.native
  /**
    * Hides the Flyout, if visible, regardless of other states.
    **/
  def hide(): scala.Unit = js.native
  //#endregion Constructors
  //#region Events
  /**
    * Raised immediately after a flyout is fully hidden.
    * @param eventInfo An object that contains information about the event.
    **/
  def onafterhide(eventInfo: stdLib.Event): scala.Unit = js.native
  /**
    * Raised immediately after a flyout is fully shown.
    * @param eventInfo An object that contains information about the event.
    **/
  def onaftershow(eventInfo: stdLib.Event): scala.Unit = js.native
  /**
    * Raised just before hiding a flyout.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforehide(eventInfo: stdLib.Event): scala.Unit = js.native
  /**
    * Raised just before showing a flyout.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeshow(eventInfo: stdLib.Event): scala.Unit = js.native
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param type The event type to unregister. It must be beforeshow, beforehide, aftershow, or afterhide.
    * @param listener The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  /**
    * Shows the Flyout, if hidden, regardless of other states.
    * @param anchor. DOM element to temporarily anchor the position of the Flyout to. This is optional if Flyout.anchor has already been set.
    * @param placement The placement of the Flyout to the anchor: the string literal "top", "bottom", "left", or "right".
    * @param alignment For "top" or "bottom" placement, the alignment of the Flyout to the anchor's edge: the string literal "center", "left", or "right".
    **/
  def show(): scala.Unit = js.native
  def show(anchor: stdLib.HTMLElement): scala.Unit = js.native
  def show(anchor: stdLib.HTMLElement, placement: java.lang.String): scala.Unit = js.native
  def show(anchor: stdLib.HTMLElement, placement: java.lang.String, alignment: java.lang.String): scala.Unit = js.native
  /**
    * Shows the Flyout, if hidden, regardless of other states, top and left aligned at the specified coordinates,
    * @param coordinates Required. The point where the top left corner of the flyout will appear, relative to the top and left edge of the visual viewport.
    **/
  def showAt(coordinates: winjsLib.Anon_X): scala.Unit = js.native
  /**
    * Shows the Flyout, if hidden, regardless of other states, top and left aligned at the location of the mouse event object,
    * @param mouseEventObj Required. The MouseEvent Object specifying where to show the Flyout.
    **/
  def showAt(mouseEventObj: stdLib.MouseEvent): scala.Unit = js.native
}

/* static members */
@JSGlobal("WinJS.UI.Flyout")
@js.native
object Flyout extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: scala.Boolean = js.native
}

