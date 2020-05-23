package typings.urqlCore.anon

import typings.urqlCore.typesMod.DebugEventArg
import typings.urqlCore.urqlCoreStrings.cacheHit
import typings.urqlCore.urqlCoreStrings.cacheInvalidation
import typings.urqlCore.urqlCoreStrings.fetchError
import typings.urqlCore.urqlCoreStrings.fetchRequest
import typings.urqlCore.urqlCoreStrings.fetchSuccess
import typings.urqlCore.urqlCoreStrings.retryRetrying
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@urql/core.@urql/core/dist/types/types.ExchangeInput, 'dispatchDebug'> */
@js.native
trait PickExchangeInputdispatch extends js.Object {
  @JSName("dispatchDebug")
  var dispatchDebug_Original: js.Function1[
    /* t */ DebugEventArg[
      cacheHit | cacheInvalidation | fetchRequest | fetchSuccess | fetchError | retryRetrying | String
    ], 
    Unit
  ] = js.native
  def dispatchDebug[T /* <: cacheHit | cacheInvalidation | fetchRequest | fetchSuccess | fetchError | retryRetrying | String */](t: DebugEventArg[T]): Unit = js.native
}

