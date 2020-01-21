package typings.waterline

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCb[T] extends js.Object {
  def exec(cb: js.Function2[/* err */ Error, /* result */ T, _]): Unit
}

object AnonCb {
  @scala.inline
  def apply[T](exec: js.Function2[/* err */ Error, /* result */ T, _] => Unit): AnonCb[T] = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec))
  
    __obj.asInstanceOf[AnonCb[T]]
  }
}

