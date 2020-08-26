package typings.winjs.global.WinJS.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a command to be displayed in an app bar.
  **/
@JSGlobal("WinJS.UI.AppBarCommand")
@js.native
//#region Constructors
/**
  * Creates a new AppBarCommand object.
  * @constructor
  * @param element The DOM element that will host the control.
  * @param options The set of properties and values to apply to the new AppBarCommand.
  **/
class AppBarCommand ()
  extends typings.winjs.WinJS.UI.AppBarCommand {
  def this(element: HTMLElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSGlobal("WinJS.UI.AppBarCommand")
@js.native
object AppBarCommand extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

