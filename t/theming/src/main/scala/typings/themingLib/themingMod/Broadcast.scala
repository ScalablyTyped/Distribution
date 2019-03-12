package typings
package themingLib.themingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Broadcast[T /* <: Theme */] extends js.Object {
  def getState(): T
  def subscribe(callback: js.Function0[scala.Unit]): SubscriptionId
  def unsubscribe(id: SubscriptionId): scala.Unit
}

object Broadcast {
  @scala.inline
  def apply[T /* <: Theme */](
    getState: () => T,
    subscribe: js.Function0[scala.Unit] => SubscriptionId,
    unsubscribe: SubscriptionId => scala.Unit
  ): Broadcast[T] = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), subscribe = js.Any.fromFunction1(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe))
  
    __obj.asInstanceOf[Broadcast[T]]
  }
}

