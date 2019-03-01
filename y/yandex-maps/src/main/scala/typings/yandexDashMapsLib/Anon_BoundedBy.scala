package typings
package yandexDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoundedBy extends js.Object {
  var boundedBy: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.undefined
  var results: js.UndefOr[scala.Double] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
  var strictBounds: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_BoundedBy {
  @scala.inline
  def apply(
    boundedBy: js.Array[js.Array[scala.Double]] = null,
    results: scala.Int | scala.Double = null,
    skip: scala.Int | scala.Double = null,
    strictBounds: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_BoundedBy = {
    val __obj = js.Dynamic.literal()
    if (boundedBy != null) __obj.updateDynamic("boundedBy")(boundedBy)
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (!js.isUndefined(strictBounds)) __obj.updateDynamic("strictBounds")(strictBounds)
    __obj.asInstanceOf[Anon_BoundedBy]
  }
}

