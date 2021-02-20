package typings.winjs.global.WinJS.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Prevents a DOM sub-tree from receiving tab navigations and focus.
  **/
@JSGlobal("WinJS.UI.TabContainer")
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
object TabContainer {
  
  @JSGlobal("WinJS.UI.TabContainer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.TabContainer.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
