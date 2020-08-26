package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBehalfOf extends js.Object {
  var onBehalfOf: scala.Double = js.native
  var revalidateApproverIdentity: scala.Double = js.native
}

object OnBehalfOf {
  @scala.inline
  def apply(onBehalfOf: scala.Double, revalidateApproverIdentity: scala.Double): OnBehalfOf = {
    val __obj = js.Dynamic.literal(onBehalfOf = onBehalfOf.asInstanceOf[js.Any], revalidateApproverIdentity = revalidateApproverIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBehalfOf]
  }
  @scala.inline
  implicit class OnBehalfOfOps[Self <: OnBehalfOf] (val x: Self) extends AnyVal {
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
    def setOnBehalfOf(value: scala.Double): Self = this.set("onBehalfOf", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevalidateApproverIdentity(value: scala.Double): Self = this.set("revalidateApproverIdentity", value.asInstanceOf[js.Any])
  }
  
}

