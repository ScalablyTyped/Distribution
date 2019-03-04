package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateBranchPermissionRequired extends js.Object {
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

object Anon_CreateBranchPermissionRequired {
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
  ): Anon_CreateBranchPermissionRequired = {
    val __obj = js.Dynamic.literal(createBranchPermissionRequired = createBranchPermissionRequired, createTagPermissionRequired = createTagPermissionRequired, forcePushRequired = forcePushRequired, invalidRefName = invalidRefName, locked = locked, manageNotePermissionRequired = manageNotePermissionRequired, refNameConflict = refNameConflict, rejectedByPlugin = rejectedByPlugin, rejectedByPolicy = rejectedByPolicy, staleOldObjectId = staleOldObjectId, succeeded = succeeded, succeededCorruptRef = succeededCorruptRef, succeededNonExistentRef = succeededNonExistentRef, unprocessed = unprocessed, unresolvableToCommit = unresolvableToCommit, writePermissionRequired = writePermissionRequired)
  
    __obj.asInstanceOf[Anon_CreateBranchPermissionRequired]
  }
}

