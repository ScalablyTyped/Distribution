package typings.xstate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value[TC] extends js.Object {
  var context: TC
  var value: js.Any
}

object Value {
  @scala.inline
  def apply[TC](context: TC, value: js.Any): Value[TC] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[TC]]
  }
}

