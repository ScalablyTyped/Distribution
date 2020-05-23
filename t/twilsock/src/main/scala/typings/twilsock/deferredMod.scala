package typings.twilsock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/deferred", JSImport.Namespace)
@js.native
object deferredMod extends js.Object {
  @js.native
  class Deferred[T] () extends js.Object {
    var _promise: js.Any = js.native
    var _reject: js.Any = js.native
    var _resolve: js.Any = js.native
    var current: T = js.native
    def fail(e: js.Any): Unit = js.native
    def promise: js.Promise[T] = js.native
    def set(value: T): Unit = js.native
    def update(value: T): Unit = js.native
  }
  
}

