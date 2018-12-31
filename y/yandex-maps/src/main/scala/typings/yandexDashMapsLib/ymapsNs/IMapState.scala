package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapState extends js.Object {
  var behaviors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var bounds: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.undefined
  var center: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var controls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var margin: js.UndefOr[js.Array[js.Array[scala.Double]] | js.Array[scala.Double]] = js.undefined
  var `type`: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsLibStrings.`yandex#map` | yandexDashMapsLib.yandexDashMapsLibStrings.`yandex#satellite` | yandexDashMapsLib.yandexDashMapsLibStrings.`yandex#hybrid`
  ] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

