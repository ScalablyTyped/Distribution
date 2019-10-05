package typings.winjs.WinJS.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion Enumerations
//#region Objects
/**
  * A mixin that contains event-related functions.
  **/
@JSGlobal("WinJS.Utilities.eventMixin")
@js.native
object eventMixin extends js.Object {
  //#region Methods
  /**
    * Adds an event listener to the control.
    * @param type The type (name) of the event.
    * @param listener The listener to invoke when the event gets raised.
    * @param useCapture If true, initiates capture, otherwise false.
    **/
  def addEventListener(`type`: String, listener: js.Function): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  /**
    * Raises an event of the specified type and with the specified additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event.
    **/
  def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = js.native
  /**
    * Removes an event listener from the control.
    * @param type The type (name) of the event.
    * @param listener The listener to remove.
    * @param useCapture true if capture is to be initiated, otherwise false.
    **/
  def removeEventListener(`type`: String, listener: js.Function): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
}

