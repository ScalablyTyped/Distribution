package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageVersion extends js.Object {
  var major: scala.Double
  var minor: scala.Double
  var patch: scala.Double
}

object PackageVersion {
  @scala.inline
  def apply(major: scala.Double, minor: scala.Double, patch: scala.Double): PackageVersion = {
    val __obj = js.Dynamic.literal(major = major, minor = minor, patch = patch)
  
    __obj.asInstanceOf[PackageVersion]
  }
}

