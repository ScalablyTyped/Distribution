package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcSortMod {
  type Sort[F] = (js.Array[
    scala.Boolean | vegaDashLiteLib.buildSrcDatetimeMod.DateTime | scala.Double | java.lang.String
  ]) | SortOrder | EncodingSortField[F] | scala.Null
  type SortOrder = vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgComparatorOrder | scala.Null
}
