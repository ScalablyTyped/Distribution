package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackageVersion extends js.Object {
  var major: Double = js.native
  var minor: Double = js.native
  var patch: Double = js.native
}

object PackageVersion {
  @scala.inline
  def apply(major: Double, minor: Double, patch: Double): PackageVersion = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageVersion]
  }
  @scala.inline
  implicit class PackageVersionOps[Self <: PackageVersion] (val x: Self) extends AnyVal {
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
    def setMajor(value: Double): Self = this.set("major", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinor(value: Double): Self = this.set("minor", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatch(value: Double): Self = this.set("patch", value.asInstanceOf[js.Any])
  }
  
}

