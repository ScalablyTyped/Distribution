package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemRelationUpdates extends StObject {
  
  /**
    * List of newly added relations.
    */
  var added: js.Array[WorkItemRelation]
  
  /**
    * List of removed relations.
    */
  var removed: js.Array[WorkItemRelation]
  
  /**
    * List of updated relations.
    */
  var updated: js.Array[WorkItemRelation]
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
  implicit class WorkItemRelationUpdatesMutableBuilder[Self <: WorkItemRelationUpdates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdded(value: js.Array[WorkItemRelation]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedVarargs(value: WorkItemRelation*): Self = StObject.set(x, "added", js.Array(value :_*))
    
    @scala.inline
    def setRemoved(value: js.Array[WorkItemRelation]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedVarargs(value: WorkItemRelation*): Self = StObject.set(x, "removed", js.Array(value :_*))
    
    @scala.inline
    def setUpdated(value: js.Array[WorkItemRelation]): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedVarargs(value: WorkItemRelation*): Self = StObject.set(x, "updated", js.Array(value :_*))
  }
}
