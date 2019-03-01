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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("assetDetails")(assetDetails)
    __obj.updateDynamic("assetId")(assetId)
    __obj.updateDynamic("assetVersion")(assetVersion)
    __obj.updateDynamic("customerSupportEmail")(customerSupportEmail)
    __obj.updateDynamic("integrationContactEmail")(integrationContactEmail)
    __obj.updateDynamic("operation")(operation)
    __obj.updateDynamic("operationStatus")(operationStatus)
    __obj.updateDynamic("planId")(planId)
    __obj.updateDynamic("publisherId")(publisherId)
    __obj.asInstanceOf[AzureRestApiResponseModel]
  }
}

