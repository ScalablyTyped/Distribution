package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowPurchaseHistoryData extends StObject {
  
  var openDeepLinkDetail: String
  
  var openDeepLinkResult: String
}
object ShowPurchaseHistoryData {
  
  inline def apply(openDeepLinkDetail: String, openDeepLinkResult: String): ShowPurchaseHistoryData = {
    val __obj = js.Dynamic.literal(openDeepLinkDetail = openDeepLinkDetail.asInstanceOf[js.Any], openDeepLinkResult = openDeepLinkResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowPurchaseHistoryData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShowPurchaseHistoryData] (val x: Self) extends AnyVal {
    
    inline def setOpenDeepLinkDetail(value: String): Self = StObject.set(x, "openDeepLinkDetail", value.asInstanceOf[js.Any])
    
    inline def setOpenDeepLinkResult(value: String): Self = StObject.set(x, "openDeepLinkResult", value.asInstanceOf[js.Any])
  }
}
