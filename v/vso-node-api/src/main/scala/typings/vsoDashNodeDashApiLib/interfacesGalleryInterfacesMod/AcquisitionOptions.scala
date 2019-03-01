package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

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
  var itemId: java.lang.String
  /**
    * Operations allowed for the ItemId in this target
    */
  var operations: js.Array[AcquisitionOperation]
  /**
    * The target that this options refer to
    */
  var target: java.lang.String
}

object AcquisitionOptions {
  @scala.inline
  def apply(
    defaultOperation: AcquisitionOperation,
    itemId: java.lang.String,
    operations: js.Array[AcquisitionOperation],
    target: java.lang.String
  ): AcquisitionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultOperation")(defaultOperation)
    __obj.updateDynamic("itemId")(itemId)
    __obj.updateDynamic("operations")(operations)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[AcquisitionOptions]
  }
}

