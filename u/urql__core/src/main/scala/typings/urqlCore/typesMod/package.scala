package typings.urqlCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type DebugEvent[T /* <: typings.urqlCore.urqlCoreStrings.cacheHit | typings.urqlCore.urqlCoreStrings.cacheInvalidation | typings.urqlCore.urqlCoreStrings.fetchRequest | typings.urqlCore.urqlCoreStrings.fetchSuccess | typings.urqlCore.urqlCoreStrings.fetchError | typings.urqlCore.urqlCoreStrings.retryRetrying | java.lang.String */] = typings.urqlCore.typesMod.DebugEventArg[T] with typings.urqlCore.anon.Source
  type DebugEventArg[T /* <: typings.urqlCore.urqlCoreStrings.cacheHit | typings.urqlCore.urqlCoreStrings.cacheInvalidation | typings.urqlCore.urqlCoreStrings.fetchRequest | typings.urqlCore.urqlCoreStrings.fetchSuccess | typings.urqlCore.urqlCoreStrings.fetchError | typings.urqlCore.urqlCoreStrings.retryRetrying | java.lang.String */] = typings.urqlCore.anon.Message[T] with (typings.urqlCore.anon.`0` | typings.urqlCore.anon.Data[T])
  type Exchange = js.Function1[
    /* input */ typings.urqlCore.typesMod.ExchangeInput, 
    typings.urqlCore.typesMod.ExchangeIO
  ]
  type ExchangeIO = js.Function1[
    /* ops$ */ typings.wonka.wonkaTypesGenMod.sourceT[typings.urqlCore.typesMod.Operation], 
    typings.wonka.wonkaTypesGenMod.sourceT[typings.urqlCore.typesMod.OperationResult[js.Any]]
  ]
  type PromisifiedSource[T] = typings.wonka.wonkaTypesGenMod.sourceT[T] with typings.urqlCore.anon.ToPromise[T]
}
