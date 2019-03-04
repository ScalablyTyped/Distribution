package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

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
    assetId: java.lang.String,
    assetVersion: scala.Double,
    customerSupportEmail: java.lang.String,
    integrationContactEmail: java.lang.String,
    operation: java.lang.String,
    operationStatus: RestApiResponseStatusModel,
    planId: java.lang.String,
    publisherId: java.lang.String,
    `type`: java.lang.String
  ): AzureRestApiResponseModel = {
    val __obj = js.Dynamic.literal(assetDetails = assetDetails, assetId = assetId, assetVersion = assetVersion, customerSupportEmail = customerSupportEmail, integrationContactEmail = integrationContactEmail, operation = operation, operationStatus = operationStatus, planId = planId, publisherId = publisherId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AzureRestApiResponseModel]
  }
}

