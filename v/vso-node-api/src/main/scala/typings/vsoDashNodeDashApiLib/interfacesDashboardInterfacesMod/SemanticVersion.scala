package typings
package vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemanticVersion extends js.Object {
  /**
    * Major version when you make incompatible API changes
    */
  var major: scala.Double
  /**
    * Minor version when you add functionality in a backwards-compatible manner
    */
  var minor: scala.Double
  /**
    * Patch version when you make backwards-compatible bug fixes
    */
  var patch: scala.Double
}

object SemanticVersion {
  @scala.inline
  def apply(major: scala.Double, minor: scala.Double, patch: scala.Double): SemanticVersion = {
    val __obj = js.Dynamic.literal(major = major, minor = minor, patch = patch)
  
    __obj.asInstanceOf[SemanticVersion]
  }
}

