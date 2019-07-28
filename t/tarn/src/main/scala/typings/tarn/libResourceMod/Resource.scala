package typings.tarn.libResourceMod

import typings.tarn.libUtilsMod.Deferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tarn/lib/Resource", "Resource")
@js.native
class Resource[T] protected () extends js.Object {
  def this(resource: T) = this()
  var deferred: Deferred[Unit] = js.native
  val promise: js.Promise[Unit] = js.native
  var resource: T = js.native
  val timestamp: Double = js.native
  def resolve(): Resource[T] = js.native
}

