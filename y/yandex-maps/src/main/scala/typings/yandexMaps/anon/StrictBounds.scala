package typings.yandexMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictBounds extends js.Object {
  var boundedBy: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var strictBounds: js.UndefOr[Boolean] = js.undefined
}

object StrictBounds {
  @scala.inline
  def apply(
    boundedBy: js.Array[js.Array[Double]] = null,
    results: js.UndefOr[Double] = js.undefined,
    strictBounds: js.UndefOr[Boolean] = js.undefined
  ): StrictBounds = {
    val __obj = js.Dynamic.literal()
    if (boundedBy != null) __obj.updateDynamic("boundedBy")(boundedBy.asInstanceOf[js.Any])
    if (!js.isUndefined(results)) __obj.updateDynamic("results")(results.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strictBounds)) __obj.updateDynamic("strictBounds")(strictBounds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictBounds]
  }
}

