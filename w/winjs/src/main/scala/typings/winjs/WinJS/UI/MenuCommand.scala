package typings.winjs.WinJS.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a command to be displayed in a Menu object.
  **/
@js.native
trait MenuCommand extends StObject {
  
  //#endregion Constructors
  //#region Methods
  /**
    * Registers an event handler for the specified event.
    * @param type The event type to register.
    * @param listener The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(`type`: String, listener: js.Function): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets a value that indicates whether the MenuCommand is disabled.
    **/
  var disabled: Boolean = js.native
  
  /**
    * Disposes this control.
    **/
  def dispose(): Unit = js.native
  
  /**
    * Gets the DOM element that hosts the MenuCommand.
    **/
  var element: HTMLElement = js.native
  
  /**
    * Adds an extra CSS class during construction.
    **/
  var extraClass: String = js.native
  
  /**
    * Gets or sets the Flyout object displayed by this command. The specified flyout is shown when the MenuCommand's button is invoked.
    **/
  var flyout: Flyout = js.native
  
  /**
    * Gets a value that indicates whether the MenuCommand is hidden or in the process of becoming hidden.
    **/
  var hidden: Boolean = js.native
  
  /**
    * Gets the element identifier (ID) of the command.
    **/
  var id: String = js.native
  
  /**
    * Gets or sets the label of the command.
    **/
  var label: String = js.native
  
  /**
    * Gets or sets the function to be invoked when the command is clicked.
    **/
  var onclick: js.Function = js.native
  
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param type The event type to unregister.
    * @param listener The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(`type`: String, listener: js.Function): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Gets or sets the selected state of a toggle button.
    **/
  var selected: Boolean = js.native
  
  /**
    * Gets the type of the command.
    **/
  var `type`: String = js.native
}
