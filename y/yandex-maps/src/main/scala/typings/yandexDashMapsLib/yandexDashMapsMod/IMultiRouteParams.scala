package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMultiRouteParams extends js.Object {
  var avoidTrafficJams: js.UndefOr[scala.Boolean] = js.undefined
  var boundedBy: js.UndefOr[js.Array[js.Array[scala.Double]] | scala.Null] = js.undefined
  var requestSendInterval: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var results: js.UndefOr[scala.Double] = js.undefined
  var reverseGeocoding: js.UndefOr[scala.Boolean] = js.undefined
  var routingMode: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsLibStrings.auto | yandexDashMapsLib.yandexDashMapsLibStrings.masstransit | yandexDashMapsLib.yandexDashMapsLibStrings.pedestrian
  ] = js.undefined
  var searchCoordOrder: js.UndefOr[java.lang.String] = js.undefined
  var strictBounds: js.UndefOr[scala.Boolean] = js.undefined
  var viaIndexes: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object IMultiRouteParams {
  @scala.inline
  def apply(
    avoidTrafficJams: js.UndefOr[scala.Boolean] = js.undefined,
    boundedBy: js.Array[js.Array[scala.Double]] = null,
    requestSendInterval: java.lang.String | scala.Double = null,
    results: scala.Int | scala.Double = null,
    reverseGeocoding: js.UndefOr[scala.Boolean] = js.undefined,
    routingMode: yandexDashMapsLib.yandexDashMapsLibStrings.auto | yandexDashMapsLib.yandexDashMapsLibStrings.masstransit | yandexDashMapsLib.yandexDashMapsLibStrings.pedestrian = null,
    searchCoordOrder: java.lang.String = null,
    strictBounds: js.UndefOr[scala.Boolean] = js.undefined,
    viaIndexes: js.Array[scala.Double] = null
  ): IMultiRouteParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(avoidTrafficJams)) __obj.updateDynamic("avoidTrafficJams")(avoidTrafficJams)
    if (boundedBy != null) __obj.updateDynamic("boundedBy")(boundedBy)
    if (requestSendInterval != null) __obj.updateDynamic("requestSendInterval")(requestSendInterval.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseGeocoding)) __obj.updateDynamic("reverseGeocoding")(reverseGeocoding)
    if (routingMode != null) __obj.updateDynamic("routingMode")(routingMode.asInstanceOf[js.Any])
    if (searchCoordOrder != null) __obj.updateDynamic("searchCoordOrder")(searchCoordOrder)
    if (!js.isUndefined(strictBounds)) __obj.updateDynamic("strictBounds")(strictBounds)
    if (viaIndexes != null) __obj.updateDynamic("viaIndexes")(viaIndexes)
    __obj.asInstanceOf[IMultiRouteParams]
  }
}

