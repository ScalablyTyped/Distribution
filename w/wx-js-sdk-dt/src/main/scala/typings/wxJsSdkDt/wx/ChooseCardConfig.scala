package typings.wxJsSdkDt.wx

import typings.wxJsSdkDt.anon.CardList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseCardConfig
  extends StObject
     with WxBaseRequestConfig {
  
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
  var success_ChooseCardConfig: js.UndefOr[js.Function1[/* res */ CardList, Unit]] = js.undefined
  
  /**
    * 卡券签名时间戳
    */
  var timestamp: Double
}
object ChooseCardConfig {
  
  inline def apply(cardSign: String, nonceStr: String, signType: String, timestamp: Double): ChooseCardConfig = {
    val __obj = js.Dynamic.literal(cardSign = cardSign.asInstanceOf[js.Any], nonceStr = nonceStr.asInstanceOf[js.Any], signType = signType.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseCardConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChooseCardConfig] (val x: Self) extends AnyVal {
    
    inline def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
    
    inline def setCardIdUndefined: Self = StObject.set(x, "cardId", js.undefined)
    
    inline def setCardSign(value: String): Self = StObject.set(x, "cardSign", value.asInstanceOf[js.Any])
    
    inline def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
    
    inline def setCardTypeUndefined: Self = StObject.set(x, "cardType", js.undefined)
    
    inline def setNonceStr(value: String): Self = StObject.set(x, "nonceStr", value.asInstanceOf[js.Any])
    
    inline def setShopId(value: String): Self = StObject.set(x, "shopId", value.asInstanceOf[js.Any])
    
    inline def setShopIdUndefined: Self = StObject.set(x, "shopId", js.undefined)
    
    inline def setSignType(value: String): Self = StObject.set(x, "signType", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ CardList => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
