package typings.xstate.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unsubscribable extends js.Object {
  def unsubscribe(): js.Any | Unit
}

object Unsubscribable {
  @scala.inline
  def apply(unsubscribe: () => js.Any | Unit): Unsubscribable = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
  
    __obj.asInstanceOf[Unsubscribable]
  }
}

