package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItem extends WorkItemTrackingResource {
  
  /**
    * Map of field and values for the work item.
    */
  var fields: StringDictionary[js.Any] = js.native
  
  /**
    * The work item ID.
    */
  var id: Double = js.native
  
  /**
    * Relations of the work item.
    */
  var relations: js.Array[WorkItemRelation] = js.native
  
  /**
    * Revision number of the work item.
    */
  var rev: Double = js.native
}
object WorkItem {
  
  @scala.inline
  def apply(
    _links: js.Any,
    fields: StringDictionary[js.Any],
    id: Double,
    relations: js.Array[WorkItemRelation],
    rev: Double,
    url: String
  ): WorkItem = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], relations = relations.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItem]
  }
  
  @scala.inline
  implicit class WorkItemOps[Self <: WorkItem] (val x: Self) extends AnyVal {
    
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
    def setFields(value: StringDictionary[js.Any]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationsVarargs(value: WorkItemRelation*): Self = this.set("relations", js.Array(value :_*))
    
    @scala.inline
    def setRelations(value: js.Array[WorkItemRelation]): Self = this.set("relations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRev(value: Double): Self = this.set("rev", value.asInstanceOf[js.Any])
  }
}
