package typings.wonka.wonkaTypesGenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subscriptionT extends js.Object {
  def unsubscribe(): Unit
}

object subscriptionT {
  @scala.inline
  def apply(unsubscribe: () => Unit): subscriptionT = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[subscriptionT]
  }
}

