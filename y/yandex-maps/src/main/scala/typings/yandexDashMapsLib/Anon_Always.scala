package typings
package yandexDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Always extends js.Object {
  var autoFitToViewport: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsLibStrings.none | yandexDashMapsLib.yandexDashMapsLibStrings.ifNull | yandexDashMapsLib.yandexDashMapsLibStrings.always
  ] = js.undefined
  var controls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var direction: js.UndefOr[js.Array[scala.Double] | java.lang.String] = js.undefined
  var hotkeysEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var scrollZoomBehavior: js.UndefOr[scala.Boolean] = js.undefined
  var span: js.UndefOr[js.Array[scala.Double] | java.lang.String] = js.undefined
  var suppressMapOpenBlock: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Always {
  @scala.inline
  def apply(
    autoFitToViewport: yandexDashMapsLib.yandexDashMapsLibStrings.none | yandexDashMapsLib.yandexDashMapsLibStrings.ifNull | yandexDashMapsLib.yandexDashMapsLibStrings.always = null,
    controls: js.Array[java.lang.String] = null,
    direction: js.Array[scala.Double] | java.lang.String = null,
    hotkeysEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    scrollZoomBehavior: js.UndefOr[scala.Boolean] = js.undefined,
    span: js.Array[scala.Double] | java.lang.String = null,
    suppressMapOpenBlock: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Always = {
    val __obj = js.Dynamic.literal()
    if (autoFitToViewport != null) __obj.updateDynamic("autoFitToViewport")(autoFitToViewport.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(hotkeysEnabled)) __obj.updateDynamic("hotkeysEnabled")(hotkeysEnabled)
    if (!js.isUndefined(scrollZoomBehavior)) __obj.updateDynamic("scrollZoomBehavior")(scrollZoomBehavior)
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressMapOpenBlock)) __obj.updateDynamic("suppressMapOpenBlock")(suppressMapOpenBlock)
    __obj.asInstanceOf[Anon_Always]
  }
}

