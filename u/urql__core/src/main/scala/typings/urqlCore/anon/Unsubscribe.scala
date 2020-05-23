package typings.urqlCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unsubscribe extends js.Object {
  def unsubscribe(): Unit
}

object Unsubscribe {
  @scala.inline
  def apply(unsubscribe: () => Unit): Unsubscribe = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[Unsubscribe]
  }
}

