package typings.winjs.mod.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a command in the SplitView Pane.
  **/
@JSImport("winjs", "UI.SplitViewCommand")
@js.native
//#region Constructors
/**
  * Creates a new SplitViewCommand.
  * @constructor
  * @param element The DOM element hosts the new SplitViewCommand.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class SplitViewCommand ()
  extends typings.winjs.WinJS.UI.SplitViewCommand {
  def this(element: HTMLElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSImport("winjs", "UI.SplitViewCommand")
@js.native
object SplitViewCommand extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

