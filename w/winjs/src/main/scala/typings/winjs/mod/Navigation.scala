package typings.winjs.mod

import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  inline def addEventListener(eventType: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(eventType.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener(eventType: String, listener: js.Function, capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(eventType.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Navigates backwards.
    * @param distance The number of entries to go back into the history.
    * @returns A promise that is completed with a value that indicates whether or not the navigation was successful.
    **/
  inline def back(): typings.winjs.WinJS.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("back")().asInstanceOf[typings.winjs.WinJS.Promise[Boolean]]
  inline def back(distance: Double): typings.winjs.WinJS.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("back")(distance.asInstanceOf[js.Any]).asInstanceOf[typings.winjs.WinJS.Promise[Boolean]]
  
  //#region Properties
  /**
    * Determines whether it is possible to navigate backwards.
    **/
  @JSImport("winjs", "Navigation.canGoBack")
  @js.native
  def canGoBack: Boolean = js.native
  inline def canGoBack_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canGoBack")(x.asInstanceOf[js.Any])
  
  /**
    * Determines if it is possible to navigate forwards.
    **/
  @JSImport("winjs", "Navigation.canGoForward")
  @js.native
  def canGoForward: Boolean = js.native
  inline def canGoForward_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canGoForward")(x.asInstanceOf[js.Any])
  
  /**
    * Navigates forwards.
    * @param distance The number of entries to go forward.
    * @returns A promise that is completed with a value that indicates whether or not the navigation was successful.
    **/
  inline def forward(): typings.winjs.WinJS.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("forward")().asInstanceOf[typings.winjs.WinJS.Promise[Boolean]]
  inline def forward(distance: Double): typings.winjs.WinJS.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("forward")(distance.asInstanceOf[js.Any]).asInstanceOf[typings.winjs.WinJS.Promise[Boolean]]
  
  /**
    * Gets or sets the navigation history.
    **/
  @JSImport("winjs", "Navigation.history")
  @js.native
  def history: Any = js.native
  inline def history_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("history")(x.asInstanceOf[js.Any])
  
  /**
    * Gets or sets the current location.
    **/
  @JSImport("winjs", "Navigation.location")
  @js.native
  def location: String = js.native
  inline def location_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("location")(x.asInstanceOf[js.Any])
  
  /**
    * Navigates to a location.
    * @param location The location to navigate to. Generally the location is a string containing the URL, but it may be anything.
    * @param initialState A user-defined object that represents the navigation state that may be accessed through state.
    * @returns A promise that is completed with a value that indicates whether or not the navigation was successful (true if successful, otherwise false).
    **/
  inline def navigate(location: Any): typings.winjs.WinJS.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(location.asInstanceOf[js.Any]).asInstanceOf[typings.winjs.WinJS.Promise[Boolean]]
  inline def navigate(location: Any, initialState: Any): typings.winjs.WinJS.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(location.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Boolean]]
  
  //#endregion Functions
  //#region Events
  /**
    * Occurs before navigation.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: location, state.
    **/
  inline def onbeforenavigate(eventInfo: CustomEvent[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onbeforenavigate")(eventInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Occurs after navigation has taken place.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: location, state.
    **/
  inline def onnavigated(eventInfo: CustomEvent[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onnavigated")(eventInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Occurs when navigation is taking place.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: location, state.
    **/
  inline def onnavigating(eventInfo: CustomEvent[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onnavigating")(eventInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Removes an event listener from the control.
    * @param eventType The type (name) of the event.
    * @param listener The listener to remove.
    * @param useCapture Specifies whether or not to initiate capture.
    **/
  inline def removeEventListener(eventType: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(eventType.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener(eventType: String, listener: js.Function, useCapture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(eventType.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets or sets a user-defined object that represents the state associated with the current location.
    **/
  @JSImport("winjs", "Navigation.state")
  @js.native
  def state: Any = js.native
  inline def state_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("state")(x.asInstanceOf[js.Any])
}
