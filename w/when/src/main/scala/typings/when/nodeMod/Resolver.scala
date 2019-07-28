package typings.when.nodeMod

import typings.when.WhenNs.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolver[T] extends js.Object {
  def reject(reason: js.Any): Unit = js.native
  def resolve(): Unit = js.native
  def resolve(value: T): Unit = js.native
  def resolve(value: Promise[T]): Unit = js.native
}

