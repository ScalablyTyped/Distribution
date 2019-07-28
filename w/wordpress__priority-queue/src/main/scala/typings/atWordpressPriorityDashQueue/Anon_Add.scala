package typings.atWordpressPriorityDashQueue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Add extends js.Object {
  def add(context: js.Object, callback: js.Function0[Unit]): Unit
  def flush(context: js.Object): Boolean
}

object Anon_Add {
  @scala.inline
  def apply(add: (js.Object, js.Function0[Unit]) => Unit, flush: js.Object => Boolean): Anon_Add = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), flush = js.Any.fromFunction1(flush))
  
    __obj.asInstanceOf[Anon_Add]
  }
}

