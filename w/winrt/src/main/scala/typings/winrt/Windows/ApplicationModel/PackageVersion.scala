package typings.winrt.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackageVersion extends js.Object {
  var build: Double = js.native
  var major: Double = js.native
  var minor: Double = js.native
  var revision: Double = js.native
}

object PackageVersion {
  @scala.inline
  def apply(build: Double, major: Double, minor: Double, revision: Double): PackageVersion = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
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
    def setBuild(value: Double): Self = this.set("build", value.asInstanceOf[js.Any])
    @scala.inline
    def setMajor(value: Double): Self = this.set("major", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinor(value: Double): Self = this.set("minor", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
  }
  
}

