package typings.winjs.mod.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a group of NavBarCommand objects in a NavBar.
  **/
@JSImport("winjs", "UI.NavBarContainer")
@js.native
//#region Constructors
/**
  * Creates a new NavBarContainer.
  * @constructor
  * @param element The DOM element hosts the new NavBarContainer.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class NavBarContainer ()
  extends typings.winjs.WinJS.UI.NavBarContainer {
  def this(element: HTMLElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
/* static members */
@JSImport("winjs", "UI.NavBarContainer")
@js.native
object NavBarContainer extends js.Object {
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}
