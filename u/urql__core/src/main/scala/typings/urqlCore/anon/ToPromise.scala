package typings.urqlCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToPromise[T] extends js.Object {
  def toPromise(): js.Promise[T]
}

object ToPromise {
  @scala.inline
  def apply[T](toPromise: () => js.Promise[T]): ToPromise[T] = {
    val __obj = js.Dynamic.literal(toPromise = js.Any.fromFunction0(toPromise))
    __obj.asInstanceOf[ToPromise[T]]
  }
}

