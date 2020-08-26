package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncOperationNotFound extends js.Object {
  var asyncOperationNotFound: scala.Double = js.native
  var createBranchPermissionRequired: scala.Double = js.native
  var gitObjectTooLarge: scala.Double = js.native
  var invalidRefName: scala.Double = js.native
  var none: scala.Double = js.native
  var operationIndentityNotFound: scala.Double = js.native
  var other: scala.Double = js.native
  var refNameConflict: scala.Double = js.native
  var targetBranchDeleted: scala.Double = js.native
  var writePermissionRequired: scala.Double = js.native
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
  @scala.inline
  implicit class AsyncOperationNotFoundOps[Self <: AsyncOperationNotFound] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsyncOperationNotFound(value: scala.Double): Self = this.set("asyncOperationNotFound", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateBranchPermissionRequired(value: scala.Double): Self = this.set("createBranchPermissionRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def setGitObjectTooLarge(value: scala.Double): Self = this.set("gitObjectTooLarge", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidRefName(value: scala.Double): Self = this.set("invalidRefName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationIndentityNotFound(value: scala.Double): Self = this.set("operationIndentityNotFound", value.asInstanceOf[js.Any])
    @scala.inline
    def setOther(value: scala.Double): Self = this.set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefNameConflict(value: scala.Double): Self = this.set("refNameConflict", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetBranchDeleted(value: scala.Double): Self = this.set("targetBranchDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setWritePermissionRequired(value: scala.Double): Self = this.set("writePermissionRequired", value.asInstanceOf[js.Any])
  }
  
}

