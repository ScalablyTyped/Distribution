package typings
package whenLib.nodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolver[T] extends js.Object {
  def reject(reason: js.Any): scala.Unit = js.native
  def resolve(): scala.Unit = js.native
  def resolve(value: T): scala.Unit = js.native
  def resolve(value: whenLib.WhenNs.Promise[T]): scala.Unit = js.native
}

