package typings.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group extends StObject {
  
  /**
    * Contribution for the group.
    */
  var contribution: WitContribution
  
  /**
    * Controls to be put in the group.
    */
  var controls: js.Array[Control]
  
  /**
    * The height for the contribution.
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
    * A value indicating if the layout node is contribution are not.
    */
  var isContribution: Boolean
  
  /**
    * Label for the group.
    */
  var label: String
  
  /**
    * Order in which the group should appear in the section.
    */
  var order: Double
  
  /**
    * A value indicating whether this layout node has been overridden by a child layout.
    */
  var overridden: Boolean
  
  /**
    * A value indicating if the group should be hidden or not.
    */
  var visible: Boolean
}
object Group {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
    
    inline def setContribution(value: WitContribution): Self = StObject.set(x, "contribution", value.asInstanceOf[js.Any])
    
    inline def setControls(value: js.Array[Control]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsVarargs(value: Control*): Self = StObject.set(x, "controls", js.Array(value*))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInherited(value: Boolean): Self = StObject.set(x, "inherited", value.asInstanceOf[js.Any])
    
    inline def setIsContribution(value: Boolean): Self = StObject.set(x, "isContribution", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOverridden(value: Boolean): Self = StObject.set(x, "overridden", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
