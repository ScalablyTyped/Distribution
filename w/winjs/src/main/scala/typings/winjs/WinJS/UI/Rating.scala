package typings.winjs.WinJS.UI

import typings.std.CustomEvent
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lets the user rate something by clicking an icon that represents a rating. The Rating control can display three types of ratings: an average rating, a tentative rating, and the user's rating.
  **/
@js.native
trait Rating extends StObject {
  
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
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the average rating.
    **/
  var averageRating: Double = js.native
  
  /**
    * Gets or sets whether the control is disabled. When the control is disabled, the user can't specify a new user rating or modify an existing rating.
    **/
  var disabled: Boolean = js.native
  
  /**
    * Releases resources held by this Rating. Call this method when the Rating is no longer needed. After calling this method, the Rating becomes unusable.
    **/
  def dispose(): Unit = js.native
  
  /**
    * Gets the DOM element that hosts the Rating.
    **/
  var element: HTMLElement = js.native
  
  /**
    * Gets or sets whether control lets the user clear the rating.
    **/
  var enableClear: Boolean = js.native
  
  /**
    * Gets or sets the maximum possible rating value.
    **/
  var maxRating: Double = js.native
  
  //#endregion Constructors
  //#region Events
  /**
    * Raised when the user finishes interacting with the rating control without committing a tentative rating.
    * @param eventInfo An object that contains information about the event.
    **/
  def oncancel(eventInfo: Event): Unit = js.native
  
  /**
    * Raised when the user commits a change to the userRating.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.tentativeRating.
    **/
  def onchange(eventInfo: CustomEvent[Any]): Unit = js.native
  
  /**
    * Raised when the user is choosing a new tentative Rating.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.tentativeRating.
    **/
  def onpreviewchange(eventInfo: CustomEvent[Any]): Unit = js.native
  
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param eventName The name of the event that the event handler is registered for.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: String, eventCallback: js.Function): Unit = js.native
  def removeEventListener(eventName: String, eventCallback: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Gets or sets a set of descriptions to show for rating values in the tooltip.
    **/
  var tooltipStrings: js.Array[String] = js.native
  
  /**
    * Gets or sets the user's rating.
    **/
  var userRating: Double = js.native
}
