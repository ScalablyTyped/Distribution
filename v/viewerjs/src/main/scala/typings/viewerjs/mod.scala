package typings.viewerjs

import typings.std.HTMLElement
import typings.viewerjs.Viewer.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("viewerjs", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Viewer {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: Options) = this()
  }
  object default {
    
    @JSImport("viewerjs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def noConflict(): Viewer = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[Viewer]
    
    /* static member */
    inline def setDefaults(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaults")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
