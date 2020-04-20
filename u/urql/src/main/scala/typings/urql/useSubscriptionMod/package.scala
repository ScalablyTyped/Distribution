package typings.urql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object useSubscriptionMod {
  type SubscriptionHandler[T, R] = js.Function2[/* prev */ js.UndefOr[R], /* data */ T, R]
  type UseSubscriptionResponse[T] = js.Tuple2[
    typings.urql.useSubscriptionMod.UseSubscriptionState[T], 
    js.Function1[/* opts */ js.UndefOr[typings.urql.PartialOperationContext], scala.Unit]
  ]
}
