package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
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
  implicit class TfvcShelvesetOps[Self <: TfvcShelveset] (val x: Self) extends AnyVal {
    
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
    def setChangesVarargs(value: TfvcChange*): Self = this.set("changes", js.Array(value :_*))
    
    @scala.inline
    def setChanges(value: js.Array[TfvcChange]): Self = this.set("changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesVarargs(value: CheckinNote*): Self = this.set("notes", js.Array(value :_*))
    
    @scala.inline
    def setNotes(value: js.Array[CheckinNote]): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyOverride(value: TfvcPolicyOverrideInfo): Self = this.set("policyOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemsVarargs(value: AssociatedWorkItem*): Self = this.set("workItems", js.Array(value :_*))
    
    @scala.inline
    def setWorkItems(value: js.Array[AssociatedWorkItem]): Self = this.set("workItems", value.asInstanceOf[js.Any])
  }
}
