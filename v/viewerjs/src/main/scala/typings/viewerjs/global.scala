package typings.viewerjs

import typings.std.HTMLElement
import typings.viewerjs.Viewer.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Viewer")
  @js.native
  open class Viewer protected ()
    extends StObject
       with typings.viewerjs.Viewer {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: Options) = this()
  }
  object Viewer {
    
    @JSGlobal("Viewer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def noConflict(): typings.viewerjs.Viewer = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[typings.viewerjs.Viewer]
    
    /* static member */
    inline def setDefaults(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaults")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
