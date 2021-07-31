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
  
  @scala.inline
  def apply(): AddCardRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddCardRes]
  }
  
  @scala.inline
  implicit class AddCardResMutableBuilder[Self <: AddCardRes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardList(value: js.Array[CardData]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardListUndefined: Self = StObject.set(x, "cardList", js.undefined)
    
    @scala.inline
    def setCardListVarargs(value: CardData*): Self = StObject.set(x, "cardList", js.Array(value :_*))
  }
}
