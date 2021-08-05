package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceEndpointRequest extends StObject {
  
  var dataSourceDetails: DataSourceDetails
  
  var resultTransformationDetails: ResultTransformationDetails
  
  var serviceEndpointDetails: ServiceEndpointDetails
}
object ServiceEndpointRequest {
  
  inline def apply(
    dataSourceDetails: DataSourceDetails,
    resultTransformationDetails: ResultTransformationDetails,
    serviceEndpointDetails: ServiceEndpointDetails
  ): ServiceEndpointRequest = {
    val __obj = js.Dynamic.literal(dataSourceDetails = dataSourceDetails.asInstanceOf[js.Any], resultTransformationDetails = resultTransformationDetails.asInstanceOf[js.Any], serviceEndpointDetails = serviceEndpointDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEndpointRequest]
  }
  
  extension [Self <: ServiceEndpointRequest](x: Self) {
    
    inline def setDataSourceDetails(value: DataSourceDetails): Self = StObject.set(x, "dataSourceDetails", value.asInstanceOf[js.Any])
    
    inline def setResultTransformationDetails(value: ResultTransformationDetails): Self = StObject.set(x, "resultTransformationDetails", value.asInstanceOf[js.Any])
    
    inline def setServiceEndpointDetails(value: ServiceEndpointDetails): Self = StObject.set(x, "serviceEndpointDetails", value.asInstanceOf[js.Any])
  }
}
