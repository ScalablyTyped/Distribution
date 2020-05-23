package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBranchPermissionRequired extends js.Object {
  var createBranchPermissionRequired: scala.Double
  var createTagPermissionRequired: scala.Double
  var forcePushRequired: scala.Double
  var invalidRefName: scala.Double
  var locked: scala.Double
  var manageNotePermissionRequired: scala.Double
  var refNameConflict: scala.Double
  var rejectedByPlugin: scala.Double
  var rejectedByPolicy: scala.Double
  var staleOldObjectId: scala.Double
  var succeeded: scala.Double
  var succeededCorruptRef: scala.Double
  var succeededNonExistentRef: scala.Double
  var unprocessed: scala.Double
  var unresolvableToCommit: scala.Double
  var writePermissionRequired: scala.Double
}

object CreateBranchPermissionRequired {
  @scala.inline
  def apply(
    createBranchPermissionRequired: scala.Double,
    createTagPermissionRequired: scala.Double,
    forcePushRequired: scala.Double,
    invalidRefName: scala.Double,
    locked: scala.Double,
    manageNotePermissionRequired: scala.Double,
    refNameConflict: scala.Double,
    rejectedByPlugin: scala.Double,
    rejectedByPolicy: scala.Double,
    staleOldObjectId: scala.Double,
    succeeded: scala.Double,
    succeededCorruptRef: scala.Double,
    succeededNonExistentRef: scala.Double,
    unprocessed: scala.Double,
    unresolvableToCommit: scala.Double,
    writePermissionRequired: scala.Double
  ): CreateBranchPermissionRequired = {
    val __obj = js.Dynamic.literal(createBranchPermissionRequired = createBranchPermissionRequired.asInstanceOf[js.Any], createTagPermissionRequired = createTagPermissionRequired.asInstanceOf[js.Any], forcePushRequired = forcePushRequired.asInstanceOf[js.Any], invalidRefName = invalidRefName.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], manageNotePermissionRequired = manageNotePermissionRequired.asInstanceOf[js.Any], refNameConflict = refNameConflict.asInstanceOf[js.Any], rejectedByPlugin = rejectedByPlugin.asInstanceOf[js.Any], rejectedByPolicy = rejectedByPolicy.asInstanceOf[js.Any], staleOldObjectId = staleOldObjectId.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], succeededCorruptRef = succeededCorruptRef.asInstanceOf[js.Any], succeededNonExistentRef = succeededNonExistentRef.asInstanceOf[js.Any], unprocessed = unprocessed.asInstanceOf[js.Any], unresolvableToCommit = unresolvableToCommit.asInstanceOf[js.Any], writePermissionRequired = writePermissionRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBranchPermissionRequired]
  }
}

