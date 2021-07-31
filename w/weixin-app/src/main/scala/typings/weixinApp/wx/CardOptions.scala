package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  var cardList: js.Array[Card]
  
  @JSName("complete")
  var complete_CardOptions: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  @JSName("fail")
  var fail_CardOptions: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  @JSName("success")
  var success_CardOptions: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object CardOptions {
  
  @scala.inline
  def apply(cardList: js.Array[Card]): CardOptions = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardOptions]
  }
  
  @scala.inline
  implicit class CardOptionsMutableBuilder[Self <: CardOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardList(value: js.Array[Card]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardListVarargs(value: Card*): Self = StObject.set(x, "cardList", js.Array(value :_*))
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
