package typings.urqlCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Exchange = js.Function1[
    /* input */ typings.urqlCore.typesMod.ExchangeInput, 
    typings.urqlCore.typesMod.ExchangeIO
  ]
  type ExchangeIO = js.Function1[
    /* ops$ */ typings.wonka.wonkaTypesGenMod.sourceT[typings.urqlCore.typesMod.Operation], 
    typings.wonka.wonkaTypesGenMod.sourceT[typings.urqlCore.typesMod.OperationResult[js.Any]]
  ]
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  type PromisifiedSource[T] = typings.wonka.wonkaTypesGenMod.sourceT[T] with typings.urqlCore.AnonToPromise[T]
}
