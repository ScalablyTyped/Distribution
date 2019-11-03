package typings.systeminformation.systeminformationMod.Systeminformation

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
    servicepack: String
  ): OsData = {
    val __obj = js.Dynamic.literal(arch = arch, build = build, codename = codename, codepage = codepage, distro = distro, hostname = hostname, kernel = kernel, logofile = logofile, platform = platform, release = release, serial = serial, servicepack = servicepack)
  
    __obj.asInstanceOf[OsData]
  }
}

