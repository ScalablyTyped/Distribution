package typings.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemTypeModel extends StObject {
  
  var behaviors: js.Array[WorkItemTypeBehavior]
  
  var `class`: WorkItemTypeClass
  
  var color: String
  
  var description: String
  
  var icon: String
  
  var id: String
  
  /**
    * Parent WIT Id/Internal ReferenceName that it inherits from
    */
  var inherits: String
  
  var isDisabled: Boolean
  
  var layout: FormLayout
  
  var name: String
  
  var states: js.Array[WorkItemStateResultModel]
  
  var url: String
}
object WorkItemTypeModel {
  
  inline def apply(
    behaviors: js.Array[WorkItemTypeBehavior],
    `class`: WorkItemTypeClass,
    color: String,
    description: String,
    icon: String,
    id: String,
    inherits: String,
    isDisabled: Boolean,
    layout: FormLayout,
    name: String,
    states: js.Array[WorkItemStateResultModel],
    url: String
  ): WorkItemTypeModel = {
    val __obj = js.Dynamic.literal(behaviors = behaviors.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inherits = inherits.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeModel]
  }
  
  extension [Self <: WorkItemTypeModel](x: Self) {
    
    inline def setBehaviors(value: js.Array[WorkItemTypeBehavior]): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
    
    inline def setBehaviorsVarargs(value: WorkItemTypeBehavior*): Self = StObject.set(x, "behaviors", js.Array(value*))
    
    inline def setClass(value: WorkItemTypeClass): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInherits(value: String): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: FormLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStates(value: js.Array[WorkItemStateResultModel]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesVarargs(value: WorkItemStateResultModel*): Self = StObject.set(x, "states", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
