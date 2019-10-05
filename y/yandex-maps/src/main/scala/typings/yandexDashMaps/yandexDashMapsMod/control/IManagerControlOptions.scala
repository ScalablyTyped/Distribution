package typings.yandexDashMaps.yandexDashMapsMod.control

import typings.yandexDashMaps.Anon_Bottom
import typings.yandexDashMaps.yandexDashMapsStrings.left
import typings.yandexDashMaps.yandexDashMapsStrings.none
import typings.yandexDashMaps.yandexDashMapsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IManagerControlOptions extends js.Object {
  var float: js.UndefOr[none | left | right] = js.undefined
  var floatIndex: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[Anon_Bottom] = js.undefined
}

object IManagerControlOptions {
  @scala.inline
  def apply(float: none | left | right = null, floatIndex: Int | Double = null, position: Anon_Bottom = null): IManagerControlOptions = {
    val __obj = js.Dynamic.literal()
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (floatIndex != null) __obj.updateDynamic("floatIndex")(floatIndex.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[IManagerControlOptions]
  }
}

