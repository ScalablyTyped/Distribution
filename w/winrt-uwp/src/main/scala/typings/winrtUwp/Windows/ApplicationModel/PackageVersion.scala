package typings.winrtUwp.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the package version info. */
trait PackageVersion extends js.Object {
  /** The build version number of the package. */
  var build: Double
  /** The major version number of the package. */
  var major: Double
  /** The minor version number of the package. */
  var minor: Double
  /** The revision version number of the package. */
  var revision: Double
}

object PackageVersion {
  @scala.inline
  def apply(build: Double, major: Double, minor: Double, revision: Double): PackageVersion = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PackageVersion]
  }
}

