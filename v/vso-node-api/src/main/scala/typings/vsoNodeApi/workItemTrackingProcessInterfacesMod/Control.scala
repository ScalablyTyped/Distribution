package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Control extends js.Object {
  /**
    * Contribution for the control.
    */
  var contribution: WitContribution = js.native
  /**
    * Type of the control.
    */
  var controlType: String = js.native
  /**
    * Height of the control, for html controls.
    */
  var height: Double = js.native
  /**
    * The id for the layout node.
    */
  var id: String = js.native
  /**
    * A value indicating whether this layout node has been inherited from a parent layout.  This is expected to only be only set by the combiner.
    */
  var inherited: Boolean = js.native
  /**
    * A value indicating if the layout node is contribution or not.
    */
  var isContribution: Boolean = js.native
  /**
    * Label for the field
    */
  var label: String = js.native
  /**
    * Inner text of the control.
    */
  var metadata: String = js.native
  var order: Double = js.native
  /**
    * A value indicating whether this layout node has been overridden by a child layout.
    */
  var overridden: Boolean = js.native
  /**
    * A value indicating if the control is readonly.
    */
  var readOnly: Boolean = js.native
  /**
    * A value indicating if the control should be hidden or not.
    */
  var visible: Boolean = js.native
  /**
    * Watermark text for the textbox.
    */
  var watermark: String = js.native
}

object Control {
  @scala.inline
  def apply(
    contribution: WitContribution,
    controlType: String,
    height: Double,
    id: String,
    inherited: Boolean,
    isContribution: Boolean,
    label: String,
    metadata: String,
    order: Double,
    overridden: Boolean,
    readOnly: Boolean,
    visible: Boolean,
    watermark: String
  ): Control = {
    val __obj = js.Dynamic.literal(contribution = contribution.asInstanceOf[js.Any], controlType = controlType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inherited = inherited.asInstanceOf[js.Any], isContribution = isContribution.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], overridden = overridden.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], watermark = watermark.asInstanceOf[js.Any])
    __obj.asInstanceOf[Control]
  }
  @scala.inline
  implicit class ControlOps[Self <: Control] (val x: Self) extends AnyVal {
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
    def setContribution(value: WitContribution): Self = this.set("contribution", value.asInstanceOf[js.Any])
    @scala.inline
    def setControlType(value: String): Self = this.set("controlType", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInherited(value: Boolean): Self = this.set("inherited", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsContribution(value: Boolean): Self = this.set("isContribution", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: String): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverridden(value: Boolean): Self = this.set("overridden", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setWatermark(value: String): Self = this.set("watermark", value.asInstanceOf[js.Any])
  }
  
}

