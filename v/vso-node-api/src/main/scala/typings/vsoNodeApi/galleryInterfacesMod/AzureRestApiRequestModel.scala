package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureRestApiRequestModel extends js.Object {
  /**
    * Gets or sets the Asset details
    */
  var assetDetails: AssetDetails = js.native
  /**
    * Gets or sets the asset id
    */
  var assetId: String = js.native
  /**
    * Gets or sets the asset version
    */
  var assetVersion: Double = js.native
  /**
    * Gets or sets the customer support email
    */
  var customerSupportEmail: String = js.native
  /**
    * Gets or sets the integration contact email
    */
  var integrationContactEmail: String = js.native
  /**
    * Gets or sets the asset version
    */
  var operation: String = js.native
  /**
    * Gets or sets the plan identifier if any.
    */
  var planId: String = js.native
  /**
    * Gets or sets the publisher id
    */
  var publisherId: String = js.native
  /**
    * Gets or sets the resource type
    */
  var `type`: String = js.native
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
    val __obj = js.Dynamic.literal(assetDetails = assetDetails.asInstanceOf[js.Any], assetId = assetId.asInstanceOf[js.Any], assetVersion = assetVersion.asInstanceOf[js.Any], customerSupportEmail = customerSupportEmail.asInstanceOf[js.Any], integrationContactEmail = integrationContactEmail.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], publisherId = publisherId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureRestApiRequestModel]
  }
  @scala.inline
  implicit class AzureRestApiRequestModelOps[Self <: AzureRestApiRequestModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssetDetails(value: AssetDetails): Self = this.set("assetDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssetId(value: String): Self = this.set("assetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssetVersion(value: Double): Self = this.set("assetVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomerSupportEmail(value: String): Self = this.set("customerSupportEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntegrationContactEmail(value: String): Self = this.set("integrationContactEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlanId(value: String): Self = this.set("planId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublisherId(value: String): Self = this.set("publisherId", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

