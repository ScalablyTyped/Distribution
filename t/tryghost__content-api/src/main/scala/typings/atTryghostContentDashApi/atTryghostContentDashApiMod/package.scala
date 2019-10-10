package typings.atTryghostContentDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atTryghostContentDashApiMod {
  type ArrayOrValue[T] = T | js.Array[T]
  type BrowseFunction[T] = js.Function2[
    /* options */ js.UndefOr[Params], 
    /* memberToken */ js.UndefOr[Nullable[String]], 
    js.Promise[T]
  ]
  type FieldParam = String
  type FilterParam = String
  type LimitParam = Double | String
  type Nullable[T] = T | Null
  type OrderParam = String
  type PageParam = Double
  type ReadFunction[T] = js.Function3[
    /* data */ GhostData, 
    /* options */ js.UndefOr[Params], 
    /* memberToken */ js.UndefOr[Nullable[String]], 
    js.Promise[T]
  ]
}
