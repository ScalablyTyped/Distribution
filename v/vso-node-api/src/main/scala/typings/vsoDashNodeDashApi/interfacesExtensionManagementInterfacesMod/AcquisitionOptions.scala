package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcquisitionOptions extends js.Object {
  /**
    * Default Operation for the ItemId in this target
    */
  var defaultOperation: AcquisitionOperation
  /**
    * The item id that this options refer to
    */
  var itemId: String
  /**
    * Operations allowed for the ItemId in this target
    */
  var operations: js.Array[AcquisitionOperation]
  /**
    * Additional properties which can be added to the request.
    */
  var properties: js.Any
  /**
    * The target that this options refer to
    */
  var target: String
}

object AcquisitionOptions {
  @scala.inline
  def apply(
    defaultOperation: AcquisitionOperation,
    itemId: String,
    operations: js.Array[AcquisitionOperation],
    properties: js.Any,
    target: String
  ): AcquisitionOptions = {
    val __obj = js.Dynamic.literal(defaultOperation = defaultOperation, itemId = itemId, operations = operations, properties = properties, target = target)
  
    __obj.asInstanceOf[AcquisitionOptions]
  }
}

