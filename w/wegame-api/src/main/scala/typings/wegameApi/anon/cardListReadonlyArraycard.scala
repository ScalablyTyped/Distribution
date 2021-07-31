package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  cardList :std.ReadonlyArray<{  cardId :string,   code :string}>} & wegame-api.wx.types.CallbacksWithType<unknown> */
trait cardListReadonlyArraycard extends StObject {
  
  /**
    * 需要打开的卡券列表
    */
  var cardList: js.Array[CardId]
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
}
object cardListReadonlyArraycard {
  
  @scala.inline
  def apply(cardList: js.Array[CardId]): cardListReadonlyArraycard = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[cardListReadonlyArraycard]
  }
  
  @scala.inline
  implicit class cardListReadonlyArraycardMutableBuilder[Self <: cardListReadonlyArraycard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardList(value: js.Array[CardId]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardListVarargs(value: CardId*): Self = StObject.set(x, "cardList", js.Array(value :_*))
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ js.Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
