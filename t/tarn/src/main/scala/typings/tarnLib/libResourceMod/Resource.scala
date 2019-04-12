package typings
package tarnLib.libResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tarn/lib/Resource", "Resource")
@js.native
class Resource[T] protected () extends js.Object {
  def this(resource: T) = this()
  var deferred: tarnLib.libUtilsMod.Deferred[scala.Unit] = js.native
  val promise: js.Promise[scala.Unit] = js.native
  var resource: T = js.native
  val timestamp: scala.Double = js.native
  def resolve(): Resource[T] = js.native
}

