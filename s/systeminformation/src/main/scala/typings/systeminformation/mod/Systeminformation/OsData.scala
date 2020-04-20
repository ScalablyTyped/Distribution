package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 4. Operating System
trait OsData extends js.Object {
  var arch: String
  var build: String
  var codename: String
  var codepage: String
  var distro: String
  var hostname: String
  var kernel: String
  var logofile: String
  var platform: String
  var release: String
  var serial: String
  var servicepack: String
  var uefi: Boolean
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
}

