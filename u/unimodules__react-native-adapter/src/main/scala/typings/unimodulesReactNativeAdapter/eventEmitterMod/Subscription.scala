package typings.unimodulesReactNativeAdapter.eventEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  def remove(): Unit
}

object Subscription {
  @scala.inline
  def apply(remove: () => Unit): Subscription = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[Subscription]
  }
}

