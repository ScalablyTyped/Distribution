package typings.tootallnateOnce

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](emitter: EventEmitter, name: String): CancelablePromise[T] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[T]]
  
  @JSImport("@tootallnate/once", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def spread[T /* <: js.Array[js.Any] */](emitter: EventEmitter, name: String): CancelablePromise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("spread")(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[T]]
  
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
