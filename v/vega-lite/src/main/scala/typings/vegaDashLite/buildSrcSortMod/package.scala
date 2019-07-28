package typings.vegaDashLite

import typings.vegaDashLite.buildSrcDatetimeMod.DateTime
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgComparatorOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcSortMod {
  type Sort[F] = (js.Array[Boolean | DateTime | Double | String]) | SortOrder | EncodingSortField[F] | Null
  type SortOrder = VgComparatorOrder | Null
}
