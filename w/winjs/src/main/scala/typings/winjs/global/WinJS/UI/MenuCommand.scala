package typings.winjs.global.WinJS.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a command to be displayed in a Menu object.
  **/
@JSGlobal("WinJS.UI.MenuCommand")
@js.native
//#region Constructors
/**
  * Creates a new MenuCommand object.
  * @constructor
  * @param element The DOM element that will host the control.
  * @param options The set of properties and values to apply to the new MenuCommand.
  **/
class MenuCommand ()
  extends typings.winjs.WinJS.UI.MenuCommand {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSGlobal("WinJS.UI.MenuCommand")
@js.native
object MenuCommand extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

