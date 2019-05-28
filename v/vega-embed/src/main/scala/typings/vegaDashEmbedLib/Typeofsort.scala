package typings
package vegaDashEmbedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsort extends js.Object {
  def isSortArray[F](sort: vegaDashLiteLib.buildSrcSortMod.Sort[F]): scala.Boolean
  def isSortField[F](sort: vegaDashLiteLib.buildSrcSortMod.Sort[F]): /* is vega-lite.vega-lite/build/src/sort.EncodingSortField<F> */ scala.Boolean
}

object Typeofsort {
  @scala.inline
  def apply(
    isSortArray: vegaDashLiteLib.buildSrcSortMod.Sort[js.Any] => scala.Boolean,
    isSortField: vegaDashLiteLib.buildSrcSortMod.Sort[js.Any] => /* is vega-lite.vega-lite/build/src/sort.EncodingSortField<F> */ scala.Boolean
  ): Typeofsort = {
    val __obj = js.Dynamic.literal(isSortArray = js.Any.fromFunction1(isSortArray), isSortField = js.Any.fromFunction1(isSortField))
  
    __obj.asInstanceOf[Typeofsort]
  }
}

