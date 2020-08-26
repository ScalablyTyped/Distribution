package typings.winjs.WinJS.UI

import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.winjs.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a menu flyout for displaying commands.
  **/
@js.native
trait Menu extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the default alignment to be used for this Menu.
    **/
  var alignment: String = js.native
  /**
    * Gets or sets the default anchor to be used for this Menu.
    **/
  var anchor: HTMLElement = js.native
  /**
    * Sets the MenuCommand objects that appear in the menu.
    **/
  var commands: js.Array[MenuCommand] = js.native
  /**
    * Gets or sets a value that indicates whether the Menu is disabled.
    **/
  var disabled: Boolean = js.native
  /**
    * Gets the DOM element that hosts the Menu.
    **/
  var element: HTMLElement = js.native
  /**
    * Gets a value that indicates whether the Menu is hidden or in the process of becoming hidden, or sets the Menu to hide or show itself.
    **/
  var hidden: Boolean = js.native
  /**
    * Gets or sets the default placement to be used for this Menu.
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
    * Releases resources held by this Menu. Call this method when the Menu is no longer needed. After calling this method, the Menu becomes unusable.
    **/
  def dispose(): Unit = js.native
  /**
    * Returns the MenuCommand object identified by id.
    * @param id The element identifier (ID) of the command to be returned.
    * @returns The command identified by id.
    **/
  def getCommandById(id: String): MenuCommand = js.native
  /**
    * Hides the Menu.
    **/
  def hide(): Unit = js.native
  /**
    * Hides the specified commands of the Menu.
    * @param commands The commands to hide. The array elements may be MenuCommand objects, or the string identifiers (IDs) of commands.
    * @param immediate The parameter immediate is not supported and may be altered or unavailable in the future. true to hide the commands immediately, without animating them; otherwise, false.
    **/
  def hideCommands(commands: js.Array[_]): Unit = js.native
  def hideCommands(commands: js.Array[_], immediate: Boolean): Unit = js.native
  //#endregion Constructors
  //#region Events
  /**
    * Occurs immediately after the Menu is hidden.
    * @param eventInfo An object that contains information about the event.
    **/
  def onafterhide(eventInfo: Event): Unit = js.native
  /**
    * Occurs after the Menu is shown.
    * @param eventInfo An object that contains information about the event.
    **/
  def onaftershow(eventInfo: Event): Unit = js.native
  /**
    * Occurs before the Menu is hidden.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforehide(eventInfo: Event): Unit = js.native
  /**
    * Occurs before a hidden Menu is shown.
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
    * Shows the Menu, if hidden, regardless of other states.
    * @param anchor Required. The DOM element to anchor the Menu.
    * @param placement The placement of the Menu to the anchor: top, bottom, left, or right.
    * @param alignment For top or bottom placement, the alignment of the Menu to the anchor's edge: center, left, or right.
    **/
  def show(anchor: HTMLElement): Unit = js.native
  def show(anchor: HTMLElement, placement: js.UndefOr[scala.Nothing], alignment: String): Unit = js.native
  def show(anchor: HTMLElement, placement: String): Unit = js.native
  def show(anchor: HTMLElement, placement: String, alignment: String): Unit = js.native
  /**
    * Shows the Menu, if hidden, regardless of other states, top and left aligned at the specified coordinates,
    * @param coordinates Required. The point where the top left corner of the Menu will appear, relative to the top and left edge of the visual viewport.
    **/
  def showAt(coordinates: X): Unit = js.native
  /**
    * Shows the Menu, if hidden, regardless of other states, top and left aligned at the location of the mouse event object,
    * @param mouseEventObj Required. The MouseEvent Object specifying where to show the Menu.
    **/
  def showAt(mouseEventObj: MouseEvent): Unit = js.native
  /**
    * Shows the specified commands of the Menu.
    * @param commands The commands to show. The array elements may be Menu objects, or the string identifiers (IDs) of commands.
    * @param immediate The parameter immediate is not supported and may be altered or unavailable in the future. true to show the commands immediately, without animating them; otherwise, false.
    **/
  def showCommands(commands: js.Array[_]): Unit = js.native
  def showCommands(commands: js.Array[_], immediate: Boolean): Unit = js.native
  /**
    * Shows the specified commands of the Menu while hiding all other commands.
    * @param commands The commands to show. The array elements may be MenuCommand objects, or the string identifiers (IDs) of commands.
    * @param immediate The parameter immediate is not supported and may be altered or unavailable in the future. true to show the specified commands (and hide the others) immediately, without animating them; otherwise, false.
    **/
  def showOnlyCommands(commands: js.Array[_]): Unit = js.native
  def showOnlyCommands(commands: js.Array[_], immediate: Boolean): Unit = js.native
}

