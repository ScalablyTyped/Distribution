package typings.wxJsSdkDt.wx

import typings.wxJsSdkDt.anon.CardList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCardConfig extends StObject {
  
  var cardList: js.Array[Card]
  
  var success: js.UndefOr[js.Function1[/* res */ CardList, Unit]] = js.undefined
}
object AddCardConfig {
  
  inline def apply(cardList: js.Array[Card]): AddCardConfig = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCardConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddCardConfig] (val x: Self) extends AnyVal {
    
    inline def setCardList(value: js.Array[Card]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    inline def setCardListVarargs(value: Card*): Self = StObject.set(x, "cardList", js.Array(value*))
    
    inline def setSuccess(value: /* res */ CardList => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
