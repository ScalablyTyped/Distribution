package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardList extends StObject {
  
  /**
    * 卡券添加结果列表
    */
  var cardList: js.Array[IsSuccess] = js.native
}
object CardList {
  
  @scala.inline
  def apply(cardList: js.Array[IsSuccess]): CardList = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardList]
  }
  
  @scala.inline
  implicit class CardListMutableBuilder[Self <: CardList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardList(value: js.Array[IsSuccess]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardListVarargs(value: IsSuccess*): Self = StObject.set(x, "cardList", js.Array(value :_*))
  }
}
