package typings.urqlCore.typesMod

import typings.urqlCore.clientMod.Client
import typings.urqlCore.urqlCoreStrings.cacheHit
import typings.urqlCore.urqlCoreStrings.cacheInvalidation
import typings.urqlCore.urqlCoreStrings.fetchError
import typings.urqlCore.urqlCoreStrings.fetchRequest
import typings.urqlCore.urqlCoreStrings.fetchSuccess
import typings.urqlCore.urqlCoreStrings.retryRetrying
import typings.wonka.wonkaTypesGenMod.sourceT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExchangeInput extends js.Object {
  var client: Client = js.native
  @JSName("forward")
  var forward_Original: ExchangeIO = js.native
  def dispatchDebug(t: DebugEventArg[String]): Unit = js.native
  @JSName("dispatchDebug")
  def dispatchDebug_cacheHit(t: DebugEventArg[cacheHit]): Unit = js.native
  @JSName("dispatchDebug")
  def dispatchDebug_cacheInvalidation(t: DebugEventArg[cacheInvalidation]): Unit = js.native
  @JSName("dispatchDebug")
  def dispatchDebug_fetchError(t: DebugEventArg[fetchError]): Unit = js.native
  @JSName("dispatchDebug")
  def dispatchDebug_fetchRequest(t: DebugEventArg[fetchRequest]): Unit = js.native
  @JSName("dispatchDebug")
  def dispatchDebug_fetchSuccess(t: DebugEventArg[fetchSuccess]): Unit = js.native
  @JSName("dispatchDebug")
  def dispatchDebug_retryRetrying(t: DebugEventArg[retryRetrying]): Unit = js.native
  def forward(ops$: sourceT[Operation]): sourceT[OperationResult[_]] = js.native
}

