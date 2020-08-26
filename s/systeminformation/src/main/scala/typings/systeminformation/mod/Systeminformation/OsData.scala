package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 4. Operating System
@js.native
trait OsData extends js.Object {
  var arch: String = js.native
  var build: String = js.native
  var codename: String = js.native
  var codepage: String = js.native
  var distro: String = js.native
  var hostname: String = js.native
  var kernel: String = js.native
  var logofile: String = js.native
  var platform: String = js.native
  var release: String = js.native
  var serial: String = js.native
  var servicepack: String = js.native
  var uefi: Boolean = js.native
}

object OsData {
  @scala.inline
  def apply(
    arch: String,
    build: String,
    codename: String,
    codepage: String,
    distro: String,
    hostname: String,
    kernel: String,
    logofile: String,
    platform: String,
    release: String,
    serial: String,
    servicepack: String,
    uefi: Boolean
  ): OsData = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], codename = codename.asInstanceOf[js.Any], codepage = codepage.asInstanceOf[js.Any], distro = distro.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], logofile = logofile.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], servicepack = servicepack.asInstanceOf[js.Any], uefi = uefi.asInstanceOf[js.Any])
    __obj.asInstanceOf[OsData]
  }
  @scala.inline
  implicit class OsDataOps[Self <: OsData] (val x: Self) extends AnyVal {
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
    def setArch(value: String): Self = this.set("arch", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuild(value: String): Self = this.set("build", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodename(value: String): Self = this.set("codename", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodepage(value: String): Self = this.set("codepage", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistro(value: String): Self = this.set("distro", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def setKernel(value: String): Self = this.set("kernel", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogofile(value: String): Self = this.set("logofile", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelease(value: String): Self = this.set("release", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerial(value: String): Self = this.set("serial", value.asInstanceOf[js.Any])
    @scala.inline
    def setServicepack(value: String): Self = this.set("servicepack", value.asInstanceOf[js.Any])
    @scala.inline
    def setUefi(value: Boolean): Self = this.set("uefi", value.asInstanceOf[js.Any])
  }
  
}

