package typings.workboxCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateDeferredMod {
  
  /**
    * The Deferred class composes Promises in a way that allows for them to be
    * resolved or rejected from outside the constructor. In most cases promises
    * should be used directly, but Deferreds can be necessary when the logic to
    * resolve a promise must be separate.
    *
    * @private
    */
  @JSImport("workbox-core/_private/Deferred", "Deferred")
  @js.native
  /**
    * Creates a promise and exposes its resolve and reject functions as methods.
    */
  open class Deferred[T] () extends StObject {
    
    var promise: js.Promise[T] = js.native
    
    def reject(): Unit = js.native
    def reject(reason: Any): Unit = js.native
    
    def resolve(value: T): Unit = js.native
  }
}
