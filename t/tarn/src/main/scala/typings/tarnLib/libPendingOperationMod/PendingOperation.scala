package typings
package tarnLib.libPendingOperationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tarn/lib/PendingOperation", "PendingOperation")
@js.native
class PendingOperation[T] protected () extends js.Object {
  def this(timeoutMillis: scala.Double) = this()
  var deferred: tarnLib.libUtilsMod.Deferred[T] = js.native
  var possibleTimeoutCause: stdLib.Error | scala.Null = js.native
  var promise: js.Promise[T] = js.native
  var timeoutMillis: scala.Double = js.native
  def abort(): scala.Unit = js.native
  def reject(err: stdLib.Error): scala.Unit = js.native
  def resolve(value: T): scala.Unit = js.native
}

