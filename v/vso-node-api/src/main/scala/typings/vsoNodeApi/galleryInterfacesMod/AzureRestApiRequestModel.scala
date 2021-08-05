package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzureRestApiRequestModel extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: AzureRestApiRequestModel](x: Self) {
    
    inline def setAssetDetails(value: AssetDetails): Self = StObject.set(x, "assetDetails", value.asInstanceOf[js.Any])
    
    inline def setAssetId(value: String): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setAssetVersion(value: Double): Self = StObject.set(x, "assetVersion", value.asInstanceOf[js.Any])
    
    inline def setCustomerSupportEmail(value: String): Self = StObject.set(x, "customerSupportEmail", value.asInstanceOf[js.Any])
    
    inline def setIntegrationContactEmail(value: String): Self = StObject.set(x, "integrationContactEmail", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    inline def setPublisherId(value: String): Self = StObject.set(x, "publisherId", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
