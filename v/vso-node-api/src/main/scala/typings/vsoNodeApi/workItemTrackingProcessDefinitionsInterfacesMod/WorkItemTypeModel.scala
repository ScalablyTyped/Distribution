package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemTypeModel extends StObject {
  
  /**
    * Behaviors of the work item type
    */
  var behaviors: js.Array[WorkItemTypeBehavior] = js.native
  
  /**
    * Class of the work item type
    */
  var `class`: WorkItemTypeClass = js.native
  
  /**
    * Color of the work item type
    */
  var color: String = js.native
  
  /**
    * Description of the work item type
    */
  var description: String = js.native
  
  /**
    * Icon of the work item type
    */
  var icon: String = js.native
  
  /**
    * The ID of the work item type
    */
  var id: String = js.native
  
  /**
    * Parent WIT Id/Internal ReferenceName that it inherits from
    */
  var inherits: String = js.native
  
  /**
    * Is work item type disabled
    */
  var isDisabled: Boolean = js.native
  
  /**
    * Layout of the work item type
    */
  var layout: FormLayout = js.native
  
  /**
    * Name of the work item type
    */
  var name: String = js.native
  
  /**
    * States of the work item type
    */
  var states: js.Array[WorkItemStateResultModel] = js.native
  
  /**
    * Url of the work item type
    */
  var url: String = js.native
}
object WorkItemTypeModel {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class WorkItemTypeModelMutableBuilder[Self <: WorkItemTypeModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBehaviors(value: js.Array[WorkItemTypeBehavior]): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehaviorsVarargs(value: WorkItemTypeBehavior*): Self = StObject.set(x, "behaviors", js.Array(value :_*))
    
    @scala.inline
    def setClass(value: WorkItemTypeClass): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInherits(value: String): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: FormLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStates(value: js.Array[WorkItemStateResultModel]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesVarargs(value: WorkItemStateResultModel*): Self = StObject.set(x, "states", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
