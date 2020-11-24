package typings.tootallnateOnce

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tootallnate/once", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply[T](emitter: EventEmitter, name: String): CancelablePromise[T] = js.native
  
  def spread[T /* <: js.Array[_] */](emitter: EventEmitter, name: String): CancelablePromise[T] = js.native
  
  @js.native
  trait CancelablePromise[T]
    extends js.Promise[T] {
    
    def cancel(): Unit = js.native
    @JSName("cancel")
    var cancel_Original: CancelFunction = js.native
  }
  
  type CancelFunction = js.Function0[Unit]
  
  type CancellablePromise[T] = CancelablePromise[T]
}
