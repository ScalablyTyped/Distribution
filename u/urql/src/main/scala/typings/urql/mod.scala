package typings.urql

import typings.graphql.astMod.DocumentNode
import typings.react.mod.ReactElement
import typings.std.Error
import typings.urql.mutationMod.MutationProps
import typings.urql.queryMod.QueryProps
import typings.urql.subscriptionMod.SubscriptionProps
import typings.urql.useMutationMod.UseMutationResponse
import typings.urql.useQueryMod.UseQueryArgs
import typings.urql.useQueryMod.UseQueryResponse
import typings.urql.useSubscriptionMod.SubscriptionHandler
import typings.urql.useSubscriptionMod.UseSubscriptionArgs
import typings.urql.useSubscriptionMod.UseSubscriptionResponse
import typings.urqlCore.AnonNetworkError
import typings.urqlCore.clientMod.ClientOptions
import typings.urqlCore.ssrMod.SSRExchangeParams
import typings.urqlCore.ssrMod.SSRExchange_
import typings.urqlCore.subscriptionMod.SubscriptionExchangeOpts
import typings.urqlCore.typesMod.Exchange
import typings.urqlCore.typesMod.ExchangeIO
import typings.urqlCore.typesMod.GraphQLRequest
import typings.urqlCore.typesMod.Operation
import typings.urqlCore.typesMod.OperationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("urql", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Client protected ()
    extends typings.urqlCore.mod.Client {
    def this(opts: ClientOptions) = this()
  }
  
  @js.native
  class CombinedError protected ()
    extends typings.urqlCore.mod.CombinedError {
    def this(hasNetworkErrorGraphQLErrorsResponse: AnonNetworkError) = this()
  }
  
  val Consumer: typings.react.mod.Consumer[typings.urqlCore.mod.Client] = js.native
  val Context: typings.react.mod.Context[typings.urqlCore.mod.Client] = js.native
  val Provider: typings.react.mod.Provider[typings.urqlCore.mod.Client] = js.native
  val cacheExchange: Exchange = js.native
  val debugExchange: Exchange = js.native
  val dedupExchange: Exchange = js.native
  val defaultExchanges: js.Array[Exchange] = js.native
  val fallbackExchangeIO: ExchangeIO = js.native
  val fetchExchange: Exchange = js.native
  def Mutation[T, V](props: MutationProps[T, V]): ReactElement = js.native
  def Query[T, V](props: QueryProps[T, V]): ReactElement = js.native
  def Subscription[T, R, V](props: SubscriptionProps[T, R, V]): ReactElement = js.native
  def composeExchanges(exchanges: js.Array[Exchange]): Exchange = js.native
  def createClient(opts: ClientOptions): typings.urqlCore.clientMod.Client = js.native
  def createRequest(q: String): GraphQLRequest = js.native
  def createRequest(q: String, vars: js.Object): GraphQLRequest = js.native
  def createRequest(q: DocumentNode): GraphQLRequest = js.native
  def createRequest(q: DocumentNode, vars: js.Object): GraphQLRequest = js.native
  def formatDocument(node: DocumentNode): js.Any = js.native
  def makeErrorResult(operation: Operation, error: Error): OperationResult[_] = js.native
  def makeErrorResult(operation: Operation, error: Error, response: js.Any): OperationResult[_] = js.native
  def makeResult(operation: Operation, result: js.Any): OperationResult[_] = js.native
  def makeResult(operation: Operation, result: js.Any, response: js.Any): OperationResult[_] = js.native
  def maskTypename(data: js.Any): js.Any = js.native
  def ssrExchange(): SSRExchange_ = js.native
  def ssrExchange(params: SSRExchangeParams): SSRExchange_ = js.native
  def stringifyVariables(x: js.Any): String = js.native
  def subscriptionExchange(hasForwardSubscriptionEnableAllOperations: SubscriptionExchangeOpts): Exchange = js.native
  def useClient(): typings.urqlCore.mod.Client = js.native
  def useMutation[T, V](query: String): UseMutationResponse[T, V] = js.native
  def useMutation[T, V](query: DocumentNode): UseMutationResponse[T, V] = js.native
  def useQuery[T, V](args: UseQueryArgs[V]): UseQueryResponse[T] = js.native
  def useSubscription[T, R, V](args: UseSubscriptionArgs[V]): UseSubscriptionResponse[R] = js.native
  def useSubscription[T, R, V](args: UseSubscriptionArgs[V], handler: SubscriptionHandler[T, R]): UseSubscriptionResponse[R] = js.native
}

