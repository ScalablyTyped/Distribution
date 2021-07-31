package typings.winjs.mod.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion Interfaces
//#region Objects
/**
  * Displays ICommands in overlayed application pane that opens and closes at the top or bottom of the main view.
  **/
@JSImport("winjs", "UI.AppBar")
@js.native
//#region Constructors
/**
  * Creates a new AppBar object.
  * @constructor
  * @param element The DOM element that will host the control.
  * @param options The set of properties and values to apply to the new AppBar.
  **/
class AppBar ()
  extends StObject
     with typings.winjs.WinJS.UI.AppBar {
  def this(element: HTMLElement) = this()
  def this(element: Unit, options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
object AppBar {
  
  @JSImport("winjs", "UI.AppBar")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Display options for the AppBar when closed.
    **/
  /* static member */
  object ClosedDisplayMode {
    
    @JSImport("winjs", "UI.AppBar.ClosedDisplayMode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * When the AppBar is closed, its height is reduced such that button commands are still visible, but their labels are hidden.
      **/
    @JSImport("winjs", "UI.AppBar.ClosedDisplayMode.compact")
    @js.native
    def compact: String = js.native
    @scala.inline
    def compact_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compact")(x.asInstanceOf[js.Any])
    
    /**
      * When the AppBar is closed, its height is always sized to content.
      **/
    @JSImport("winjs", "UI.AppBar.ClosedDisplayMode.full")
    @js.native
    def full: String = js.native
    @scala.inline
    def full_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("full")(x.asInstanceOf[js.Any])
    
    /**
      * When the AppBar is closed, its height is reduced to the minimal height required to display only its overflowbutton. All other content in the AppBar is not displayed.
      **/
    @JSImport("winjs", "UI.AppBar.ClosedDisplayMode.minimal")
    @js.native
    def minimal: String = js.native
    @scala.inline
    def minimal_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minimal")(x.asInstanceOf[js.Any])
    
    /**
      * When the AppBar is closed, it is not visible and doesn't take up any space.
      **/
    @JSImport("winjs", "UI.AppBar.ClosedDisplayMode.none")
    @js.native
    def none: String = js.native
    @scala.inline
    def none_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Display options for AppBar placement in relation to the main view.
    */
  /* static member */
  object Placement {
    
    @JSImport("winjs", "UI.AppBar.Placement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The AppBar appears at the bottom of the main view
      **/
    @JSImport("winjs", "UI.AppBar.Placement.bottom")
    @js.native
    def bottom: String = js.native
    @scala.inline
    def bottom_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottom")(x.asInstanceOf[js.Any])
    
    /**
      * The AppBar appears at the top of the main view
      **/
    @JSImport("winjs", "UI.AppBar.Placement.top")
    @js.native
    def top: String = js.native
    @scala.inline
    def top_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("top")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "UI.AppBar.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
