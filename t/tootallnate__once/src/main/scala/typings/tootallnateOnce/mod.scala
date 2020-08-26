package typings.tootallnateOnce

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tootallnate/once", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait CancelablePromise[T]
    extends js.Promise[T] {
    @JSName("cancel")
    var cancel_Original: CancelFunction = js.native
    def cancel(): Unit = js.native
  }
  
  def apply[T](emitter: EventEmitter, name: String): CancelablePromise[T] = js.native
  def spread[T /* <: js.Array[_] */](emitter: EventEmitter, name: String): CancelablePromise[T] = js.native
  type CancelFunction = js.Function0[Unit]
  type CancellablePromise[T] = CancelablePromise[T]
}

