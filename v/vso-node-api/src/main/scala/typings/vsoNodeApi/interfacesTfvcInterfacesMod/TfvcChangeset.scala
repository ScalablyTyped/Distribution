package typings.vsoNodeApi.interfacesTfvcInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfvcChangeset
  extends StObject
     with TfvcChangesetRef {
  
  /**
    * Account Id of the changeset.
    */
  var accountId: String
  
  /**
    * List of associated changes.
    */
  var changes: js.Array[TfvcChange]
  
  /**
    * Checkin Notes for the changeset.
    */
  var checkinNotes: js.Array[CheckinNote]
  
  /**
    * Collection Id of the changeset.
    */
  var collectionId: String
  
  /**
    * Are more changes available.
    */
  var hasMoreChanges: Boolean
  
  /**
    * Policy Override for the changeset.
    */
  var policyOverride: TfvcPolicyOverrideInfo
  
  /**
    * Team Project Ids for the changeset.
    */
  var teamProjectIds: js.Array[String]
  
  /**
    * List of work items associated with the changeset.
    */
  var workItems: js.Array[AssociatedWorkItem]
}
object TfvcChangeset {
  
  inline def apply(
    _links: Any,
    accountId: String,
    author: IdentityRef,
    changes: js.Array[TfvcChange],
    changesetId: Double,
    checkedInBy: IdentityRef,
    checkinNotes: js.Array[CheckinNote],
    collectionId: String,
    comment: String,
    commentTruncated: Boolean,
    createdDate: js.Date,
    hasMoreChanges: Boolean,
    policyOverride: TfvcPolicyOverrideInfo,
    teamProjectIds: js.Array[String],
    url: String,
    workItems: js.Array[AssociatedWorkItem]
  ): TfvcChangeset = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], accountId = accountId.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], changesetId = changesetId.asInstanceOf[js.Any], checkedInBy = checkedInBy.asInstanceOf[js.Any], checkinNotes = checkinNotes.asInstanceOf[js.Any], collectionId = collectionId.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], commentTruncated = commentTruncated.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], hasMoreChanges = hasMoreChanges.asInstanceOf[js.Any], policyOverride = policyOverride.asInstanceOf[js.Any], teamProjectIds = teamProjectIds.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcChangeset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TfvcChangeset] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setChanges(value: js.Array[TfvcChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesVarargs(value: TfvcChange*): Self = StObject.set(x, "changes", js.Array(value*))
    
    inline def setCheckinNotes(value: js.Array[CheckinNote]): Self = StObject.set(x, "checkinNotes", value.asInstanceOf[js.Any])
    
    inline def setCheckinNotesVarargs(value: CheckinNote*): Self = StObject.set(x, "checkinNotes", js.Array(value*))
    
    inline def setCollectionId(value: String): Self = StObject.set(x, "collectionId", value.asInstanceOf[js.Any])
    
    inline def setHasMoreChanges(value: Boolean): Self = StObject.set(x, "hasMoreChanges", value.asInstanceOf[js.Any])
    
    inline def setPolicyOverride(value: TfvcPolicyOverrideInfo): Self = StObject.set(x, "policyOverride", value.asInstanceOf[js.Any])
    
    inline def setTeamProjectIds(value: js.Array[String]): Self = StObject.set(x, "teamProjectIds", value.asInstanceOf[js.Any])
    
    inline def setTeamProjectIdsVarargs(value: String*): Self = StObject.set(x, "teamProjectIds", js.Array(value*))
    
    inline def setWorkItems(value: js.Array[AssociatedWorkItem]): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
    
    inline def setWorkItemsVarargs(value: AssociatedWorkItem*): Self = StObject.set(x, "workItems", js.Array(value*))
  }
}
