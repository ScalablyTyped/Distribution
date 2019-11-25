package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

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
  /**
    * A list of target guids where the item should be acquired (installed, requested, etc.), such as account id
    */
  var targets: js.Array[String]
}

object ExtensionAcquisitionRequest {
  @scala.inline
  def apply(
    assignmentType: AcquisitionAssignmentType,
    billingId: String,
    itemId: String,
    operationType: AcquisitionOperationType,
    properties: js.Any,
    quantity: Double,
    targets: js.Array[String]
  ): ExtensionAcquisitionRequest = {
    val __obj = js.Dynamic.literal(assignmentType = assignmentType.asInstanceOf[js.Any], billingId = billingId.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionAcquisitionRequest]
  }
}

