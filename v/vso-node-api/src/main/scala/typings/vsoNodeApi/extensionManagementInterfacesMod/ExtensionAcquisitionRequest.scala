package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionAcquisitionRequest extends js.Object {
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
  var properties: js.Any
  /**
    * How many licenses should be purchased
    */
  var quantity: Double
}

object ExtensionAcquisitionRequest {
  @scala.inline
  def apply(
    assignmentType: AcquisitionAssignmentType,
    billingId: String,
    itemId: String,
    operationType: AcquisitionOperationType,
    properties: js.Any,
    quantity: Double
  ): ExtensionAcquisitionRequest = {
    val __obj = js.Dynamic.literal(assignmentType = assignmentType.asInstanceOf[js.Any], billingId = billingId.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionAcquisitionRequest]
  }
}

