package typings.tarn

import typings.tarn.utilsMod.Deferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tarn/dist/Resource", JSImport.Namespace)
@js.native
object resourceMod extends js.Object {
  @js.native
  class Resource[T] protected () extends js.Object {
    def this(resource: T) = this()
    var deferred: Deferred[Unit] = js.native
    var resource: T = js.native
    val timestamp: Double = js.native
    def promise: js.Promise[Unit] = js.native
    def resolve(): Resource[T] = js.native
  }
  
}

