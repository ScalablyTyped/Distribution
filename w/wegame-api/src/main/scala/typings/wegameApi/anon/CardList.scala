package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardList extends StObject {
  
  /**
    * 卡券添加结果列表
    */
  var cardList: js.Array[IsSuccess]
}
object CardList {
  
  inline def apply(cardList: js.Array[IsSuccess]): CardList = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardList]
  }
  
  extension [Self <: CardList](x: Self) {
    
    inline def setCardList(value: js.Array[IsSuccess]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    inline def setCardListVarargs(value: IsSuccess*): Self = StObject.set(x, "cardList", js.Array(value :_*))
  }
}
