package typings.weixinApp.wx

import typings.weixinApp.anon.CardId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenCardOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  var cardList: js.Array[CardId]
}
object OpenCardOptions {
  
  inline def apply(cardList: js.Array[CardId]): OpenCardOptions = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCardOptions]
  }
  
  extension [Self <: OpenCardOptions](x: Self) {
    
    inline def setCardList(value: js.Array[CardId]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    inline def setCardListVarargs(value: CardId*): Self = StObject.set(x, "cardList", js.Array(value :_*))
  }
}
