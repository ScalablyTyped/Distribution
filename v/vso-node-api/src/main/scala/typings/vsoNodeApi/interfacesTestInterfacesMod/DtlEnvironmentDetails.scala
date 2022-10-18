package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DtlEnvironmentDetails extends StObject {
  
  var csmContent: String
  
  var csmParameters: String
  
  var subscriptionName: String
}
object DtlEnvironmentDetails {
  
  inline def apply(csmContent: String, csmParameters: String, subscriptionName: String): DtlEnvironmentDetails = {
    val __obj = js.Dynamic.literal(csmContent = csmContent.asInstanceOf[js.Any], csmParameters = csmParameters.asInstanceOf[js.Any], subscriptionName = subscriptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DtlEnvironmentDetails]
  }
  
  extension [Self <: DtlEnvironmentDetails](x: Self) {
    
    inline def setCsmContent(value: String): Self = StObject.set(x, "csmContent", value.asInstanceOf[js.Any])
    
    inline def setCsmParameters(value: String): Self = StObject.set(x, "csmParameters", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionName(value: String): Self = StObject.set(x, "subscriptionName", value.asInstanceOf[js.Any])
  }
}
