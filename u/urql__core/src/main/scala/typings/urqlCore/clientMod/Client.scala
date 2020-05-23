package typings.urqlCore.clientMod

import typings.graphql.astMod.DocumentNode
import typings.std.RequestInit
import typings.urqlCore.anon.FnCall
import typings.urqlCore.anon.PartialOperationContext
import typings.urqlCore.typesMod.DebugEvent
import typings.urqlCore.typesMod.GraphQLRequest
import typings.urqlCore.typesMod.Operation
import typings.urqlCore.typesMod.OperationResult
import typings.urqlCore.typesMod.OperationType
import typings.urqlCore.typesMod.PromisifiedSource
import typings.urqlCore.typesMod.RequestPolicy
import typings.wonka.wonkaTypesGenMod.sinkT
import typings.wonka.wonkaTypesGenMod.sourceT
import typings.wonka.wonkaTypesGenMod.subscriptionT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@urql/core/dist/types/client", "Client")
@js.native
class Client protected () extends js.Object {
  def this(opts: ClientOptions) = this()
  var activeOperations: ActiveOperations = js.native
  var createOperationContext: js.Any = js.native
  var fetch: js.UndefOr[FnCall] = js.native
  var fetchOptions: js.UndefOr[RequestInit | js.Function0[RequestInit]] = js.native
  var maskTypename: Boolean = js.native
  /** Deletes an active operation's result observable and sends a teardown signal through the exchange pipeline */
  var onOperationEnd: js.Any = js.native
  /** Counts up the active operation key and dispatches the operation */
  var onOperationStart: js.Any = js.native
  @JSName("operations$")
  var operations$_Original: sourceT[Operation] = js.native
  var preferGetMethod: Boolean = js.native
  var queue: js.Array[Operation] = js.native
  var requestPolicy: RequestPolicy = js.native
  @JSName("results$")
  var results$_Original: sourceT[OperationResult[_]] = js.native
  var subscribeToDebugTarget: js.UndefOr[
    js.Function1[/* onEvent */ js.Function1[/* e */ DebugEvent[String], Unit], subscriptionT]
  ] = js.native
  var suspense: Boolean = js.native
  var url: String = js.native
  def createRequestOperation(`type`: OperationType, request: GraphQLRequest): Operation = js.native
  def createRequestOperation(`type`: OperationType, request: GraphQLRequest, opts: PartialOperationContext): Operation = js.native
  def dispatchOperation(): Unit = js.native
  def dispatchOperation(operation: Operation): Unit = js.native
  def executeMutation[Data](query: GraphQLRequest): sourceT[OperationResult[Data]] = js.native
  def executeMutation[Data](query: GraphQLRequest, opts: PartialOperationContext): sourceT[OperationResult[Data]] = js.native
  def executeQuery[Data](query: GraphQLRequest): sourceT[OperationResult[Data]] = js.native
  def executeQuery[Data](query: GraphQLRequest, opts: PartialOperationContext): sourceT[OperationResult[Data]] = js.native
  /** Executes an Operation by sending it through the exchange pipeline It returns an observable that emits all related exchange results and keeps track of this observable's subscribers. A teardown signal will be emitted when no subscribers are listening anymore. */
  def executeRequestOperation(operation: Operation): sourceT[OperationResult[_]] = js.native
  def executeSubscription(query: GraphQLRequest): sourceT[OperationResult[_]] = js.native
  def executeSubscription(query: GraphQLRequest, opts: PartialOperationContext): sourceT[OperationResult[_]] = js.native
  def mutation[Data, Variables /* <: js.Object */](query: String): PromisifiedSource[OperationResult[Data]] = js.native
  def mutation[Data, Variables /* <: js.Object */](query: String, variables: Variables): PromisifiedSource[OperationResult[Data]] = js.native
  def mutation[Data, Variables /* <: js.Object */](query: String, variables: Variables, context: PartialOperationContext): PromisifiedSource[OperationResult[Data]] = js.native
  def mutation[Data, Variables /* <: js.Object */](query: DocumentNode): PromisifiedSource[OperationResult[Data]] = js.native
  def mutation[Data, Variables /* <: js.Object */](query: DocumentNode, variables: Variables): PromisifiedSource[OperationResult[Data]] = js.native
  def mutation[Data, Variables /* <: js.Object */](query: DocumentNode, variables: Variables, context: PartialOperationContext): PromisifiedSource[OperationResult[Data]] = js.native
  @JSName("operations$")
  def operations$(_1: sinkT[Operation]): Unit = js.native
  def query[Data, Variables /* <: js.Object */](query: String): PromisifiedSource[OperationResult[Data]] = js.native
  def query[Data, Variables /* <: js.Object */](query: String, variables: Variables): PromisifiedSource[OperationResult[Data]] = js.native
  def query[Data, Variables /* <: js.Object */](query: String, variables: Variables, context: PartialOperationContext): PromisifiedSource[OperationResult[Data]] = js.native
  def query[Data, Variables /* <: js.Object */](query: DocumentNode): PromisifiedSource[OperationResult[Data]] = js.native
  def query[Data, Variables /* <: js.Object */](query: DocumentNode, variables: Variables): PromisifiedSource[OperationResult[Data]] = js.native
  def query[Data, Variables /* <: js.Object */](query: DocumentNode, variables: Variables, context: PartialOperationContext): PromisifiedSource[OperationResult[Data]] = js.native
  def readQuery[Data, Variables /* <: js.Object */](query: String): OperationResult[Data] | Null = js.native
  def readQuery[Data, Variables /* <: js.Object */](query: String, variables: Variables): OperationResult[Data] | Null = js.native
  def readQuery[Data, Variables /* <: js.Object */](query: String, variables: Variables, context: PartialOperationContext): OperationResult[Data] | Null = js.native
  def readQuery[Data, Variables /* <: js.Object */](query: DocumentNode): OperationResult[Data] | Null = js.native
  def readQuery[Data, Variables /* <: js.Object */](query: DocumentNode, variables: Variables): OperationResult[Data] | Null = js.native
  def readQuery[Data, Variables /* <: js.Object */](query: DocumentNode, variables: Variables, context: PartialOperationContext): OperationResult[Data] | Null = js.native
  def reexecuteOperation(operation: Operation): Unit = js.native
  @JSName("results$")
  def results$(_1: sinkT[OperationResult[_]]): Unit = js.native
}

