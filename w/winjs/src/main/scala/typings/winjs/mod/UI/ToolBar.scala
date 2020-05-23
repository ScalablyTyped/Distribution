package typings.winjs.mod.UI

import typings.std.HTMLElement
import typings.winjs.anon.Full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Displays ICommands within the flow of the app. Use the ToolBar around other statically positioned app content.
  **/
@JSImport("winjs", "UI.ToolBar")
@js.native
/**
  * Creates a new ToolBar control.
  * @param element The DOM element that will host the control.
  * @param options The set of properties and values to apply to the new ToolBar.
  **/
class ToolBar ()
  extends typings.winjs.WinJS.UI.ToolBar {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSImport("winjs", "UI.ToolBar")
@js.native
object ToolBar extends js.Object {
  /**
    * Display options for the closed ToolBar.
    **/
  var ClosedDisplayMode: Full = js.native
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

