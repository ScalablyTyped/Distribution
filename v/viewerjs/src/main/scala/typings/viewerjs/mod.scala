package typings.viewerjs

import typings.std.HTMLElement
import typings.viewerjs.Viewer.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("viewerjs", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Viewer {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: Options) = this()
  }
  object default {
    
    @JSImport("viewerjs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("viewerjs", "default.ToolbarButtonSize")
    @js.native
    object ToolbarButtonSize extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.viewerjs.Viewer.ToolbarButtonSize & String] = js.native
      
      /* "large" */ val Large: typings.viewerjs.Viewer.ToolbarButtonSize.Large & String = js.native
      
      /* "medium" */ val Medium: typings.viewerjs.Viewer.ToolbarButtonSize.Medium & String = js.native
      
      /* "small" */ val Small: typings.viewerjs.Viewer.ToolbarButtonSize.Small & String = js.native
    }
    
    @JSImport("viewerjs", "default.Visibility")
    @js.native
    object Visibility extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.viewerjs.Viewer.Visibility & Double] = js.native
      
      /* 0 */ val Hidden: typings.viewerjs.Viewer.Visibility.Hidden & Double = js.native
      
      /* 1 */ val Visible: typings.viewerjs.Viewer.Visibility.Visible & Double = js.native
      
      /* 4 */ val VisibleOnExtraLargeOrWiderScreen: typings.viewerjs.Viewer.Visibility.VisibleOnExtraLargeOrWiderScreen & Double = js.native
      
      /* 3 */ val VisibleOnLargeOrWiderScreen: typings.viewerjs.Viewer.Visibility.VisibleOnLargeOrWiderScreen & Double = js.native
      
      /* 2 */ val VisibleOnMediumOrWiderScreen: typings.viewerjs.Viewer.Visibility.VisibleOnMediumOrWiderScreen & Double = js.native
    }
    
    /* static member */
    @scala.inline
    def noConflict(): Viewer = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[Viewer]
    
    /* static member */
    @scala.inline
    def setDefaults(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaults")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
