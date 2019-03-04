package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManipulationVelocities extends js.Object {
  var angular: scala.Double
  var expansion: scala.Double
  var linear: winrtLib.WindowsNs.FoundationNs.Point
}

object ManipulationVelocities {
  @scala.inline
  def apply(angular: scala.Double, expansion: scala.Double, linear: winrtLib.WindowsNs.FoundationNs.Point): ManipulationVelocities = {
    val __obj = js.Dynamic.literal(angular = angular, expansion = expansion, linear = linear)
  
    __obj.asInstanceOf[ManipulationVelocities]
  }
}

