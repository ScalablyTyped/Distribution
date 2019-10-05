package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OsData extends js.Object {
  var arch: String
  var codename: String
  var distro: String
  var hostname: String
  var kernel: String
  var logofile: String
  var platform: String
  var release: String
}

object OsData {
  @scala.inline
  def apply(
    arch: String,
    codename: String,
    distro: String,
    hostname: String,
    kernel: String,
    logofile: String,
    platform: String,
    release: String
  ): OsData = {
    val __obj = js.Dynamic.literal(arch = arch, codename = codename, distro = distro, hostname = hostname, kernel = kernel, logofile = logofile, platform = platform, release = release)
  
    __obj.asInstanceOf[OsData]
  }
}

