package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionAcquisitionRequest extends StObject {
  
  /**
    * How the item is being assigned
    */
  var assignmentType: AcquisitionAssignmentType
  
  /**
    * The id of the subscription used for purchase
    */
  var billingId: String
  
  /**
    * The marketplace id (publisherName.extensionName) for the item
    */
  var itemId: String
  
  /**
    * The type of operation, such as install, request, purchase
    */
  var operationType: AcquisitionOperationType
  
  /**
    * Additional properties which can be added to the request.
    */
  var properties: Any
  
  /**
    * How many licenses should be purchased
    */
  var quantity: Double
  
  /**
    * A list of target guids where the item should be acquired (installed, requested, etc.), such as account id
    */
  var targets: js.Array[String]
}
object ExtensionAcquisitionRequest {
  
  inline def apply(
    assignmentType: AcquisitionAssignmentType,
    billingId: String,
    itemId: String,
    operationType: AcquisitionOperationType,
    properties: Any,
    quantity: Double,
    targets: js.Array[String]
  ): ExtensionAcquisitionRequest = {
    val __obj = js.Dynamic.literal(assignmentType = assignmentType.asInstanceOf[js.Any], billingId = billingId.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionAcquisitionRequest]
  }
  
  extension [Self <: ExtensionAcquisitionRequest](x: Self) {
    
    inline def setAssignmentType(value: AcquisitionAssignmentType): Self = StObject.set(x, "assignmentType", value.asInstanceOf[js.Any])
    
    inline def setBillingId(value: String): Self = StObject.set(x, "billingId", value.asInstanceOf[js.Any])
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setOperationType(value: AcquisitionOperationType): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}
