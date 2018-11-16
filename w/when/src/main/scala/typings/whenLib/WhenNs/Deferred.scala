package typings
package whenLib.WhenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deferred[T] extends js.Object {
  var promise: Promise[T] = js.native
  def notify(update: js.Any): scala.Unit = js.native
  def reject(reason: js.Any): scala.Unit = js.native
  def resolve(): scala.Unit = js.native
  def resolve(value: T): scala.Unit = js.native
  def resolve(value: Promise[T]): scala.Unit = js.native
}

