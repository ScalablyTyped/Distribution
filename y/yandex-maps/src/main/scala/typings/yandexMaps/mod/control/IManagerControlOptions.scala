package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.Bottom
import typings.yandexMaps.yandexMapsStrings.left
import typings.yandexMaps.yandexMapsStrings.none
import typings.yandexMaps.yandexMapsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IManagerControlOptions extends js.Object {
  var float: js.UndefOr[none | left | right] = js.undefined
  var floatIndex: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[Bottom] = js.undefined
}

object IManagerControlOptions {
  @scala.inline
  def apply(
    float: none | left | right = null,
    floatIndex: js.UndefOr[Double] = js.undefined,
    position: Bottom = null
  ): IManagerControlOptions = {
    val __obj = js.Dynamic.literal()
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (!js.isUndefined(floatIndex)) __obj.updateDynamic("floatIndex")(floatIndex.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IManagerControlOptions]
  }
}

