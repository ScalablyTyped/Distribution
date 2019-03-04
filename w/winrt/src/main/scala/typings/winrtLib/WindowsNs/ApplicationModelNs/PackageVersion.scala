package typings
package winrtLib.WindowsNs.ApplicationModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageVersion extends js.Object {
  var build: scala.Double
  var major: scala.Double
  var minor: scala.Double
  var revision: scala.Double
}

object PackageVersion {
  @scala.inline
  def apply(build: scala.Double, major: scala.Double, minor: scala.Double, revision: scala.Double): PackageVersion = {
    val __obj = js.Dynamic.literal(build = build, major = major, minor = minor, revision = revision)
  
    __obj.asInstanceOf[PackageVersion]
  }
}

