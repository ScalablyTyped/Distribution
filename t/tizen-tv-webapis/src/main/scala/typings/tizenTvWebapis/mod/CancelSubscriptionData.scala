package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelSubscriptionData extends StObject {
  
  var apiResult: String
}
object CancelSubscriptionData {
  
  inline def apply(apiResult: String): CancelSubscriptionData = {
    val __obj = js.Dynamic.literal(apiResult = apiResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSubscriptionData]
  }
  
  extension [Self <: CancelSubscriptionData](x: Self) {
    
    inline def setApiResult(value: String): Self = StObject.set(x, "apiResult", value.asInstanceOf[js.Any])
  }
}
