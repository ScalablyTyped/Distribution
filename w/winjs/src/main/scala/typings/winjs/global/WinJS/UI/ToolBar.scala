package typings.winjs.global.WinJS.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Displays ICommands within the flow of the app. Use the ToolBar around other statically positioned app content.
  **/
@JSGlobal("WinJS.UI.ToolBar")
@js.native
/**
  * Creates a new ToolBar control.
  * @param element The DOM element that will host the control.
  * @param options The set of properties and values to apply to the new ToolBar.
  **/
class ToolBar ()
  extends StObject
     with typings.winjs.WinJS.UI.ToolBar {
  def this(element: HTMLElement) = this()
  def this(element: Unit, options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
object ToolBar {
  
  @JSGlobal("WinJS.UI.ToolBar")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Display options for the closed ToolBar.
    **/
  /* static member */
  object ClosedDisplayMode {
    
    @JSGlobal("WinJS.UI.ToolBar.ClosedDisplayMode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * When the ToolBar is closed, the height of the ToolBar is reduced such that button commands are still visible, but their labels are hidden.
      **/
    @JSGlobal("WinJS.UI.ToolBar.ClosedDisplayMode.compact")
    @js.native
    def compact: String = js.native
    inline def compact_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compact")(x.asInstanceOf[js.Any])
    
    /**
      * When the ToolBar is closed, the height of the ToolBar is always sized to content.
      **/
    @JSGlobal("WinJS.UI.ToolBar.ClosedDisplayMode.full")
    @js.native
    def full: String = js.native
    inline def full_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("full")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.ToolBar.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
