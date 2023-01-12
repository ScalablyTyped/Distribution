package typings.vsoNodeApi.interfacesTfvcInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfvcShelveset
  extends StObject
     with TfvcShelvesetRef {
  
  var changes: js.Array[TfvcChange]
  
  var notes: js.Array[CheckinNote]
  
  var policyOverride: TfvcPolicyOverrideInfo
  
  var workItems: js.Array[AssociatedWorkItem]
}
object TfvcShelveset {
  
  inline def apply(
    _links: Any,
    changes: js.Array[TfvcChange],
    comment: String,
    commentTruncated: Boolean,
    createdDate: js.Date,
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
  implicit open class MutableBuilder[Self <: TfvcShelveset] (val x: Self) extends AnyVal {
    
    inline def setChanges(value: js.Array[TfvcChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesVarargs(value: TfvcChange*): Self = StObject.set(x, "changes", js.Array(value*))
    
    inline def setNotes(value: js.Array[CheckinNote]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesVarargs(value: CheckinNote*): Self = StObject.set(x, "notes", js.Array(value*))
    
    inline def setPolicyOverride(value: TfvcPolicyOverrideInfo): Self = StObject.set(x, "policyOverride", value.asInstanceOf[js.Any])
    
    inline def setWorkItems(value: js.Array[AssociatedWorkItem]): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
    
    inline def setWorkItemsVarargs(value: AssociatedWorkItem*): Self = StObject.set(x, "workItems", js.Array(value*))
  }
}
