package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPurchaseData extends StObject {
  
  var apiResult: String
}
object UserPurchaseData {
  
  inline def apply(apiResult: String): UserPurchaseData = {
    val __obj = js.Dynamic.literal(apiResult = apiResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPurchaseData]
  }
  
  extension [Self <: UserPurchaseData](x: Self) {
    
    inline def setApiResult(value: String): Self = StObject.set(x, "apiResult", value.asInstanceOf[js.Any])
  }
}
