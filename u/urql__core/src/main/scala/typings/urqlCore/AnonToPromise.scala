package typings.urqlCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToPromise[T] extends js.Object {
  def toPromise(): js.Promise[T]
}

object AnonToPromise {
  @scala.inline
  def apply[T](toPromise: () => js.Promise[T]): AnonToPromise[T] = {
    val __obj = js.Dynamic.literal(toPromise = js.Any.fromFunction0(toPromise))
    __obj.asInstanceOf[AnonToPromise[T]]
  }
}

