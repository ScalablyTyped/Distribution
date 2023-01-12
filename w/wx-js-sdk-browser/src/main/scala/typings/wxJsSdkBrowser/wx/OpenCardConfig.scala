package typings.wxJsSdkBrowser.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 需要打开的卡券列表
  */
trait OpenCardConfig
  extends StObject
     with WxBaseRequestConfig {
  
  var cardList: js.Array[OpenCardObj]
}
object OpenCardConfig {
  
  inline def apply(cardList: js.Array[OpenCardObj]): OpenCardConfig = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCardConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenCardConfig] (val x: Self) extends AnyVal {
    
    inline def setCardList(value: js.Array[OpenCardObj]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    inline def setCardListVarargs(value: OpenCardObj*): Self = StObject.set(x, "cardList", js.Array(value*))
  }
}
