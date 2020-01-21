package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsyncOperationNotFound extends js.Object {
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

object AnonAsyncOperationNotFound {
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
  ): AnonAsyncOperationNotFound = {
    val __obj = js.Dynamic.literal(asyncOperationNotFound = asyncOperationNotFound.asInstanceOf[js.Any], createBranchPermissionRequired = createBranchPermissionRequired.asInstanceOf[js.Any], gitObjectTooLarge = gitObjectTooLarge.asInstanceOf[js.Any], invalidRefName = invalidRefName.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], operationIndentityNotFound = operationIndentityNotFound.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], refNameConflict = refNameConflict.asInstanceOf[js.Any], targetBranchDeleted = targetBranchDeleted.asInstanceOf[js.Any], writePermissionRequired = writePermissionRequired.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAsyncOperationNotFound]
  }
}

