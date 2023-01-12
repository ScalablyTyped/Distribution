package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceCountryAvailabilityData extends StObject {
  
  var apiResult: String
}
object ServiceCountryAvailabilityData {
  
  inline def apply(apiResult: String): ServiceCountryAvailabilityData = {
    val __obj = js.Dynamic.literal(apiResult = apiResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceCountryAvailabilityData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceCountryAvailabilityData] (val x: Self) extends AnyVal {
    
    inline def setApiResult(value: String): Self = StObject.set(x, "apiResult", value.asInstanceOf[js.Any])
  }
}
