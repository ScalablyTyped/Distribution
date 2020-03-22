package typings.tootallnateOnce

import typings.node.eventsMod.EventEmitter
import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tootallnate/once", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait CancellablePromise[T] extends Promise[T] {
    @JSName("cancel")
    var cancel_Original: CancelFunction = js.native
    def cancel(): Unit = js.native
  }
  
  def apply[T](emitter: EventEmitter, name: String): CancellablePromise[T] = js.native
  type CancelFunction = js.Function0[Unit]
}

