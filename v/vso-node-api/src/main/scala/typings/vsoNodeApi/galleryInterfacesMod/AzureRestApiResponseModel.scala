package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AzureRestApiResponseModel extends AzureRestApiRequestModel {
  
  /**
    * Gets or sets the Asset operation status
    */
  var operationStatus: RestApiResponseStatusModel = js.native
}
object AzureRestApiResponseModel {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class AzureRestApiResponseModelMutableBuilder[Self <: AzureRestApiResponseModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationStatus(value: RestApiResponseStatusModel): Self = StObject.set(x, "operationStatus", value.asInstanceOf[js.Any])
  }
}
