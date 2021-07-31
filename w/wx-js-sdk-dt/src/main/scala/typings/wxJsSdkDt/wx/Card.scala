package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 卡券对象
  */
trait Card extends StObject {
  
  var cardExt: String
  
  var cardId: String
}
object Card {
  
  @scala.inline
  def apply(cardExt: String, cardId: String): Card = {
    val __obj = js.Dynamic.literal(cardExt = cardExt.asInstanceOf[js.Any], cardId = cardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Card]
  }
  
  @scala.inline
  implicit class CardMutableBuilder[Self <: Card] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardExt(value: String): Self = StObject.set(x, "cardExt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
  }
}
