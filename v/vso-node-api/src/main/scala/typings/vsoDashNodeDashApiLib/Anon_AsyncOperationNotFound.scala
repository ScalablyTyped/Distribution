package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsyncOperationNotFound extends js.Object {
  var asyncOperationNotFound: scala.Double
  var createBranchPermissionRequired: scala.Double
  var gitObjectTooLarge: scala.Double
  var invalidRefName: scala.Double
  var none: scala.Double
  var operationIndentityNotFound: scala.Double
  var other: scala.Double
  var refNameConflict: scala.Double
  var targetBranchDeleted: scala.Double
  var writePermissionRequired: scala.Double
}

object Anon_AsyncOperationNotFound {
  @scala.inline
  def apply(
    asyncOperationNotFound: scala.Double,
    createBranchPermissionRequired: scala.Double,
    gitObjectTooLarge: scala.Double,
    invalidRefName: scala.Double,
    none: scala.Double,
    operationIndentityNotFound: scala.Double,
    other: scala.Double,
    refNameConflict: scala.Double,
    targetBranchDeleted: scala.Double,
    writePermissionRequired: scala.Double
  ): Anon_AsyncOperationNotFound = {
    val __obj = js.Dynamic.literal(asyncOperationNotFound = asyncOperationNotFound, createBranchPermissionRequired = createBranchPermissionRequired, gitObjectTooLarge = gitObjectTooLarge, invalidRefName = invalidRefName, none = none, operationIndentityNotFound = operationIndentityNotFound, other = other, refNameConflict = refNameConflict, targetBranchDeleted = targetBranchDeleted, writePermissionRequired = writePermissionRequired)
  
    __obj.asInstanceOf[Anon_AsyncOperationNotFound]
  }
}

