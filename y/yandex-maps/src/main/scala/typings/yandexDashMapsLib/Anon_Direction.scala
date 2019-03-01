package typings
package yandexDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Direction extends js.Object {
  var direction: js.UndefOr[js.Array[scala.Double] | java.lang.String] = js.undefined
  var layer: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsLibStrings.`yandex#panorama` | yandexDashMapsLib.yandexDashMapsLibStrings.`yandex#airPanorama`
  ] = js.undefined
  var span: js.UndefOr[js.Array[scala.Double] | java.lang.String] = js.undefined
}

object Anon_Direction {
  @scala.inline
  def apply(
    direction: js.Array[scala.Double] | java.lang.String = null,
    layer: yandexDashMapsLib.yandexDashMapsLibStrings.`yandex#panorama` | yandexDashMapsLib.yandexDashMapsLibStrings.`yandex#airPanorama` = null,
    span: js.Array[scala.Double] | java.lang.String = null
  ): Anon_Direction = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Direction]
  }
}

