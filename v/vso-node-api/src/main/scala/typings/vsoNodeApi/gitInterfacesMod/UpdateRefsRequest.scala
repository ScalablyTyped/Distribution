package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRefsRequest extends js.Object {
  var refUpdateRequests: js.Array[GitRefUpdate] = js.native
  var updateMode: GitRefUpdateMode = js.native
}

object UpdateRefsRequest {
  @scala.inline
  def apply(refUpdateRequests: js.Array[GitRefUpdate], updateMode: GitRefUpdateMode): UpdateRefsRequest = {
    val __obj = js.Dynamic.literal(refUpdateRequests = refUpdateRequests.asInstanceOf[js.Any], updateMode = updateMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRefsRequest]
  }
  @scala.inline
  implicit class UpdateRefsRequestOps[Self <: UpdateRefsRequest] (val x: Self) extends AnyVal {
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
    def setRefUpdateRequestsVarargs(value: GitRefUpdate*): Self = this.set("refUpdateRequests", js.Array(value :_*))
    @scala.inline
    def setRefUpdateRequests(value: js.Array[GitRefUpdate]): Self = this.set("refUpdateRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateMode(value: GitRefUpdateMode): Self = this.set("updateMode", value.asInstanceOf[js.Any])
  }
  
}

