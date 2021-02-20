package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenCardData extends StObject {
  
  /**
    * 需要打开的卡券 Id
    */
  var cardId: js.UndefOr[String] = js.native
  
  /**
    * 由 addCard 的返回对象中的加密 code 通过解密后得到
    */
  var code: js.UndefOr[String] = js.native
}
object OpenCardData {
  
  @scala.inline
  def apply(): OpenCardData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenCardData]
  }
  
  @scala.inline
  implicit class OpenCardDataMutableBuilder[Self <: OpenCardData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardIdUndefined: Self = StObject.set(x, "cardId", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
