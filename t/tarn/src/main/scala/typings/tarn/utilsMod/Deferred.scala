package typings.tarn.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deferred[T] extends js.Object {
  var promise: js.Promise[T]
  def reject[T](err: T): js.Any
  def resolve(`val`: T): js.Any
}

object Deferred {
  @scala.inline
  def apply[T](promise: js.Promise[T], reject: js.Any => js.Any, resolve: T => js.Any): Deferred[T] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[Deferred[T]]
  }
}

