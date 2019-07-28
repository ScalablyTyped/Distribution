package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

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
    val __obj = js.Dynamic.literal(contribution = contribution, controlType = controlType, height = height, id = id, inherited = inherited, isContribution = isContribution, label = label, metadata = metadata, order = order, overridden = overridden, readOnly = readOnly, visible = visible, watermark = watermark)
  
    __obj.asInstanceOf[Control]
  }
}

