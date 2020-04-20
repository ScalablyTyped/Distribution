package typings.urql.subscriptionMod

import typings.urql.PartialOperationContext
import typings.urql.useSubscriptionMod.UseSubscriptionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionState[T] extends UseSubscriptionState[T] {
  def executeSubscription(): Unit = js.native
  def executeSubscription(opts: PartialOperationContext): Unit = js.native
}

