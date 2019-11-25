package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Control extends js.Object {
  /**
    * Contribution for the control.
    */
  var contribution: WitContribution
  /**
    * Type of the control.
    */
  var controlType: String
  /**
    * Height of the control, for html controls.
    */
  var height: Double
  /**
    * The id for the layout node.
    */
  var id: String
  /**
    * A value indicating whether this layout node has been inherited from a parent layout.  This is expected to only be only set by the combiner.
    */
  var inherited: Boolean
  /**
    * A value indicating if the layout node is contribution or not.
    */
  var isContribution: Boolean
  /**
    * Label for the field
    */
  var label: String
  /**
    * Inner text of the control.
    */
  var metadata: String
  var order: Double
  /**
    * A value indicating whether this layout node has been overridden by a child layout.
    */
  var overridden: Boolean
  /**
    * A value indicating if the control is readonly.
    */
  var readOnly: Boolean
  /**
    * A value indicating if the control should be hidden or not.
    */
  var visible: Boolean
  /**
    * Watermark text for the textbox.
    */
  var watermark: String
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
}

