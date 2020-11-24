package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardData extends js.Object {
  
  /**
    * 用户领取到卡券的扩展参数，与调用时传入的参数相同
    */
  var cardExt: js.UndefOr[String] = js.native
  
  /**
    * 用户领取到卡券的id
    */
  var cardId: js.UndefOr[String] = js.native
  
  /**
    * 加密 code，为用户领取到卡券的code加密后的字符串
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * 是否成功
    */
  var isSuccess: js.UndefOr[Boolean] = js.native
}
object CardData {
  
  @scala.inline
  def apply(): CardData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardData]
  }
  
  @scala.inline
  implicit class CardDataOps[Self <: CardData] (val x: Self) extends AnyVal {
    
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
    def setCardExt(value: String): Self = this.set("cardExt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardExt: Self = this.set("cardExt", js.undefined)
    
    @scala.inline
    def setCardId(value: String): Self = this.set("cardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardId: Self = this.set("cardId", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setIsSuccess(value: Boolean): Self = this.set("isSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSuccess: Self = this.set("isSuccess", js.undefined)
  }
}
