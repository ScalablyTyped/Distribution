package typings.wxJsSdkDt.wx

import typings.wxJsSdkDt.AnonCardList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseCardConfig extends WxBaseRequestConfig {
  /**
    * 卡券Id
    */
  var cardId: js.UndefOr[String] = js.undefined
  /**
    * 卡券签名
    */
  var cardSign: String
  /**
    * 卡券类型
    */
  var cardType: js.UndefOr[String] = js.undefined
  /**
    * 卡券签名随机串
    */
  var nonceStr: String
  /**
    * 门店Id
    */
  var shopId: js.UndefOr[String] = js.undefined
  /**
    * 签名方式，默认'SHA1'
    */
  var signType: String
  /**
    * var cardList= res.cardList; 用户选中的卡券列表信息
    */
  @JSName("success")
  var success_ChooseCardConfig: js.UndefOr[js.Function1[/* res */ AnonCardList, Unit]] = js.undefined
  /**
    * 卡券签名时间戳
    */
  var timestamp: Double
}

object ChooseCardConfig {
  @scala.inline
  def apply(
    cardSign: String,
    nonceStr: String,
    signType: String,
    timestamp: Double,
    cancel: () => Unit = null,
    cardId: String = null,
    cardType: String = null,
    complete: /* res */ js.UndefOr[js.Any] => Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => Unit = null,
    shopId: String = null,
    success: /* res */ AnonCardList => Unit = null
  ): ChooseCardConfig = {
    val __obj = js.Dynamic.literal(cardSign = cardSign.asInstanceOf[js.Any], nonceStr = nonceStr.asInstanceOf[js.Any], signType = signType.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (cardId != null) __obj.updateDynamic("cardId")(cardId.asInstanceOf[js.Any])
    if (cardType != null) __obj.updateDynamic("cardType")(cardType.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (shopId != null) __obj.updateDynamic("shopId")(shopId.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseCardConfig]
  }
}

