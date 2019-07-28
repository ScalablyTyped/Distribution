package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageVersion extends js.Object {
  var major: Double
  var minor: Double
  var patch: Double
}

object PackageVersion {
  @scala.inline
  def apply(major: Double, minor: Double, patch: Double): PackageVersion = {
    val __obj = js.Dynamic.literal(major = major, minor = minor, patch = patch)
  
    __obj.asInstanceOf[PackageVersion]
  }
}

