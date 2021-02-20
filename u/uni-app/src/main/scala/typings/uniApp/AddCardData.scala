package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddCardData extends StObject {
  
  /**
    * 卡券的扩展参数
    */
  var cardExt: js.UndefOr[String] = js.native
  
  /**
    * 卡券 id
    */
  var cardId: js.UndefOr[String] = js.native
}
object AddCardData {
  
  @scala.inline
  def apply(): AddCardData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddCardData]
  }
  
  @scala.inline
  implicit class AddCardDataMutableBuilder[Self <: AddCardData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardExt(value: String): Self = StObject.set(x, "cardExt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardExtUndefined: Self = StObject.set(x, "cardExt", js.undefined)
    
    @scala.inline
    def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardIdUndefined: Self = StObject.set(x, "cardId", js.undefined)
  }
}
