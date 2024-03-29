package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCardData extends StObject {
  
  /**
    * 卡券的扩展参数
    */
  var cardExt: js.UndefOr[String] = js.undefined
  
  /**
    * 卡券 id
    */
  var cardId: js.UndefOr[String] = js.undefined
}
object AddCardData {
  
  inline def apply(): AddCardData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddCardData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddCardData] (val x: Self) extends AnyVal {
    
    inline def setCardExt(value: String): Self = StObject.set(x, "cardExt", value.asInstanceOf[js.Any])
    
    inline def setCardExtUndefined: Self = StObject.set(x, "cardExt", js.undefined)
    
    inline def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
    
    inline def setCardIdUndefined: Self = StObject.set(x, "cardId", js.undefined)
  }
}
