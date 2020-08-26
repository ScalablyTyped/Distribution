package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetentionPolicy extends js.Object {
  var daysToKeep: Double = js.native
}

object RetentionPolicy {
  @scala.inline
  def apply(daysToKeep: Double): RetentionPolicy = {
    val __obj = js.Dynamic.literal(daysToKeep = daysToKeep.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetentionPolicy]
  }
  @scala.inline
  implicit class RetentionPolicyOps[Self <: RetentionPolicy] (val x: Self) extends AnyVal {
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
    def setDaysToKeep(value: Double): Self = this.set("daysToKeep", value.asInstanceOf[js.Any])
  }
  
}

