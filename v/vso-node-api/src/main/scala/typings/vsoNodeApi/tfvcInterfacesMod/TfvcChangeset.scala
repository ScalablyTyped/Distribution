package typings.vsoNodeApi.tfvcInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcChangeset extends TfvcChangesetRef {
  /**
    * Account Id of the changeset.
    */
  var accountId: String = js.native
  /**
    * List of associated changes.
    */
  var changes: js.Array[TfvcChange] = js.native
  /**
    * Checkin Notes for the changeset.
    */
  var checkinNotes: js.Array[CheckinNote] = js.native
  /**
    * Collection Id of the changeset.
    */
  var collectionId: String = js.native
  /**
    * Are more changes available.
    */
  var hasMoreChanges: Boolean = js.native
  /**
    * Policy Override for the changeset.
    */
  var policyOverride: TfvcPolicyOverrideInfo = js.native
  /**
    * Team Project Ids for the changeset.
    */
  var teamProjectIds: js.Array[String] = js.native
  /**
    * List of work items associated with the changeset.
    */
  var workItems: js.Array[AssociatedWorkItem] = js.native
}

object TfvcChangeset {
  @scala.inline
  def apply(
    _links: js.Any,
    accountId: String,
    author: IdentityRef,
    changes: js.Array[TfvcChange],
    changesetId: Double,
    checkedInBy: IdentityRef,
    checkinNotes: js.Array[CheckinNote],
    collectionId: String,
    comment: String,
    commentTruncated: Boolean,
    createdDate: Date,
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
  implicit class TfvcChangesetOps[Self <: TfvcChangeset] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangesVarargs(value: TfvcChange*): Self = this.set("changes", js.Array(value :_*))
    @scala.inline
    def setChanges(value: js.Array[TfvcChange]): Self = this.set("changes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckinNotesVarargs(value: CheckinNote*): Self = this.set("checkinNotes", js.Array(value :_*))
    @scala.inline
    def setCheckinNotes(value: js.Array[CheckinNote]): Self = this.set("checkinNotes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollectionId(value: String): Self = this.set("collectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasMoreChanges(value: Boolean): Self = this.set("hasMoreChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyOverride(value: TfvcPolicyOverrideInfo): Self = this.set("policyOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeamProjectIdsVarargs(value: String*): Self = this.set("teamProjectIds", js.Array(value :_*))
    @scala.inline
    def setTeamProjectIds(value: js.Array[String]): Self = this.set("teamProjectIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkItemsVarargs(value: AssociatedWorkItem*): Self = this.set("workItems", js.Array(value :_*))
    @scala.inline
    def setWorkItems(value: js.Array[AssociatedWorkItem]): Self = this.set("workItems", value.asInstanceOf[js.Any])
  }
  
}

