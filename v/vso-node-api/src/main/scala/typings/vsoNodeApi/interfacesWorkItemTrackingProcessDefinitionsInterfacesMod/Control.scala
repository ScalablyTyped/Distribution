package typings.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Control extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: Control](x: Self) {
    
    inline def setContribution(value: WitContribution): Self = StObject.set(x, "contribution", value.asInstanceOf[js.Any])
    
    inline def setControlType(value: String): Self = StObject.set(x, "controlType", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInherited(value: Boolean): Self = StObject.set(x, "inherited", value.asInstanceOf[js.Any])
    
    inline def setIsContribution(value: Boolean): Self = StObject.set(x, "isContribution", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOverridden(value: Boolean): Self = StObject.set(x, "overridden", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWatermark(value: String): Self = StObject.set(x, "watermark", value.asInstanceOf[js.Any])
  }
}
