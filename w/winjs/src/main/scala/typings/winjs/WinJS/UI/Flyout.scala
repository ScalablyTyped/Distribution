package typings.winjs.WinJS.UI

import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.winjs.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Displays lightweight UI that is either information, or requires user interaction. Unlike a dialog, a Flyout can be light dismissed by clicking or tapping off of it.
  **/
@js.native
trait Flyout extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the default alignment to be used for this Flyout.
    **/
  var alignment: String = js.native
  /**
    * Gets or sets the default anchor to be used for this Flyout.
    **/
  var anchor: HTMLElement = js.native
  /**
    * Gets or sets a value that indicates whether the Flyout is disabled.
    **/
  var disabled: Boolean = js.native
  /**
    * Gets the DOM element that hosts the Flyout.
    **/
  var element: HTMLElement = js.native
  /**
    * Gets a value that indicates whether the Flyout is hidden or in the process of becoming hidden, or sets the Flyout to hide or show itself.
    **/
  var hidden: Boolean = js.native
  /**
    * Gets or sets the default placement to be used for this Flyout.
    **/
  var placement: String = js.native
  //#endregion Events
  //#region Methods
  /**
    * Registers an event handler for the specified event.
    * @param type The event type to register. It must be beforeshow, beforehide, aftershow, or afterhide.
    * @param listener The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(`type`: String, listener: js.Function): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(eventName: String, eventProperties: js.Any): Boolean = js.native
  /**
    * Releases resources held by this object. Call this method when the object is no longer needed. After calling this method, the object becomes unusable.
    **/
  def dispose(): Unit = js.native
  /**
    * Hides the Flyout, if visible, regardless of other states.
    **/
  def hide(): Unit = js.native
  //#endregion Constructors
  //#region Events
  /**
    * Raised immediately after a flyout is fully hidden.
    * @param eventInfo An object that contains information about the event.
    **/
  def onafterhide(eventInfo: Event): Unit = js.native
  /**
    * Raised immediately after a flyout is fully shown.
    * @param eventInfo An object that contains information about the event.
    **/
  def onaftershow(eventInfo: Event): Unit = js.native
  /**
    * Raised just before hiding a flyout.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforehide(eventInfo: Event): Unit = js.native
  /**
    * Raised just before showing a flyout.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeshow(eventInfo: Event): Unit = js.native
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param type The event type to unregister. It must be beforeshow, beforehide, aftershow, or afterhide.
    * @param listener The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(`type`: String, listener: js.Function): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  /**
    * Shows the Flyout, if hidden, regardless of other states.
    * @param anchor. DOM element to temporarily anchor the position of the Flyout to. This is optional if Flyout.anchor has already been set.
    * @param placement The placement of the Flyout to the anchor: the string literal "top", "bottom", "left", or "right".
    * @param alignment For "top" or "bottom" placement, the alignment of the Flyout to the anchor's edge: the string literal "center", "left", or "right".
    **/
  def show(): Unit = js.native
  def show(anchor: js.UndefOr[scala.Nothing], placement: js.UndefOr[scala.Nothing], alignment: String): Unit = js.native
  def show(anchor: js.UndefOr[scala.Nothing], placement: String): Unit = js.native
  def show(anchor: js.UndefOr[scala.Nothing], placement: String, alignment: String): Unit = js.native
  def show(anchor: HTMLElement): Unit = js.native
  def show(anchor: HTMLElement, placement: js.UndefOr[scala.Nothing], alignment: String): Unit = js.native
  def show(anchor: HTMLElement, placement: String): Unit = js.native
  def show(anchor: HTMLElement, placement: String, alignment: String): Unit = js.native
  /**
    * Shows the Flyout, if hidden, regardless of other states, top and left aligned at the specified coordinates,
    * @param coordinates Required. The point where the top left corner of the flyout will appear, relative to the top and left edge of the visual viewport.
    **/
  def showAt(coordinates: X): Unit = js.native
  /**
    * Shows the Flyout, if hidden, regardless of other states, top and left aligned at the location of the mouse event object,
    * @param mouseEventObj Required. The MouseEvent Object specifying where to show the Flyout.
    **/
  def showAt(mouseEventObj: MouseEvent): Unit = js.native
}

