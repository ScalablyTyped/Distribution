package typings.winjs.mod.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Displays a SplitView which renders a collapsable pane next to arbitrary HTML content.
  **/
@JSImport("winjs", "UI.SplitView")
@js.native
/**
  * Creates a new SplitView.
  * @constructor
  * @param element The DOM element hosts the new SplitView.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class SplitView ()
  extends StObject
     with typings.winjs.WinJS.UI.SplitView {
  def this(element: HTMLElement) = this()
  def this(element: Unit, options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
object SplitView {
  
  @JSImport("winjs", "UI.SplitView")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Display options for a SplitView's pane when it is closed.
    **/
  /* static member */
  object ClosedDisplayMode {
    
    @JSImport("winjs", "UI.SplitView.ClosedDisplayMode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * When the pane is closed, it occupies space leaving less room for the SplitView's content.
      **/
    @JSImport("winjs", "UI.SplitView.ClosedDisplayMode.inline")
    @js.native
    val `inline`: String = js.native
    
    /**
      * When the pane is closed, it is not visible and doesn't take up any space.
      **/
    @JSImport("winjs", "UI.SplitView.ClosedDisplayMode.none")
    @js.native
    def none: String = js.native
    inline def none_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Display options for a SplitView's pane when it is open.
    **/
  /* static member */
  object OpenedDisplayMode {
    
    @JSImport("winjs", "UI.SplitView.OpenedDisplayMode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * When the pane is open, it occupies space leaving less room for the SplitView's content.
      **/
    @JSImport("winjs", "UI.SplitView.OpenedDisplayMode.inline")
    @js.native
    val `inline`: String = js.native
    
    /**
      * When the pane is open, it doesn't take up any space and it is light dismissable.
      **/
    @JSImport("winjs", "UI.SplitView.OpenedDisplayMode.overlay")
    @js.native
    def overlay: String = js.native
    inline def overlay_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overlay")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Placement options for a SplitView's pane.
    **/
  /* static member */
  object PanePlacement {
    
    @JSImport("winjs", "UI.SplitView.PanePlacement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Pane is positioned below the SplitView's content.
      **/
    @JSImport("winjs", "UI.SplitView.PanePlacement.bottom")
    @js.native
    def bottom: String = js.native
    inline def bottom_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottom")(x.asInstanceOf[js.Any])
    
    /**
      * Pane is positioned left of the SplitView's content.
      **/
    @JSImport("winjs", "UI.SplitView.PanePlacement.left")
    @js.native
    def left: String = js.native
    inline def left_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("left")(x.asInstanceOf[js.Any])
    
    /**
      * Pane is positioned right of the SplitView's content.
      **/
    @JSImport("winjs", "UI.SplitView.PanePlacement.right")
    @js.native
    def right: String = js.native
    inline def right_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("right")(x.asInstanceOf[js.Any])
    
    /**
      * Pane is positioned above the SplitView's content.
      **/
    @JSImport("winjs", "UI.SplitView.PanePlacement.top")
    @js.native
    def top: String = js.native
    inline def top_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("top")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "UI.SplitView.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
