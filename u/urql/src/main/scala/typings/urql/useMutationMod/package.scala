package typings.urql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object useMutationMod {
  type UseMutationResponse[T, V] = js.Tuple2[
    typings.urql.useMutationMod.UseMutationState[T], 
    js.Function2[
      /* variables */ js.UndefOr[V], 
      /* context */ js.UndefOr[typings.urql.PartialOperationContext], 
      js.Promise[typings.urqlCore.typesMod.OperationResult[T]]
    ]
  ]
}
