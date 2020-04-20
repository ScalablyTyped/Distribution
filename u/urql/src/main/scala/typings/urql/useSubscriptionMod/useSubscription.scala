package typings.urql.useSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("urql/dist/types/hooks/useSubscription", "useSubscription")
@js.native
object useSubscription extends js.Object {
  def apply[T, R, V](args: UseSubscriptionArgs[V]): UseSubscriptionResponse[R] = js.native
  def apply[T, R, V](args: UseSubscriptionArgs[V], handler: SubscriptionHandler[T, R]): UseSubscriptionResponse[R] = js.native
}

