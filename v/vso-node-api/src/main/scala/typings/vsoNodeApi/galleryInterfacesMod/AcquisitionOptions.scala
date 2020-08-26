package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcquisitionOptions extends js.Object {
  /**
    * Default Operation for the ItemId in this target
    */
  var defaultOperation: AcquisitionOperation = js.native
  /**
    * The item id that this options refer to
    */
  var itemId: String = js.native
  /**
    * Operations allowed for the ItemId in this target
    */
  var operations: js.Array[AcquisitionOperation] = js.native
  /**
    * The target that this options refer to
    */
  var target: String = js.native
}

object AcquisitionOptions {
  @scala.inline
  def apply(
    defaultOperation: AcquisitionOperation,
    itemId: String,
    operations: js.Array[AcquisitionOperation],
    target: String
  ): AcquisitionOptions = {
    val __obj = js.Dynamic.literal(defaultOperation = defaultOperation.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcquisitionOptions]
  }
  @scala.inline
  implicit class AcquisitionOptionsOps[Self <: AcquisitionOptions] (val x: Self) extends AnyVal {
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
    def setDefaultOperation(value: AcquisitionOperation): Self = this.set("defaultOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemId(value: String): Self = this.set("itemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationsVarargs(value: AcquisitionOperation*): Self = this.set("operations", js.Array(value :_*))
    @scala.inline
    def setOperations(value: js.Array[AcquisitionOperation]): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

