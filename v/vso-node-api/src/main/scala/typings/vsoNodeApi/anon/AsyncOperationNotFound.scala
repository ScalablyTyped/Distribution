package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncOperationNotFound extends js.Object {
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

object AsyncOperationNotFound {
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
  ): AsyncOperationNotFound = {
    val __obj = js.Dynamic.literal(asyncOperationNotFound = asyncOperationNotFound.asInstanceOf[js.Any], createBranchPermissionRequired = createBranchPermissionRequired.asInstanceOf[js.Any], gitObjectTooLarge = gitObjectTooLarge.asInstanceOf[js.Any], invalidRefName = invalidRefName.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], operationIndentityNotFound = operationIndentityNotFound.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], refNameConflict = refNameConflict.asInstanceOf[js.Any], targetBranchDeleted = targetBranchDeleted.asInstanceOf[js.Any], writePermissionRequired = writePermissionRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncOperationNotFound]
  }
}

