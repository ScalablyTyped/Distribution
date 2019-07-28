package typings.winrt.WindowsNs.UINs.InputNs

import typings.winrt.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManipulationVelocities extends js.Object {
  var angular: Double
  var expansion: Double
  var linear: Point
}

object ManipulationVelocities {
  @scala.inline
  def apply(angular: Double, expansion: Double, linear: Point): ManipulationVelocities = {
    val __obj = js.Dynamic.literal(angular = angular, expansion = expansion, linear = linear)
  
    __obj.asInstanceOf[ManipulationVelocities]
  }
}

