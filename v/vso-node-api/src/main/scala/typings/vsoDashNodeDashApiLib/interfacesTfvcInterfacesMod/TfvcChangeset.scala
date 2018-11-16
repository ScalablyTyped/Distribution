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

