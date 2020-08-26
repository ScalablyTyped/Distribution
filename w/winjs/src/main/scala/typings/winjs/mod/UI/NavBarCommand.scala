package typings.winjs.mod.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a navigation command in a NavBarContainer.
  **/
@JSImport("winjs", "UI.NavBarCommand")
@js.native
//#region Constructors
/**
  * Creates a new NavBarCommand.
  * @constructor
  * @param element The DOM element hosts the new NavBarCommand.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class NavBarCommand ()
  extends typings.winjs.WinJS.UI.NavBarCommand {
  def this(element: HTMLElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSImport("winjs", "UI.NavBarCommand")
@js.native
object NavBarCommand extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

