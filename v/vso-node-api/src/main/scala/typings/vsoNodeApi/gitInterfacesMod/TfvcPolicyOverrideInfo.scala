package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcPolicyOverrideInfo extends js.Object {
  var comment: String = js.native
  var policyFailures: js.Array[TfvcPolicyFailureInfo] = js.native
}

object TfvcPolicyOverrideInfo {
  @scala.inline
  def apply(comment: String, policyFailures: js.Array[TfvcPolicyFailureInfo]): TfvcPolicyOverrideInfo = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], policyFailures = policyFailures.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcPolicyOverrideInfo]
  }
  @scala.inline
  implicit class TfvcPolicyOverrideInfoOps[Self <: TfvcPolicyOverrideInfo] (val x: Self) extends AnyVal {
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
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyFailuresVarargs(value: TfvcPolicyFailureInfo*): Self = this.set("policyFailures", js.Array(value :_*))
    @scala.inline
    def setPolicyFailures(value: js.Array[TfvcPolicyFailureInfo]): Self = this.set("policyFailures", value.asInstanceOf[js.Any])
  }
  
}

