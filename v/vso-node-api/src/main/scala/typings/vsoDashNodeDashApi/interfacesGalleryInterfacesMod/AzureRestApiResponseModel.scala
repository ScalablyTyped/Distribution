package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureRestApiResponseModel extends AzureRestApiRequestModel {
  /**
    * Gets or sets the Asset operation status
    */
  var operationStatus: RestApiResponseStatusModel
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
    val __obj = js.Dynamic.literal(assetDetails = assetDetails, assetId = assetId, assetVersion = assetVersion, customerSupportEmail = customerSupportEmail, integrationContactEmail = integrationContactEmail, operation = operation, operationStatus = operationStatus, planId = planId, publisherId = publisherId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AzureRestApiResponseModel]
  }
}

