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
    getState: js.Function0[T],
    subscribe: js.Function1[js.Function0[scala.Unit], SubscriptionId],
    unsubscribe: js.Function1[SubscriptionId, scala.Unit]
  ): Broadcast[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getState")(getState)
    __obj.updateDynamic("subscribe")(subscribe)
    __obj.updateDynamic("unsubscribe")(unsubscribe)
    __obj.asInstanceOf[Broadcast[T]]
  }
}

