package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a command to be displayed in a Menu object.
    **/
@JSGlobal("WinJS.UI.MenuCommand")
@js.native
class MenuCommand () extends js.Object {
  //#region Constructors
  /**
           * Creates a new MenuCommand object.
           * @constructor
           * @param element The DOM element that will host the control.
           * @param options The set of properties and values to apply to the new MenuCommand.
          **/
  def this(element: stdLib.HTMLElement) = this()
  //#region Constructors
  /**
           * Creates a new MenuCommand object.
           * @constructor
           * @param element The DOM element that will host the control.
           * @param options The set of properties and values to apply to the new MenuCommand.
          **/
  def this(element: stdLib.HTMLElement, options: js.Any) = this()
  //#endregion Methods
  //#region Properties
  /**
           * Gets or sets a value that indicates whether the MenuCommand is disabled.
          **/
  var disabled: scala.Boolean = js.native
  /**
           * Gets the DOM element that hosts the MenuCommand.
          **/
  var element: stdLib.HTMLElement = js.native
  /**
           * Adds an extra CSS class during construction.
          **/
  var extraClass: java.lang.String = js.native
  /**
           * Gets or sets the Flyout object displayed by this command. The specified flyout is shown when the MenuCommand's button is invoked.
          **/
  var flyout: Flyout = js.native
  /**
           * Gets a value that indicates whether the MenuCommand is hidden or in the process of becoming hidden.
          **/
  var hidden: scala.Boolean = js.native
  /**
           * Gets the element identifier (ID) of the command.
          **/
  var id: java.lang.String = js.native
  /**
           * Gets or sets the label of the command.
          **/
  var label: java.lang.String = js.native
  /**
           * Gets or sets the function to be invoked when the command is clicked.
          **/
  var onclick: js.Function = js.native
  /**
           * Gets or sets the selected state of a toggle button.
          **/
  var selected: scala.Boolean = js.native
  /**
           * Gets the type of the command.
          **/
  var `type`: java.lang.String = js.native
  //#endregion Constructors
  //#region Methods
  /**
           * Registers an event handler for the specified event.
           * @param type The event type to register.
           * @param listener The event handler function to associate with the event.
           * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
          **/
  def addEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  //#endregion Constructors
  //#region Methods
  /**
           * Registers an event handler for the specified event.
           * @param type The event type to register.
           * @param listener The event handler function to associate with the event.
           * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
          **/
  def addEventListener(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  /**
           * Disposes this control.
          **/
  def dispose(): scala.Unit = js.native
  /**
           * Removes an event handler that the addEventListener method registered.
           * @param type The event type to unregister.
           * @param listener The event handler function to remove.
           * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
          **/
  def removeEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  /**
           * Removes an event handler that the addEventListener method registered.
           * @param type The event type to unregister.
           * @param listener The event handler function to remove.
           * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
          **/
  def removeEventListener(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
}

/**
     * Represents a command to be displayed in a Menu object.
    **/
@JSGlobal("WinJS.UI.MenuCommand")
@js.native
object MenuCommand extends js.Object {
  /**
           * Indicates that the object is compatibile with declarative processing.
          **/
  var supportedForProcessing: scala.Boolean = js.native
}

