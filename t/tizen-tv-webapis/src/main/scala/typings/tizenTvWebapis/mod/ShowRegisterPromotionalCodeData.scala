package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowRegisterPromotionalCodeData extends StObject {
  
  var openDeepLinkDetail: String
  
  var openDeepLinkResult: String
}
object ShowRegisterPromotionalCodeData {
  
  inline def apply(openDeepLinkDetail: String, openDeepLinkResult: String): ShowRegisterPromotionalCodeData = {
    val __obj = js.Dynamic.literal(openDeepLinkDetail = openDeepLinkDetail.asInstanceOf[js.Any], openDeepLinkResult = openDeepLinkResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowRegisterPromotionalCodeData]
  }
  
  extension [Self <: ShowRegisterPromotionalCodeData](x: Self) {
    
    inline def setOpenDeepLinkDetail(value: String): Self = StObject.set(x, "openDeepLinkDetail", value.asInstanceOf[js.Any])
    
    inline def setOpenDeepLinkResult(value: String): Self = StObject.set(x, "openDeepLinkResult", value.asInstanceOf[js.Any])
  }
}
