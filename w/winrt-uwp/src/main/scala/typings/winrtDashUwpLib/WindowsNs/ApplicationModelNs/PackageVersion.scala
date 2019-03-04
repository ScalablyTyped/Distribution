package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the package version info. */
trait PackageVersion extends js.Object {
  /** The build version number of the package. */
  var build: scala.Double
  /** The major version number of the package. */
  var major: scala.Double
  /** The minor version number of the package. */
  var minor: scala.Double
  /** The revision version number of the package. */
  var revision: scala.Double
}

object PackageVersion {
  @scala.inline
  def apply(build: scala.Double, major: scala.Double, minor: scala.Double, revision: scala.Double): PackageVersion = {
    val __obj = js.Dynamic.literal(build = build, major = major, minor = minor, revision = revision)
  
    __obj.asInstanceOf[PackageVersion]
  }
}

