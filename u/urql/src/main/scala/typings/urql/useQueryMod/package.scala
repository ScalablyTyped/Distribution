package typings.urql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object useQueryMod {
  type UseQueryResponse[T] = js.Tuple2[
    typings.urql.useQueryMod.UseQueryState[T], 
    js.Function1[/* opts */ js.UndefOr[typings.urql.anon.PartialOperationContext], scala.Unit]
  ]
}
