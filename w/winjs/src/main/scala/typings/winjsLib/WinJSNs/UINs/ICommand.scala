package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommand extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
           * Gets or sets a value that indicates whether the ICommand is disabled.
          **/
  var disabled: scala.Boolean = js.native
  /**
           * Gets the DOM element that hosts the ICommand.
          **/
  var element: stdLib.HTMLElement = js.native
  /**
           * Adds an extra CSS class during construction.
          **/
  var extraClass: java.lang.String = js.native
  /**
           * Gets or sets the HTMLElement with a 'content' type ICommand that should receive focus whenever focus moves by the user pressing HOME or the arrow keys, from the previous ICommand to this ICommand.
          **/
  var firstElementFocus: stdLib.HTMLElement = js.native
  /**
           * Gets or sets the Flyout object displayed by this command. The specified flyout is shown when the ICommand's button is invoked.
          **/
  var flyout: Flyout = js.native
  /**
           * Gets or sets a value that indicates whether the ICommand is hiding or in the process of becoming hidden.
          **/
  var hidden: scala.Boolean = js.native
  /**
           * Gets or sets the icon of the ICommand.
          **/
  var icon: java.lang.String = js.native
  /**
           * Gets the element identifier (ID) of the command.
          **/
  var id: java.lang.String = js.native
  /**
           * Gets or sets the label of the command.
          **/
  var label: java.lang.String = js.native
  /**
           * Gets or sets the HTMLElement with a 'content' type ICommand that should receive focus whenever focus moves by the user pressing END or the arrow keys, from the previous Command to this Command.
          **/
  var lastElementFocus: stdLib.HTMLElement = js.native
  /**
           * Gets or sets the function to be invoked when the command is clicked.
          **/
  var onclick: js.Function = js.native
  /**
            * Gets or sets the priority of the command.
           **/
  var priority: scala.Double = js.native
  /**
           * Gets the section of the parent control that the command is in. The section can only be set through constructor options.
          **/
  var section: java.lang.String = js.native
  /**
           * Gets or sets the selected state of a toggle button.
          **/
  var selected: scala.Boolean = js.native
  /**
           * Gets or sets the tooltip of the command.
          **/
  var tooltip: java.lang.String = js.native
  /**
           * Gets the type of the command. The type can only be set through constructor options.
          **/
  var `type`: java.lang.String = js.native
  //#region Methods
  /**
           * Registers an event handler for the specified event.
           * @param type The event type to register.
           * @param listener The event handler function to associate with the event.
           * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
          **/
  def addEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  //#region Methods
  /**
           * Registers an event handler for the specified event.
           * @param type The event type to register.
           * @param listener The event handler function to associate with the event.
           * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
          **/
  def addEventListener(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  /**
           * Releases resources held by this ICommand. Call this method when the ICommand is no longer needed. After calling this method, the ICommand becomes unusable.
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

