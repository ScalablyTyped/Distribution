package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OsData extends js.Object {
  var arch: java.lang.String
  var codename: java.lang.String
  var distro: java.lang.String
  var hostname: java.lang.String
  var kernel: java.lang.String
  var logofile: java.lang.String
  var platform: java.lang.String
  var release: java.lang.String
}

object OsData {
  @scala.inline
  def apply(
    arch: java.lang.String,
    codename: java.lang.String,
    distro: java.lang.String,
    hostname: java.lang.String,
    kernel: java.lang.String,
    logofile: java.lang.String,
    platform: java.lang.String,
    release: java.lang.String
  ): OsData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arch")(arch)
    __obj.updateDynamic("codename")(codename)
    __obj.updateDynamic("distro")(distro)
    __obj.updateDynamic("hostname")(hostname)
    __obj.updateDynamic("kernel")(kernel)
    __obj.updateDynamic("logofile")(logofile)
    __obj.updateDynamic("platform")(platform)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[OsData]
  }
}

