package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  cardList :std.ReadonlyArray<{  cardId :string,   cardExt :string}>} & wegame-api.wx.types.CallbacksWithType<{  cardList :std.ReadonlyArray<{  code :string,   cardId :string,   cardExt :string,   isSuccess :boolean}>}> */
trait cardListReadonlyArraycardCardList extends StObject {
  
  /**
    * 需要添加的卡券列表
    */
  var cardList: js.Array[CardExt]
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* res */ CardList, Unit]] = js.undefined
}
object cardListReadonlyArraycardCardList {
  
  inline def apply(cardList: js.Array[CardExt]): cardListReadonlyArraycardCardList = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[cardListReadonlyArraycardCardList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: cardListReadonlyArraycardCardList] (val x: Self) extends AnyVal {
    
    inline def setCardList(value: js.Array[CardExt]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    inline def setCardListVarargs(value: CardExt*): Self = StObject.set(x, "cardList", js.Array(value*))
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ CardList => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
