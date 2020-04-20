package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcChangeset extends TfvcChangesetRef {
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
}

