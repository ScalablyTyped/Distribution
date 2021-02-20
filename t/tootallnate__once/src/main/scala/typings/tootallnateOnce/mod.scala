package typings.tootallnateOnce

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tootallnate/once", JSImport.Namespace)
  @js.native
  def apply[T](emitter: EventEmitter, name: String): CancelablePromise[T] = js.native
  
  @JSImport("@tootallnate/once", "spread")
  @js.native
  def spread[T /* <: js.Array[_] */](emitter: EventEmitter, name: String): CancelablePromise[T] = js.native
  
  type CancelFunction = js.Function0[Unit]
  
  @js.native
  trait CancelablePromise[T]
    extends js.Promise[T] {
    
    def cancel(): Unit = js.native
    @JSName("cancel")
    var cancel_Original: CancelFunction = js.native
  }
  
  type CancellablePromise[T] = CancelablePromise[T]
}
