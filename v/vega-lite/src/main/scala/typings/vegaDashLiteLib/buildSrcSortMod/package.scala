package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcSortMod {
  type Sort[F] = js.Array[scala.Double] | js.Array[java.lang.String] | js.Array[scala.Boolean] | js.Array[vegaDashLiteLib.buildSrcDatetimeMod.DateTime] | SortOrder | EncodingSortField[F] | scala.Null
  type SortOrder = vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgComparatorOrder | scala.Null
}
