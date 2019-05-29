package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapState extends js.Object {
  var behaviors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var bounds: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.undefined
  var center: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var controls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var margin: js.UndefOr[js.Array[js.Array[scala.Double] | scala.Double]] = js.undefined
  var `type`: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsLibStrings.`yandex#map` | yandexDashMapsLib.yandexDashMapsLibStrings.`yandex#satellite` | yandexDashMapsLib.yandexDashMapsLibStrings.`yandex#hybrid`
  ] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object IMapState {
  @scala.inline
  def apply(
    behaviors: js.Array[java.lang.String] = null,
    bounds: js.Array[js.Array[scala.Double]] = null,
    center: js.Array[scala.Double] = null,
    controls: js.Array[java.lang.String] = null,
    margin: js.Array[js.Array[scala.Double] | scala.Double] = null,
    `type`: yandexDashMapsLib.yandexDashMapsLibStrings.`yandex#map` | yandexDashMapsLib.yandexDashMapsLibStrings.`yandex#satellite` | yandexDashMapsLib.yandexDashMapsLibStrings.`yandex#hybrid` = null,
    zoom: scala.Int | scala.Double = null
  ): IMapState = {
    val __obj = js.Dynamic.literal()
    if (behaviors != null) __obj.updateDynamic("behaviors")(behaviors)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (center != null) __obj.updateDynamic("center")(center)
    if (controls != null) __obj.updateDynamic("controls")(controls)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapState]
  }
}

