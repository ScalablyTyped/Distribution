package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncRefOperationCommitLevelEventNotification extends AsyncGitOperationNotification {
  var commitId: String = js.native
}

object AsyncRefOperationCommitLevelEventNotification {
  @scala.inline
  def apply(commitId: String, operationId: Double): AsyncRefOperationCommitLevelEventNotification = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], operationId = operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncRefOperationCommitLevelEventNotification]
  }
  @scala.inline
  implicit class AsyncRefOperationCommitLevelEventNotificationOps[Self <: AsyncRefOperationCommitLevelEventNotification] (val x: Self) extends AnyVal {
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
    def setCommitId(value: String): Self = this.set("commitId", value.asInstanceOf[js.Any])
  }
  
}

