package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentRetentionPolicy extends js.Object {
  var daysToKeep: Double = js.native
  var releasesToKeep: Double = js.native
  var retainBuild: Boolean = js.native
}

object EnvironmentRetentionPolicy {
  @scala.inline
  def apply(daysToKeep: Double, releasesToKeep: Double, retainBuild: Boolean): EnvironmentRetentionPolicy = {
    val __obj = js.Dynamic.literal(daysToKeep = daysToKeep.asInstanceOf[js.Any], releasesToKeep = releasesToKeep.asInstanceOf[js.Any], retainBuild = retainBuild.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentRetentionPolicy]
  }
  @scala.inline
  implicit class EnvironmentRetentionPolicyOps[Self <: EnvironmentRetentionPolicy] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setReleasesToKeep(value: Double): Self = this.set("releasesToKeep", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetainBuild(value: Boolean): Self = this.set("retainBuild", value.asInstanceOf[js.Any])
  }
  
}

