package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemBehavior extends StObject {
  
  var `abstract`: Boolean = js.native
  
  var color: String = js.native
  
  var description: String = js.native
  
  var fields: js.Array[WorkItemBehaviorField] = js.native
  
  var id: String = js.native
  
  var inherits: WorkItemBehaviorReference = js.native
  
  var name: String = js.native
  
  var overriden: Boolean = js.native
  
  var rank: Double = js.native
  
  var url: String = js.native
}
object WorkItemBehavior {
  
  @scala.inline
  def apply(
    `abstract`: Boolean,
    color: String,
    description: String,
    fields: js.Array[WorkItemBehaviorField],
    id: String,
    inherits: WorkItemBehaviorReference,
    name: String,
    overriden: Boolean,
    rank: Double,
    url: String
  ): WorkItemBehavior = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inherits = inherits.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], overriden = overriden.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemBehavior]
  }
  
  @scala.inline
  implicit class WorkItemBehaviorMutableBuilder[Self <: WorkItemBehavior] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbstract(value: Boolean): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: js.Array[WorkItemBehaviorField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: WorkItemBehaviorField*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInherits(value: WorkItemBehaviorReference): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverriden(value: Boolean): Self = StObject.set(x, "overriden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
