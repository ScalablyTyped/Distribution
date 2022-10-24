package typings.styletronReact

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.styletronReact.anon.StackIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDevToolMod {
  
  @JSImport("styletron-react/lib/dev-tool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("styletron-react/lib/dev-tool", "BrowserDebugEngine")
  @js.native
  open class BrowserDebugEngine () extends StObject {
    def this(worker: Any) = this()
    
    /* private */ var counter: Any = js.native
    
    def debug(param0: StackIndex): String = js.native
    
    /* private */ var worker: Any = js.native
  }
  
  @JSImport("styletron-react/lib/dev-tool", "DebugEngine")
  @js.native
  val DebugEngine: (Instantiable1[/* worker */ js.UndefOr[Any], BrowserDebugEngine]) | Instantiable0[NoopDebugEngine] = js.native
  
  @JSImport("styletron-react/lib/dev-tool", "NoopDebugEngine")
  @js.native
  open class NoopDebugEngine () extends StObject {
    
    def debug(): Unit = js.native
  }
  
  inline def addDebugMetadata(instance: Any, stackIndex: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addDebugMetadata")(instance.asInstanceOf[js.Any], stackIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setupDevtoolsExtension(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupDevtoolsExtension")().asInstanceOf[Unit]
}
