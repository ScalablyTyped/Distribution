package typings.yandexMetrikaTag.ym

import typings.yandexMetrikaTag.yandexMetrikaTagStrings.noindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitParameters extends js.Object {
  var accurateTrackBounce: js.UndefOr[Boolean | Double] = js.undefined
  var childIframe: js.UndefOr[Boolean] = js.undefined
  var clickmap: js.UndefOr[Boolean] = js.undefined
  var defer: js.UndefOr[Boolean] = js.undefined
  var ecommerce: js.UndefOr[Boolean | String | js.Array[_]] = js.undefined
  var params: js.UndefOr[VisitParameters | js.Array[VisitParameters]] = js.undefined
  var trackHash: js.UndefOr[Boolean] = js.undefined
  var trackLinks: js.UndefOr[Boolean] = js.undefined
  var triggerEvent: js.UndefOr[Boolean] = js.undefined
  var trustedDomains: js.UndefOr[js.Array[String]] = js.undefined
  var `type`: js.UndefOr[Double] = js.undefined
  var userParams: js.UndefOr[UserParameters] = js.undefined
  var ut: js.UndefOr[noindex] = js.undefined
  var webvisor: js.UndefOr[Boolean] = js.undefined
}

object InitParameters {
  @scala.inline
  def apply(
    accurateTrackBounce: Boolean | Double = null,
    childIframe: js.UndefOr[Boolean] = js.undefined,
    clickmap: js.UndefOr[Boolean] = js.undefined,
    defer: js.UndefOr[Boolean] = js.undefined,
    ecommerce: Boolean | String | js.Array[_] = null,
    params: VisitParameters | js.Array[VisitParameters] = null,
    trackHash: js.UndefOr[Boolean] = js.undefined,
    trackLinks: js.UndefOr[Boolean] = js.undefined,
    triggerEvent: js.UndefOr[Boolean] = js.undefined,
    trustedDomains: js.Array[String] = null,
    `type`: js.UndefOr[Double] = js.undefined,
    userParams: UserParameters = null,
    ut: noindex = null,
    webvisor: js.UndefOr[Boolean] = js.undefined
  ): InitParameters = {
    val __obj = js.Dynamic.literal()
    if (accurateTrackBounce != null) __obj.updateDynamic("accurateTrackBounce")(accurateTrackBounce.asInstanceOf[js.Any])
    if (!js.isUndefined(childIframe)) __obj.updateDynamic("childIframe")(childIframe.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clickmap)) __obj.updateDynamic("clickmap")(clickmap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.get.asInstanceOf[js.Any])
    if (ecommerce != null) __obj.updateDynamic("ecommerce")(ecommerce.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(trackHash)) __obj.updateDynamic("trackHash")(trackHash.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trackLinks)) __obj.updateDynamic("trackLinks")(trackLinks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(triggerEvent)) __obj.updateDynamic("triggerEvent")(triggerEvent.get.asInstanceOf[js.Any])
    if (trustedDomains != null) __obj.updateDynamic("trustedDomains")(trustedDomains.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.get.asInstanceOf[js.Any])
    if (userParams != null) __obj.updateDynamic("userParams")(userParams.asInstanceOf[js.Any])
    if (ut != null) __obj.updateDynamic("ut")(ut.asInstanceOf[js.Any])
    if (!js.isUndefined(webvisor)) __obj.updateDynamic("webvisor")(webvisor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitParameters]
  }
}

