package typings.xstate.libInterpreterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clock extends js.Object {
  def clearTimeout(id: js.Any): Unit
  def setTimeout(fn: js.Function1[/* repeated */ js.Any, Unit], timeout: Double): js.Any
}

object Clock {
  @scala.inline
  def apply(
    clearTimeout: js.Any => Unit,
    setTimeout: (js.Function1[/* repeated */ js.Any, Unit], Double) => js.Any
  ): Clock = {
    val __obj = js.Dynamic.literal(clearTimeout = js.Any.fromFunction1(clearTimeout), setTimeout = js.Any.fromFunction2(setTimeout))
  
    __obj.asInstanceOf[Clock]
  }
}

