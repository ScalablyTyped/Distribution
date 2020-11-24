package typings.winjs.mod.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Prevents a DOM sub-tree from receiving tab navigations and focus.
  **/
@JSImport("winjs", "UI.TabContainer")
@js.native
class TabContainer protected ()
  extends typings.winjs.WinJS.UI.TabContainer {
  //#region Constructors
  /**
    * Creates a new TabContainer.
    * @constructor
    * @param element The DOM element that hosts the TabContainer control.
    * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties.
    **/
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
/* static members */
@JSImport("winjs", "UI.TabContainer")
@js.native
object TabContainer extends js.Object {
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}
