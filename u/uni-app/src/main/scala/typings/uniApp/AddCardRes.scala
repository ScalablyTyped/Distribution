package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCardRes extends StObject {
  
  /**
    * 卡券 id
    */
  var cardList: js.UndefOr[js.Array[CardData]] = js.undefined
}
object AddCardRes {
  
  inline def apply(): AddCardRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddCardRes]
  }
  
  extension [Self <: AddCardRes](x: Self) {
    
    inline def setCardList(value: js.Array[CardData]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    inline def setCardListUndefined: Self = StObject.set(x, "cardList", js.undefined)
    
    inline def setCardListVarargs(value: CardData*): Self = StObject.set(x, "cardList", js.Array(value*))
  }
}
