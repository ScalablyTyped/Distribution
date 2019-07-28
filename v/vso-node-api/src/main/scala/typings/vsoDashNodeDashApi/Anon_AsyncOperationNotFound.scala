package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsyncOperationNotFound extends js.Object {
  var asyncOperationNotFound: Double
  var createBranchPermissionRequired: Double
  var gitObjectTooLarge: Double
  var invalidRefName: Double
  var none: Double
  var operationIndentityNotFound: Double
  var other: Double
  var refNameConflict: Double
  var targetBranchDeleted: Double
  var writePermissionRequired: Double
}

object Anon_AsyncOperationNotFound {
  @scala.inline
  def apply(
    asyncOperationNotFound: Double,
    createBranchPermissionRequired: Double,
    gitObjectTooLarge: Double,
    invalidRefName: Double,
    none: Double,
    operationIndentityNotFound: Double,
    other: Double,
    refNameConflict: Double,
    targetBranchDeleted: Double,
    writePermissionRequired: Double
  ): Anon_AsyncOperationNotFound = {
    val __obj = js.Dynamic.literal(asyncOperationNotFound = asyncOperationNotFound, createBranchPermissionRequired = createBranchPermissionRequired, gitObjectTooLarge = gitObjectTooLarge, invalidRefName = invalidRefName, none = none, operationIndentityNotFound = operationIndentityNotFound, other = other, refNameConflict = refNameConflict, targetBranchDeleted = targetBranchDeleted, writePermissionRequired = writePermissionRequired)
  
    __obj.asInstanceOf[Anon_AsyncOperationNotFound]
  }
}

