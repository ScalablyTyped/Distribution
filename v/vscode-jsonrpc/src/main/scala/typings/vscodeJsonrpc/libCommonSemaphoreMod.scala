package typings.vscodeJsonrpc

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonSemaphoreMod {
  
  @JSImport("vscode-jsonrpc/lib/common/semaphore", "Semaphore")
  @js.native
  open class Semaphore[T] () extends StObject {
    def this(capacity: Double) = this()
    
    /* private */ var _active: Any = js.native
    
    /* private */ var _capacity: Any = js.native
    
    /* private */ var _waiting: Any = js.native
    
    def active: Double = js.native
    
    /* private */ var doRunNext: Any = js.native
    
    def lock(thunk: js.Function0[T | PromiseLike[T]]): js.Promise[T] = js.native
    
    /* private */ var runNext: Any = js.native
  }
}
