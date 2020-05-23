package typings.yandexMaps.anon

import typings.yandexMaps.yandexMapsStrings.always
import typings.yandexMaps.yandexMapsStrings.ifNull
import typings.yandexMaps.yandexMapsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoFitToViewport extends js.Object {
  var autoFitToViewport: js.UndefOr[none | ifNull | always] = js.undefined
  var controls: js.UndefOr[js.Array[String]] = js.undefined
  var direction: js.UndefOr[js.Array[Double] | String] = js.undefined
  var hotkeysEnabled: js.UndefOr[Boolean] = js.undefined
  var scrollZoomBehavior: js.UndefOr[Boolean] = js.undefined
  var span: js.UndefOr[js.Array[Double] | String] = js.undefined
  var suppressMapOpenBlock: js.UndefOr[Boolean] = js.undefined
}

object AutoFitToViewport {
  @scala.inline
  def apply(
    autoFitToViewport: none | ifNull | always = null,
    controls: js.Array[String] = null,
    direction: js.Array[Double] | String = null,
    hotkeysEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollZoomBehavior: js.UndefOr[Boolean] = js.undefined,
    span: js.Array[Double] | String = null,
    suppressMapOpenBlock: js.UndefOr[Boolean] = js.undefined
  ): AutoFitToViewport = {
    val __obj = js.Dynamic.literal()
    if (autoFitToViewport != null) __obj.updateDynamic("autoFitToViewport")(autoFitToViewport.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(hotkeysEnabled)) __obj.updateDynamic("hotkeysEnabled")(hotkeysEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollZoomBehavior)) __obj.updateDynamic("scrollZoomBehavior")(scrollZoomBehavior.get.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressMapOpenBlock)) __obj.updateDynamic("suppressMapOpenBlock")(suppressMapOpenBlock.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFitToViewport]
  }
}

