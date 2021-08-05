package typings.twilsock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deferredMod {
  
  @JSImport("twilsock/lib/deferred", "Deferred")
  @js.native
  class Deferred[T] () extends StObject {
    
    /* private */ var _promise: js.Any = js.native
    
    /* private */ var _reject: js.Any = js.native
    
    /* private */ var _resolve: js.Any = js.native
    
    var current: T = js.native
    
    def fail(e: js.Any): Unit = js.native
    
    def promise: js.Promise[T] = js.native
    
    def set(value: T): Unit = js.native
    
    def update(value: T): Unit = js.native
  }
}
