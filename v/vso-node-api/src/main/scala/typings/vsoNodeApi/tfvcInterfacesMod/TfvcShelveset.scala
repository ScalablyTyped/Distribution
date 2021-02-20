package typings.vsoNodeApi.tfvcInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TfvcShelveset extends TfvcShelvesetRef {
  
  var changes: js.Array[TfvcChange] = js.native
  
  var notes: js.Array[CheckinNote] = js.native
  
  var policyOverride: TfvcPolicyOverrideInfo = js.native
  
  var workItems: js.Array[AssociatedWorkItem] = js.native
}
object TfvcShelveset {
  
  @scala.inline
  def apply(
    _links: js.Any,
    changes: js.Array[TfvcChange],
    comment: String,
    commentTruncated: Boolean,
    createdDate: Date,
    id: String,
    name: String,
    notes: js.Array[CheckinNote],
    owner: IdentityRef,
    policyOverride: TfvcPolicyOverrideInfo,
    url: String,
    workItems: js.Array[AssociatedWorkItem]
  ): TfvcShelveset = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], commentTruncated = commentTruncated.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], policyOverride = policyOverride.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcShelveset]
  }
  
  @scala.inline
  implicit class TfvcShelvesetMutableBuilder[Self <: TfvcShelveset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanges(value: js.Array[TfvcChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesVarargs(value: TfvcChange*): Self = StObject.set(x, "changes", js.Array(value :_*))
    
    @scala.inline
    def setNotes(value: js.Array[CheckinNote]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesVarargs(value: CheckinNote*): Self = StObject.set(x, "notes", js.Array(value :_*))
    
    @scala.inline
    def setPolicyOverride(value: TfvcPolicyOverrideInfo): Self = StObject.set(x, "policyOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItems(value: js.Array[AssociatedWorkItem]): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemsVarargs(value: AssociatedWorkItem*): Self = StObject.set(x, "workItems", js.Array(value :_*))
  }
}
