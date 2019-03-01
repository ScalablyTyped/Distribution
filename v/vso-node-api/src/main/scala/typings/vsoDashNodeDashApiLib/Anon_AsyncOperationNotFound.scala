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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asyncOperationNotFound")(asyncOperationNotFound)
    __obj.updateDynamic("createBranchPermissionRequired")(createBranchPermissionRequired)
    __obj.updateDynamic("gitObjectTooLarge")(gitObjectTooLarge)
    __obj.updateDynamic("invalidRefName")(invalidRefName)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("operationIndentityNotFound")(operationIndentityNotFound)
    __obj.updateDynamic("other")(other)
    __obj.updateDynamic("refNameConflict")(refNameConflict)
    __obj.updateDynamic("targetBranchDeleted")(targetBranchDeleted)
    __obj.updateDynamic("writePermissionRequired")(writePermissionRequired)
    __obj.asInstanceOf[Anon_AsyncOperationNotFound]
  }
}

