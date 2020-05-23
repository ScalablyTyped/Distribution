package typings.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreventDefault extends js.Object {
  def preventDefault(): Unit
}

object PreventDefault {
  @scala.inline
  def apply(preventDefault: () => Unit): PreventDefault = {
    val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault))
    __obj.asInstanceOf[PreventDefault]
  }
}

