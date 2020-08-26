package typings.winjs.mod.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a command to be displayed in a Menu object.
  **/
@JSImport("winjs", "UI.MenuCommand")
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
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSImport("winjs", "UI.MenuCommand")
@js.native
object MenuCommand extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

