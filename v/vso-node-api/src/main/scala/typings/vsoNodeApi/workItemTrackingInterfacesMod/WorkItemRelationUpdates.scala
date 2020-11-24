package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemRelationUpdates extends js.Object {
  
  /**
    * List of newly added relations.
    */
  var added: js.Array[WorkItemRelation] = js.native
  
  /**
    * List of removed relations.
    */
  var removed: js.Array[WorkItemRelation] = js.native
  
  /**
    * List of updated relations.
    */
  var updated: js.Array[WorkItemRelation] = js.native
}
object WorkItemRelationUpdates {
  
  @scala.inline
  def apply(
    added: js.Array[WorkItemRelation],
    removed: js.Array[WorkItemRelation],
    updated: js.Array[WorkItemRelation]
  ): WorkItemRelationUpdates = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemRelationUpdates]
  }
  
  @scala.inline
  implicit class WorkItemRelationUpdatesOps[Self <: WorkItemRelationUpdates] (val x: Self) extends AnyVal {
    
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
    def setAddedVarargs(value: WorkItemRelation*): Self = this.set("added", js.Array(value :_*))
    
    @scala.inline
    def setAdded(value: js.Array[WorkItemRelation]): Self = this.set("added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedVarargs(value: WorkItemRelation*): Self = this.set("removed", js.Array(value :_*))
    
    @scala.inline
    def setRemoved(value: js.Array[WorkItemRelation]): Self = this.set("removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedVarargs(value: WorkItemRelation*): Self = this.set("updated", js.Array(value :_*))
    
    @scala.inline
    def setUpdated(value: js.Array[WorkItemRelation]): Self = this.set("updated", value.asInstanceOf[js.Any])
  }
}
