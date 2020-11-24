package typings.wxJsSdkDt.wx

import typings.wxJsSdkDt.anon.CardList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseCardConfig extends WxBaseRequestConfig {
  
  /**
    * 卡券Id
    */
  var cardId: js.UndefOr[String] = js.native
  
  /**
    * 卡券签名
    */
  var cardSign: String = js.native
  
  /**
    * 卡券类型
    */
  var cardType: js.UndefOr[String] = js.native
  
  /**
    * 卡券签名随机串
    */
  var nonceStr: String = js.native
  
  /**
    * 门店Id
    */
  var shopId: js.UndefOr[String] = js.native
  
  /**
    * 签名方式，默认'SHA1'
    */
  var signType: String = js.native
  
  /**
    * var cardList= res.cardList; 用户选中的卡券列表信息
    */
  @JSName("success")
  var success_ChooseCardConfig: js.UndefOr[js.Function1[/* res */ CardList, Unit]] = js.native
  
  /**
    * 卡券签名时间戳
    */
  var timestamp: Double = js.native
}
object ChooseCardConfig {
  
  @scala.inline
  def apply(cardSign: String, nonceStr: String, signType: String, timestamp: Double): ChooseCardConfig = {
    val __obj = js.Dynamic.literal(cardSign = cardSign.asInstanceOf[js.Any], nonceStr = nonceStr.asInstanceOf[js.Any], signType = signType.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseCardConfig]
  }
  
  @scala.inline
  implicit class ChooseCardConfigOps[Self <: ChooseCardConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCardSign(value: String): Self = this.set("cardSign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceStr(value: String): Self = this.set("nonceStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignType(value: String): Self = this.set("signType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardId(value: String): Self = this.set("cardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardId: Self = this.set("cardId", js.undefined)
    
    @scala.inline
    def setCardType(value: String): Self = this.set("cardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardType: Self = this.set("cardType", js.undefined)
    
    @scala.inline
    def setShopId(value: String): Self = this.set("shopId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShopId: Self = this.set("shopId", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ CardList => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
