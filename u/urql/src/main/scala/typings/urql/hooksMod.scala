package typings.urql

import typings.graphql.astMod.DocumentNode
import typings.urql.useMutationMod.UseMutationResponse
import typings.urql.useQueryMod.UseQueryArgs
import typings.urql.useQueryMod.UseQueryResponse
import typings.urql.useSubscriptionMod.SubscriptionHandler
import typings.urql.useSubscriptionMod.UseSubscriptionArgs
import typings.urql.useSubscriptionMod.UseSubscriptionResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("urql/dist/types/hooks", JSImport.Namespace)
@js.native
object hooksMod extends js.Object {
  def useMutation[T, V](query: String): UseMutationResponse[T, V] = js.native
  def useMutation[T, V](query: DocumentNode): UseMutationResponse[T, V] = js.native
  def useQuery[T, V](args: UseQueryArgs[V]): UseQueryResponse[T] = js.native
  def useSubscription[T, R, V](args: UseSubscriptionArgs[V]): UseSubscriptionResponse[R] = js.native
  def useSubscription[T, R, V](args: UseSubscriptionArgs[V], handler: SubscriptionHandler[T, R]): UseSubscriptionResponse[R] = js.native
}

