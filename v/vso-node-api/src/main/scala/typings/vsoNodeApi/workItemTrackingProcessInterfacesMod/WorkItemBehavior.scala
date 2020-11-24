package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemBehavior extends js.Object {
  
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
  implicit class WorkItemBehaviorOps[Self <: WorkItemBehavior] (val x: Self) extends AnyVal {
    
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
    def setAbstract(value: Boolean): Self = this.set("abstract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: WorkItemBehaviorField*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[WorkItemBehaviorField]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInherits(value: WorkItemBehaviorReference): Self = this.set("inherits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverriden(value: Boolean): Self = this.set("overriden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
