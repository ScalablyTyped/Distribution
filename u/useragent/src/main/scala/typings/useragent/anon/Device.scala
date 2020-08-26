package typings.useragent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  var device: String = js.native
  var family: String = js.native
  var major: String = js.native
  var minor: String = js.native
  var os: String = js.native
  var patch: String = js.native
}

object Device {
  @scala.inline
  def apply(device: String, family: String, major: String, minor: String, os: String, patch: String): Device = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
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
    def setDevice(value: String): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def setMajor(value: String): Self = this.set("major", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinor(value: String): Self = this.set("minor", value.asInstanceOf[js.Any])
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatch(value: String): Self = this.set("patch", value.asInstanceOf[js.Any])
  }
  
}

