package typings.wonka.wonkaTypesGenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subscriptionT extends js.Object {
  def unsubscribe(_1: Unit): Unit
}

object subscriptionT {
  @scala.inline
  def apply(unsubscribe: Unit => Unit): subscriptionT = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction1(unsubscribe))
    __obj.asInstanceOf[subscriptionT]
  }
}

