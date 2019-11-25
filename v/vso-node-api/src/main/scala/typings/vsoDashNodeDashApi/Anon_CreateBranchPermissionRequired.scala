package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateBranchPermissionRequired extends js.Object {
  var createBranchPermissionRequired: Double
  var createTagPermissionRequired: Double
  var forcePushRequired: Double
  var invalidRefName: Double
  var locked: Double
  var manageNotePermissionRequired: Double
  var refNameConflict: Double
  var rejectedByPlugin: Double
  var rejectedByPolicy: Double
  var staleOldObjectId: Double
  var succeeded: Double
  var succeededCorruptRef: Double
  var succeededNonExistentRef: Double
  var unprocessed: Double
  var unresolvableToCommit: Double
  var writePermissionRequired: Double
}

object Anon_CreateBranchPermissionRequired {
  @scala.inline
  def apply(
    createBranchPermissionRequired: Double,
    createTagPermissionRequired: Double,
    forcePushRequired: Double,
    invalidRefName: Double,
    locked: Double,
    manageNotePermissionRequired: Double,
    refNameConflict: Double,
    rejectedByPlugin: Double,
    rejectedByPolicy: Double,
    staleOldObjectId: Double,
    succeeded: Double,
    succeededCorruptRef: Double,
    succeededNonExistentRef: Double,
    unprocessed: Double,
    unresolvableToCommit: Double,
    writePermissionRequired: Double
  ): Anon_CreateBranchPermissionRequired = {
    val __obj = js.Dynamic.literal(createBranchPermissionRequired = createBranchPermissionRequired.asInstanceOf[js.Any], createTagPermissionRequired = createTagPermissionRequired.asInstanceOf[js.Any], forcePushRequired = forcePushRequired.asInstanceOf[js.Any], invalidRefName = invalidRefName.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], manageNotePermissionRequired = manageNotePermissionRequired.asInstanceOf[js.Any], refNameConflict = refNameConflict.asInstanceOf[js.Any], rejectedByPlugin = rejectedByPlugin.asInstanceOf[js.Any], rejectedByPolicy = rejectedByPolicy.asInstanceOf[js.Any], staleOldObjectId = staleOldObjectId.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], succeededCorruptRef = succeededCorruptRef.asInstanceOf[js.Any], succeededNonExistentRef = succeededNonExistentRef.asInstanceOf[js.Any], unprocessed = unprocessed.asInstanceOf[js.Any], unresolvableToCommit = unresolvableToCommit.asInstanceOf[js.Any], writePermissionRequired = writePermissionRequired.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CreateBranchPermissionRequired]
  }
}

