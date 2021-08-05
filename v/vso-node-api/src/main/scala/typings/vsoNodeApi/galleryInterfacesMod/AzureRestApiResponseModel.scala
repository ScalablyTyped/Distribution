package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzureRestApiResponseModel
  extends StObject
     with AzureRestApiRequestModel {
  
  /**
    * Gets or sets the Asset operation status
    */
  var operationStatus: RestApiResponseStatusModel
}
object AzureRestApiResponseModel {
  
  inline def apply(
    assetDetails: AssetDetails,
    assetId: String,
    assetVersion: Double,
    customerSupportEmail: String,
    integrationContactEmail: String,
    operation: String,
    operationStatus: RestApiResponseStatusModel,
    planId: String,
    publisherId: String,
    `type`: String
  ): AzureRestApiResponseModel = {
    val __obj = js.Dynamic.literal(assetDetails = assetDetails.asInstanceOf[js.Any], assetId = assetId.asInstanceOf[js.Any], assetVersion = assetVersion.asInstanceOf[js.Any], customerSupportEmail = customerSupportEmail.asInstanceOf[js.Any], integrationContactEmail = integrationContactEmail.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], operationStatus = operationStatus.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], publisherId = publisherId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureRestApiResponseModel]
  }
  
  extension [Self <: AzureRestApiResponseModel](x: Self) {
    
    inline def setOperationStatus(value: RestApiResponseStatusModel): Self = StObject.set(x, "operationStatus", value.asInstanceOf[js.Any])
  }
}
