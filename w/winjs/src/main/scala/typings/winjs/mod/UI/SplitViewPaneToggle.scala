package typings.winjs.mod.UI

import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Displays a button which is used for opening and closing a SplitView's pane.
  **/
@JSImport("winjs", "UI.SplitViewPaneToggle")
@js.native
/**
  * Creates a new SplitViewPaneToggle.
  * @constructor
  * @param element The DOM element hosts the new SplitViewPaneToggle.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class SplitViewPaneToggle ()
  extends typings.winjs.WinJS.UI.SplitViewPaneToggle {
  def this(element: HTMLButtonElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLButtonElement, options: js.Any) = this()
}
object SplitViewPaneToggle {
  
  @JSImport("winjs", "UI.SplitViewPaneToggle")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "UI.SplitViewPaneToggle.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
