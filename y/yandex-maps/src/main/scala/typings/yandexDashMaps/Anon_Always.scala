package typings.yandexDashMaps

import typings.yandexDashMaps.yandexDashMapsStrings.always
import typings.yandexDashMaps.yandexDashMapsStrings.ifNull
import typings.yandexDashMaps.yandexDashMapsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Always extends js.Object {
  var autoFitToViewport: js.UndefOr[none | ifNull | always] = js.undefined
  var controls: js.UndefOr[js.Array[String]] = js.undefined
  var direction: js.UndefOr[js.Array[Double] | String] = js.undefined
  var hotkeysEnabled: js.UndefOr[Boolean] = js.undefined
  var scrollZoomBehavior: js.UndefOr[Boolean] = js.undefined
  var span: js.UndefOr[js.Array[Double] | String] = js.undefined
  var suppressMapOpenBlock: js.UndefOr[Boolean] = js.undefined
}

object Anon_Always {
  @scala.inline
  def apply(
    autoFitToViewport: none | ifNull | always = null,
    controls: js.Array[String] = null,
    direction: js.Array[Double] | String = null,
    hotkeysEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollZoomBehavior: js.UndefOr[Boolean] = js.undefined,
    span: js.Array[Double] | String = null,
    suppressMapOpenBlock: js.UndefOr[Boolean] = js.undefined
  ): Anon_Always = {
    val __obj = js.Dynamic.literal()
    if (autoFitToViewport != null) __obj.updateDynamic("autoFitToViewport")(autoFitToViewport.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(hotkeysEnabled)) __obj.updateDynamic("hotkeysEnabled")(hotkeysEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollZoomBehavior)) __obj.updateDynamic("scrollZoomBehavior")(scrollZoomBehavior.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressMapOpenBlock)) __obj.updateDynamic("suppressMapOpenBlock")(suppressMapOpenBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Always]
  }
}

