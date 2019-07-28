package typings.vegaDashEmbed

import typings.vegaDashLite.buildSrcSortMod.Sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsort extends js.Object {
  def isSortArray[F](sort: Sort[F]): Boolean
  def isSortField[F](sort: Sort[F]): /* is vega-lite.vega-lite/build/src/sort.EncodingSortField<F> */ Boolean
}

object Typeofsort {
  @scala.inline
  def apply(
    isSortArray: Sort[js.Any] => Boolean,
    isSortField: Sort[js.Any] => /* is vega-lite.vega-lite/build/src/sort.EncodingSortField<F> */ Boolean
  ): Typeofsort = {
    val __obj = js.Dynamic.literal(isSortArray = js.Any.fromFunction1(isSortArray), isSortField = js.Any.fromFunction1(isSortField))
  
    __obj.asInstanceOf[Typeofsort]
  }
}

