package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardList extends js.Object {
  
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
  implicit class CardListOps[Self <: CardList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCardListVarargs(value: IsSuccess*): Self = this.set("cardList", js.Array(value :_*))
    
    @scala.inline
    def setCardList(value: js.Array[IsSuccess]): Self = this.set("cardList", value.asInstanceOf[js.Any])
  }
}
