package typings.winjs.global.WinJS.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Displays NavBarCommands in an overlayed navigation pane that opens and closes at the top or bottom of the main view.
  **/
@JSGlobal("WinJS.UI.NavBar")
@js.native
//#region Constructors
/**
  * Creates a new NavBar.
  * @constructor
  * @param element The DOM element that will host the new NavBar.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class NavBar ()
  extends typings.winjs.WinJS.UI.NavBar {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSGlobal("WinJS.UI.NavBar")
@js.native
object NavBar extends js.Object {
  /**
    * This object supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  var isDeclarativeControlContainer: js.Any = js.native
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

