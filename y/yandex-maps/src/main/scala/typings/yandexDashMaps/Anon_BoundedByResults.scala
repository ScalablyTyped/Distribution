package typings.yandexDashMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoundedByResults extends js.Object {
  var boundedBy: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var strictBounds: js.UndefOr[Boolean] = js.undefined
}

object Anon_BoundedByResults {
  @scala.inline
  def apply(
    boundedBy: js.Array[js.Array[Double]] = null,
    results: Int | Double = null,
    strictBounds: js.UndefOr[Boolean] = js.undefined
  ): Anon_BoundedByResults = {
    val __obj = js.Dynamic.literal()
    if (boundedBy != null) __obj.updateDynamic("boundedBy")(boundedBy)
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (!js.isUndefined(strictBounds)) __obj.updateDynamic("strictBounds")(strictBounds)
    __obj.asInstanceOf[Anon_BoundedByResults]
  }
}

