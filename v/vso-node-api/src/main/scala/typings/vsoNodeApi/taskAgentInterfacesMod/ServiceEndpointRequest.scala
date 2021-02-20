package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceEndpointRequest extends StObject {
  
  var dataSourceDetails: DataSourceDetails = js.native
  
  var resultTransformationDetails: ResultTransformationDetails = js.native
  
  var serviceEndpointDetails: ServiceEndpointDetails = js.native
}
object ServiceEndpointRequest {
  
  @scala.inline
  def apply(
    dataSourceDetails: DataSourceDetails,
    resultTransformationDetails: ResultTransformationDetails,
    serviceEndpointDetails: ServiceEndpointDetails
  ): ServiceEndpointRequest = {
    val __obj = js.Dynamic.literal(dataSourceDetails = dataSourceDetails.asInstanceOf[js.Any], resultTransformationDetails = resultTransformationDetails.asInstanceOf[js.Any], serviceEndpointDetails = serviceEndpointDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEndpointRequest]
  }
  
  @scala.inline
  implicit class ServiceEndpointRequestMutableBuilder[Self <: ServiceEndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceDetails(value: DataSourceDetails): Self = StObject.set(x, "dataSourceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultTransformationDetails(value: ResultTransformationDetails): Self = StObject.set(x, "resultTransformationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceEndpointDetails(value: ServiceEndpointDetails): Self = StObject.set(x, "serviceEndpointDetails", value.asInstanceOf[js.Any])
  }
}
