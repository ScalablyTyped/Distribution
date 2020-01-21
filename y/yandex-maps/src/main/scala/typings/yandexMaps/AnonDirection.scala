package typings.yandexMaps

import typings.yandexMaps.yandexMapsStrings.yandexNumbersignairPanorama
import typings.yandexMaps.yandexMapsStrings.yandexNumbersignpanorama
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirection extends js.Object {
  var direction: js.UndefOr[js.Array[Double] | String] = js.undefined
  var layer: js.UndefOr[yandexNumbersignpanorama | yandexNumbersignairPanorama] = js.undefined
  var span: js.UndefOr[js.Array[Double] | String] = js.undefined
}

object AnonDirection {
  @scala.inline
  def apply(
    direction: js.Array[Double] | String = null,
    layer: yandexNumbersignpanorama | yandexNumbersignairPanorama = null,
    span: js.Array[Double] | String = null
  ): AnonDirection = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirection]
  }
}

