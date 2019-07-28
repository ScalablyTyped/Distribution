package typings.yandexDashMaps.yandexDashMapsMod

import typings.yandexDashMaps.yandexDashMapsStrings.auto
import typings.yandexDashMaps.yandexDashMapsStrings.masstransit
import typings.yandexDashMaps.yandexDashMapsStrings.pedestrian
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMultiRouteParams extends js.Object {
  var avoidTrafficJams: js.UndefOr[Boolean] = js.undefined
  var boundedBy: js.UndefOr[js.Array[js.Array[Double]] | Null] = js.undefined
  var requestSendInterval: js.UndefOr[String | Double] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var reverseGeocoding: js.UndefOr[Boolean] = js.undefined
  var routingMode: js.UndefOr[auto | masstransit | pedestrian] = js.undefined
  var searchCoordOrder: js.UndefOr[String] = js.undefined
  var strictBounds: js.UndefOr[Boolean] = js.undefined
  var viaIndexes: js.UndefOr[js.Array[Double]] = js.undefined
}

object IMultiRouteParams {
  @scala.inline
  def apply(
    avoidTrafficJams: js.UndefOr[Boolean] = js.undefined,
    boundedBy: js.Array[js.Array[Double]] = null,
    requestSendInterval: String | Double = null,
    results: Int | Double = null,
    reverseGeocoding: js.UndefOr[Boolean] = js.undefined,
    routingMode: auto | masstransit | pedestrian = null,
    searchCoordOrder: String = null,
    strictBounds: js.UndefOr[Boolean] = js.undefined,
    viaIndexes: js.Array[Double] = null
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

