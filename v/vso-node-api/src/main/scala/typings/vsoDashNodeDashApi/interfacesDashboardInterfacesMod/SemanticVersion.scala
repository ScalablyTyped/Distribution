package typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemanticVersion extends js.Object {
  /**
    * Major version when you make incompatible API changes
    */
  var major: Double
  /**
    * Minor version when you add functionality in a backwards-compatible manner
    */
  var minor: Double
  /**
    * Patch version when you make backwards-compatible bug fixes
    */
  var patch: Double
}

object SemanticVersion {
  @scala.inline
  def apply(major: Double, minor: Double, patch: Double): SemanticVersion = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SemanticVersion]
  }
}

