package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group extends js.Object {
  
  /**
    * Contribution for the group.
    */
  var contribution: WitContribution = js.native
  
  /**
    * Controls to be put in the group.
    */
  var controls: js.Array[Control] = js.native
  
  /**
    * The height for the contribution.
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
    * A value indicating if the layout node is contribution are not.
    */
  var isContribution: Boolean = js.native
  
  /**
    * Label for the group.
    */
  var label: String = js.native
  
  /**
    * Order in which the group should appear in the section.
    */
  var order: Double = js.native
  
  /**
    * A value indicating whether this layout node has been overridden by a child layout.
    */
  var overridden: Boolean = js.native
  
  /**
    * A value indicating if the group should be hidden or not.
    */
  var visible: Boolean = js.native
}
object Group {
  
  @scala.inline
  def apply(
    contribution: WitContribution,
    controls: js.Array[Control],
    height: Double,
    id: String,
    inherited: Boolean,
    isContribution: Boolean,
    label: String,
    order: Double,
    overridden: Boolean,
    visible: Boolean
  ): Group = {
    val __obj = js.Dynamic.literal(contribution = contribution.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inherited = inherited.asInstanceOf[js.Any], isContribution = isContribution.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], overridden = overridden.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit class GroupOps[Self <: Group] (val x: Self) extends AnyVal {
    
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
    def setControlsVarargs(value: Control*): Self = this.set("controls", js.Array(value :_*))
    
    @scala.inline
    def setControls(value: js.Array[Control]): Self = this.set("controls", value.asInstanceOf[js.Any])
    
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
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridden(value: Boolean): Self = this.set("overridden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
}
