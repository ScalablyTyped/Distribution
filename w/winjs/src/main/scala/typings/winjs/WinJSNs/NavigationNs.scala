package typings.winjs.WinJSNs

import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides functionality for dealing with basic navigation, including the navigation stack.
**/
@JSGlobal("WinJS.Navigation")
@js.native
object NavigationNs extends js.Object {
  //#region Properties
  /**
    * Determines whether it is possible to navigate backwards.
    **/
  var canGoBack: Boolean = js.native
  /**
    * Determines if it is possible to navigate forwards.
    **/
  var canGoForward: Boolean = js.native
  /**
    * Gets or sets the navigation history.
    **/
  var history: js.Any = js.native
  /**
    * Gets or sets the current location.
    **/
  var location: String = js.native
  /**
    * Gets or sets a user-defined object that represents the state associated with the current location.
    **/
  var state: js.Any = js.native
  //#endregion Properties
  //#region Functions
  /**
    * Adds an event listener to the control.
    * @param eventType The type (name) of the event.
    * @param listener The listener to invoke when the event gets raised.
    * @param capture If true, specifies that capture should be initiated, otherwise false.
    **/
  def addEventListener(eventType: String, listener: js.Function): Unit = js.native
  def addEventListener(eventType: String, listener: js.Function, capture: Boolean): Unit = js.native
  /**
    * Navigates backwards.
    * @param distance The number of entries to go back into the history.
    * @returns A promise that is completed with a value that indicates whether or not the navigation was successful.
    **/
  def back(): Promise[Boolean] = js.native
  def back(distance: Double): Promise[Boolean] = js.native
  /**
    * Navigates forwards.
    * @param distance The number of entries to go forward.
    * @returns A promise that is completed with a value that indicates whether or not the navigation was successful.
    **/
  def forward(): Promise[Boolean] = js.native
  def forward(distance: Double): Promise[Boolean] = js.native
  /**
    * Navigates to a location.
    * @param location The location to navigate to. Generally the location is a string containing the URL, but it may be anything.
    * @param initialState A user-defined object that represents the navigation state that may be accessed through state.
    * @returns A promise that is completed with a value that indicates whether or not the navigation was successful (true if successful, otherwise false).
    **/
  def navigate(location: js.Any): Promise[Boolean] = js.native
  def navigate(location: js.Any, initialState: js.Any): Promise[Boolean] = js.native
  //#endregion Functions
  //#region Events
  /**
    * Occurs before navigation.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: location, state.
    **/
  def onbeforenavigate(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * Occurs after navigation has taken place.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: location, state.
    **/
  def onnavigated(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * Occurs when navigation is taking place.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: location, state.
    **/
  def onnavigating(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * Removes an event listener from the control.
    * @param eventType The type (name) of the event.
    * @param listener The listener to remove.
    * @param useCapture Specifies whether or not to initiate capture.
    **/
  def removeEventListener(eventType: String, listener: js.Function): Unit = js.native
  def removeEventListener(eventType: String, listener: js.Function, useCapture: Boolean): Unit = js.native
}

