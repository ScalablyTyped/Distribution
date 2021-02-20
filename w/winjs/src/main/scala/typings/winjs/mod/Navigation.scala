package typings.winjs.mod

import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides functionality for dealing with basic navigation, including the navigation stack.
**/
object Navigation {
  
  @JSImport("winjs", "Navigation")
  @js.native
  val ^ : js.Any = js.native
  
  //#endregion Properties
  //#region Functions
  /**
    * Adds an event listener to the control.
    * @param eventType The type (name) of the event.
    * @param listener The listener to invoke when the event gets raised.
    * @param capture If true, specifies that capture should be initiated, otherwise false.
    **/
  @JSImport("winjs", "Navigation.addEventListener")
  @js.native
  def addEventListener(eventType: String, listener: js.Function): Unit = js.native
  @JSImport("winjs", "Navigation.addEventListener")
  @js.native
  def addEventListener(eventType: String, listener: js.Function, capture: Boolean): Unit = js.native
  
  /**
    * Navigates backwards.
    * @param distance The number of entries to go back into the history.
    * @returns A promise that is completed with a value that indicates whether or not the navigation was successful.
    **/
  @JSImport("winjs", "Navigation.back")
  @js.native
  def back(): typings.winjs.WinJS.Promise[Boolean] = js.native
  @JSImport("winjs", "Navigation.back")
  @js.native
  def back(distance: Double): typings.winjs.WinJS.Promise[Boolean] = js.native
  
  //#region Properties
  /**
    * Determines whether it is possible to navigate backwards.
    **/
  @JSImport("winjs", "Navigation.canGoBack")
  @js.native
  def canGoBack: Boolean = js.native
  @scala.inline
  def canGoBack_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canGoBack")(x.asInstanceOf[js.Any])
  
  /**
    * Determines if it is possible to navigate forwards.
    **/
  @JSImport("winjs", "Navigation.canGoForward")
  @js.native
  def canGoForward: Boolean = js.native
  @scala.inline
  def canGoForward_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canGoForward")(x.asInstanceOf[js.Any])
  
  /**
    * Navigates forwards.
    * @param distance The number of entries to go forward.
    * @returns A promise that is completed with a value that indicates whether or not the navigation was successful.
    **/
  @JSImport("winjs", "Navigation.forward")
  @js.native
  def forward(): typings.winjs.WinJS.Promise[Boolean] = js.native
  @JSImport("winjs", "Navigation.forward")
  @js.native
  def forward(distance: Double): typings.winjs.WinJS.Promise[Boolean] = js.native
  
  /**
    * Gets or sets the navigation history.
    **/
  @JSImport("winjs", "Navigation.history")
  @js.native
  def history: js.Any = js.native
  @scala.inline
  def history_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("history")(x.asInstanceOf[js.Any])
  
  /**
    * Gets or sets the current location.
    **/
  @JSImport("winjs", "Navigation.location")
  @js.native
  def location: String = js.native
  @scala.inline
  def location_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("location")(x.asInstanceOf[js.Any])
  
  /**
    * Navigates to a location.
    * @param location The location to navigate to. Generally the location is a string containing the URL, but it may be anything.
    * @param initialState A user-defined object that represents the navigation state that may be accessed through state.
    * @returns A promise that is completed with a value that indicates whether or not the navigation was successful (true if successful, otherwise false).
    **/
  @JSImport("winjs", "Navigation.navigate")
  @js.native
  def navigate(location: js.Any): typings.winjs.WinJS.Promise[Boolean] = js.native
  @JSImport("winjs", "Navigation.navigate")
  @js.native
  def navigate(location: js.Any, initialState: js.Any): typings.winjs.WinJS.Promise[Boolean] = js.native
  
  //#endregion Functions
  //#region Events
  /**
    * Occurs before navigation.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: location, state.
    **/
  @JSImport("winjs", "Navigation.onbeforenavigate")
  @js.native
  def onbeforenavigate(eventInfo: CustomEvent[_]): Unit = js.native
  
  /**
    * Occurs after navigation has taken place.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: location, state.
    **/
  @JSImport("winjs", "Navigation.onnavigated")
  @js.native
  def onnavigated(eventInfo: CustomEvent[_]): Unit = js.native
  
  /**
    * Occurs when navigation is taking place.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: location, state.
    **/
  @JSImport("winjs", "Navigation.onnavigating")
  @js.native
  def onnavigating(eventInfo: CustomEvent[_]): Unit = js.native
  
  /**
    * Removes an event listener from the control.
    * @param eventType The type (name) of the event.
    * @param listener The listener to remove.
    * @param useCapture Specifies whether or not to initiate capture.
    **/
  @JSImport("winjs", "Navigation.removeEventListener")
  @js.native
  def removeEventListener(eventType: String, listener: js.Function): Unit = js.native
  @JSImport("winjs", "Navigation.removeEventListener")
  @js.native
  def removeEventListener(eventType: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Gets or sets a user-defined object that represents the state associated with the current location.
    **/
  @JSImport("winjs", "Navigation.state")
  @js.native
  def state: js.Any = js.native
  @scala.inline
  def state_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("state")(x.asInstanceOf[js.Any])
}
