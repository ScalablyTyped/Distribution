package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestApiResponseStatusModel extends StObject {
  
  /**
    * Gets or sets the operation details
    */
  var operationDetails: js.Any = js.native
  
  /**
    * Gets or sets the operation id
    */
  var operationId: String = js.native
  
  /**
    * Gets or sets the completed status percentage
    */
  var percentageCompleted: Double = js.native
  
  /**
    * Gets or sets the status
    */
  var status: RestApiResponseStatus = js.native
  
  /**
    * Gets or sets the status message
    */
  var statusMessage: String = js.native
}
object RestApiResponseStatusModel {
  
  @scala.inline
  def apply(
    operationDetails: js.Any,
    operationId: String,
    percentageCompleted: Double,
    status: RestApiResponseStatus,
    statusMessage: String
  ): RestApiResponseStatusModel = {
    val __obj = js.Dynamic.literal(operationDetails = operationDetails.asInstanceOf[js.Any], operationId = operationId.asInstanceOf[js.Any], percentageCompleted = percentageCompleted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestApiResponseStatusModel]
  }
  
  @scala.inline
  implicit class RestApiResponseStatusModelMutableBuilder[Self <: RestApiResponseStatusModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationDetails(value: js.Any): Self = StObject.set(x, "operationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentageCompleted(value: Double): Self = StObject.set(x, "percentageCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: RestApiResponseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
  }
}
