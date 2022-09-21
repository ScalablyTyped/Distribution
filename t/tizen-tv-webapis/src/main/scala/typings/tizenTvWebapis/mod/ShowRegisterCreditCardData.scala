package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowRegisterCreditCardData extends StObject {
  
  var openDeepLinkDetail: String
  
  var openDeepLinkResult: String
}
object ShowRegisterCreditCardData {
  
  inline def apply(openDeepLinkDetail: String, openDeepLinkResult: String): ShowRegisterCreditCardData = {
    val __obj = js.Dynamic.literal(openDeepLinkDetail = openDeepLinkDetail.asInstanceOf[js.Any], openDeepLinkResult = openDeepLinkResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowRegisterCreditCardData]
  }
  
  extension [Self <: ShowRegisterCreditCardData](x: Self) {
    
    inline def setOpenDeepLinkDetail(value: String): Self = StObject.set(x, "openDeepLinkDetail", value.asInstanceOf[js.Any])
    
    inline def setOpenDeepLinkResult(value: String): Self = StObject.set(x, "openDeepLinkResult", value.asInstanceOf[js.Any])
  }
}
