package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

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
  var billingId: java.lang.String
  /**
    * The marketplace id (publisherName.extensionName) for the item
    */
  var itemId: java.lang.String
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
  var quantity: scala.Double
}

object ExtensionAcquisitionRequest {
  @scala.inline
  def apply(
    assignmentType: AcquisitionAssignmentType,
    billingId: java.lang.String,
    itemId: java.lang.String,
    operationType: AcquisitionOperationType,
    properties: js.Any,
    quantity: scala.Double
  ): ExtensionAcquisitionRequest = {
    val __obj = js.Dynamic.literal(assignmentType = assignmentType, billingId = billingId, itemId = itemId, operationType = operationType, properties = properties, quantity = quantity)
  
    __obj.asInstanceOf[ExtensionAcquisitionRequest]
  }
}

