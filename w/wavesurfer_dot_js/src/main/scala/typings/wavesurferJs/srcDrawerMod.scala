package typings.wavesurferJs

import typings.std.HTMLElement
import typings.wavesurferJs.typesParamsMod.WaveSurferParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDrawerMod {
  
  @JSImport("wavesurfer.js/src/drawer", JSImport.Default)
  @js.native
  open class default protected () extends Drawer {
    def this(container: HTMLElement, params: WaveSurferParams) = this()
  }
  
  @js.native
  trait Drawer
    extends typings.wavesurferJs.srcUtilObserverMod.default {
    
    val container: HTMLElement = js.native
    
    /** The height of the renderer. */
    val height: Double = js.native
    
    val lastPos: Double = js.native
    
    val params: WaveSurferParams = js.native
    
    /** The width of the renderer. */
    val width: Double = js.native
    
    val wrapper: HTMLElement = js.native
  }
}
