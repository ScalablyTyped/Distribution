package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestApiResponseStatusModel extends StObject {
  
  /**
    * Gets or sets the operation details
    */
  var operationDetails: Any
  
  /**
    * Gets or sets the operation id
    */
  var operationId: String
  
  /**
    * Gets or sets the completed status percentage
    */
  var percentageCompleted: Double
  
  /**
    * Gets or sets the status
    */
  var status: RestApiResponseStatus
  
  /**
    * Gets or sets the status message
    */
  var statusMessage: String
}
object RestApiResponseStatusModel {
  
  inline def apply(
    operationDetails: Any,
    operationId: String,
    percentageCompleted: Double,
    status: RestApiResponseStatus,
    statusMessage: String
  ): RestApiResponseStatusModel = {
    val __obj = js.Dynamic.literal(operationDetails = operationDetails.asInstanceOf[js.Any], operationId = operationId.asInstanceOf[js.Any], percentageCompleted = percentageCompleted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestApiResponseStatusModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestApiResponseStatusModel] (val x: Self) extends AnyVal {
    
    inline def setOperationDetails(value: Any): Self = StObject.set(x, "operationDetails", value.asInstanceOf[js.Any])
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setPercentageCompleted(value: Double): Self = StObject.set(x, "percentageCompleted", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: RestApiResponseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
  }
}
