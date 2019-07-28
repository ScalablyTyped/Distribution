package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureRestApiRequestModel extends js.Object {
  /**
    * Gets or sets the Asset details
    */
  var assetDetails: AssetDetails
  /**
    * Gets or sets the asset id
    */
  var assetId: String
  /**
    * Gets or sets the asset version
    */
  var assetVersion: Double
  /**
    * Gets or sets the customer support email
    */
  var customerSupportEmail: String
  /**
    * Gets or sets the integration contact email
    */
  var integrationContactEmail: String
  /**
    * Gets or sets the asset version
    */
  var operation: String
  /**
    * Gets or sets the plan identifier if any.
    */
  var planId: String
  /**
    * Gets or sets the publisher id
    */
  var publisherId: String
  /**
    * Gets or sets the resource type
    */
  var `type`: String
}

object AzureRestApiRequestModel {
  @scala.inline
  def apply(
    assetDetails: AssetDetails,
    assetId: String,
    assetVersion: Double,
    customerSupportEmail: String,
    integrationContactEmail: String,
    operation: String,
    planId: String,
    publisherId: String,
    `type`: String
  ): AzureRestApiRequestModel = {
    val __obj = js.Dynamic.literal(assetDetails = assetDetails, assetId = assetId, assetVersion = assetVersion, customerSupportEmail = customerSupportEmail, integrationContactEmail = integrationContactEmail, operation = operation, planId = planId, publisherId = publisherId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AzureRestApiRequestModel]
  }
}

