package typings.yandexDashMaps.yandexDashMapsMod

import typings.yandexDashMaps.yandexDashMapsStrings.yandexNumbersignhybrid
import typings.yandexDashMaps.yandexDashMapsStrings.yandexNumbersignmap
import typings.yandexDashMaps.yandexDashMapsStrings.yandexNumbersignsatellite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapState extends js.Object {
  var behaviors: js.UndefOr[js.Array[String]] = js.undefined
  var bounds: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var center: js.UndefOr[js.Array[Double]] = js.undefined
  var controls: js.UndefOr[js.Array[String]] = js.undefined
  var margin: js.UndefOr[js.Array[js.Array[Double] | Double]] = js.undefined
  var `type`: js.UndefOr[yandexNumbersignmap | yandexNumbersignsatellite | yandexNumbersignhybrid] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object IMapState {
  @scala.inline
  def apply(
    behaviors: js.Array[String] = null,
    bounds: js.Array[js.Array[Double]] = null,
    center: js.Array[Double] = null,
    controls: js.Array[String] = null,
    margin: js.Array[js.Array[Double] | Double] = null,
    `type`: yandexNumbersignmap | yandexNumbersignsatellite | yandexNumbersignhybrid = null,
    zoom: Int | Double = null
  ): IMapState = {
    val __obj = js.Dynamic.literal()
    if (behaviors != null) __obj.updateDynamic("behaviors")(behaviors.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapState]
  }
}

