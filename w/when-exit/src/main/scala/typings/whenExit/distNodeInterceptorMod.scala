package typings.whenExit

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeInterceptorMod extends Shortcut {
  
  @JSImport("when-exit/dist/node/interceptor", JSImport.Default)
  @js.native
  val default: Interceptor = js.native
  
  @js.native
  trait Interceptor extends StObject {
    
    /* private */ var callbacks: Any = js.native
    
    def exit(): Unit = js.native
    def exit(signal: String): Unit = js.native
    
    /* private */ var exited: Any = js.native
    
    def hook(): Unit = js.native
    
    /* private */ var hooked: Any = js.native
    
    def register(
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ Any
    ): Any = js.native
  }
  
  type _To = Interceptor
  
  /* This means you don't have to write `default`, but can instead just say `distNodeInterceptorMod.foo` */
  override def _to: Interceptor = default
}
