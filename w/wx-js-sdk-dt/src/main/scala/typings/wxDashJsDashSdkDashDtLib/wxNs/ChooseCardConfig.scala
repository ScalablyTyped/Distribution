package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseCardConfig extends WxBaseRequestConfig {
  /**
    * 卡券Id
    */
  var cardId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 卡券签名
    */
  var cardSign: java.lang.String
  /**
    * 卡券类型
    */
  var cardType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 卡券签名随机串
    */
  var nonceStr: java.lang.String
  /**
    * 门店Id
    */
  var shopId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 签名方式，默认'SHA1'
    */
  var signType: java.lang.String
  /**
    * var cardList= res.cardList; 用户选中的卡券列表信息
    */
  @JSName("success")
  var success_ChooseCardConfig: js.UndefOr[js.Function1[/* res */ wxDashJsDashSdkDashDtLib.Anon_CardList, scala.Unit]] = js.undefined
  /**
    * 卡券签名时间戳
    */
  var timestamp: scala.Double
}

object ChooseCardConfig {
  @scala.inline
  def apply(
    cardSign: java.lang.String,
    nonceStr: java.lang.String,
    signType: java.lang.String,
    timestamp: scala.Double,
    cancel: js.Function0[scala.Unit] = null,
    cardId: java.lang.String = null,
    cardType: java.lang.String = null,
    complete: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null,
    fail: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit] = null,
    shopId: java.lang.String = null,
    success: js.Function1[/* res */ wxDashJsDashSdkDashDtLib.Anon_CardList, scala.Unit] = null
  ): ChooseCardConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cardSign")(cardSign)
    __obj.updateDynamic("nonceStr")(nonceStr)
    __obj.updateDynamic("signType")(signType)
    __obj.updateDynamic("timestamp")(timestamp)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (cardId != null) __obj.updateDynamic("cardId")(cardId)
    if (cardType != null) __obj.updateDynamic("cardType")(cardType)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (shopId != null) __obj.updateDynamic("shopId")(shopId)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[ChooseCardConfig]
  }
}

