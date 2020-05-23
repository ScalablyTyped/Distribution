package typings.venn.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutParameter extends js.Object {
  var lossFunction: js.UndefOr[
    js.Function2[/* sets */ StringDictionary[Circle], /* overlaps */ js.Array[Overlap], Double]
  ] = js.undefined
  var restarts: js.UndefOr[Double] = js.undefined
}

object LayoutParameter {
  @scala.inline
  def apply(
    lossFunction: (/* sets */ StringDictionary[Circle], /* overlaps */ js.Array[Overlap]) => Double = null,
    restarts: js.UndefOr[Double] = js.undefined
  ): LayoutParameter = {
    val __obj = js.Dynamic.literal()
    if (lossFunction != null) __obj.updateDynamic("lossFunction")(js.Any.fromFunction2(lossFunction))
    if (!js.isUndefined(restarts)) __obj.updateDynamic("restarts")(restarts.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutParameter]
  }
}

