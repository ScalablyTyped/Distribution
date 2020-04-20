package typings.wordpressPriorityQueue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdd extends js.Object {
  def add(context: js.Object, callback: js.Function0[Unit]): Unit
  def flush(context: js.Object): Boolean
}

object AnonAdd {
  @scala.inline
  def apply(add: (js.Object, js.Function0[Unit]) => Unit, flush: js.Object => Boolean): AnonAdd = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), flush = js.Any.fromFunction1(flush))
    __obj.asInstanceOf[AnonAdd]
  }
}

