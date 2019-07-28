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
    val __obj = js.Dynamic.literal(createBranchPermissionRequired = createBranchPermissionRequired, createTagPermissionRequired = createTagPermissionRequired, forcePushRequired = forcePushRequired, invalidRefName = invalidRefName, locked = locked, manageNotePermissionRequired = manageNotePermissionRequired, refNameConflict = refNameConflict, rejectedByPlugin = rejectedByPlugin, rejectedByPolicy = rejectedByPolicy, staleOldObjectId = staleOldObjectId, succeeded = succeeded, succeededCorruptRef = succeededCorruptRef, succeededNonExistentRef = succeededNonExistentRef, unprocessed = unprocessed, unresolvableToCommit = unresolvableToCommit, writePermissionRequired = writePermissionRequired)
  
    __obj.asInstanceOf[Anon_CreateBranchPermissionRequired]
  }
}

