package typings
package vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcChangeset extends TfvcChangesetRef {
  /**
    * Account Id of the changeset.
    */
  var accountId: java.lang.String
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
  var collectionId: java.lang.String
  /**
    * Are more changes available.
    */
  var hasMoreChanges: scala.Boolean
  /**
    * Policy Override for the changeset.
    */
  var policyOverride: TfvcPolicyOverrideInfo
  /**
    * Team Project Ids for the changeset.
    */
  var teamProjectIds: js.Array[java.lang.String]
  /**
    * List of work items associated with the changeset.
    */
  var workItems: js.Array[AssociatedWorkItem]
}

object TfvcChangeset {
  @scala.inline
  def apply(
    _links: js.Any,
    accountId: java.lang.String,
    author: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    changes: js.Array[TfvcChange],
    changesetId: scala.Double,
    checkedInBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    checkinNotes: js.Array[CheckinNote],
    collectionId: java.lang.String,
    comment: java.lang.String,
    commentTruncated: scala.Boolean,
    createdDate: stdLib.Date,
    hasMoreChanges: scala.Boolean,
    policyOverride: TfvcPolicyOverrideInfo,
    teamProjectIds: js.Array[java.lang.String],
    url: java.lang.String,
    workItems: js.Array[AssociatedWorkItem]
  ): TfvcChangeset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("accountId")(accountId)
    __obj.updateDynamic("author")(author)
    __obj.updateDynamic("changes")(changes)
    __obj.updateDynamic("changesetId")(changesetId)
    __obj.updateDynamic("checkedInBy")(checkedInBy)
    __obj.updateDynamic("checkinNotes")(checkinNotes)
    __obj.updateDynamic("collectionId")(collectionId)
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("commentTruncated")(commentTruncated)
    __obj.updateDynamic("createdDate")(createdDate)
    __obj.updateDynamic("hasMoreChanges")(hasMoreChanges)
    __obj.updateDynamic("policyOverride")(policyOverride)
    __obj.updateDynamic("teamProjectIds")(teamProjectIds)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("workItems")(workItems)
    __obj.asInstanceOf[TfvcChangeset]
  }
}

