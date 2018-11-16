package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IManipulationInertiaStartingEventArgs extends js.Object {
  var cumulative: ManipulationDelta
  var delta: ManipulationDelta
  var pointerDeviceType: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType
  var position: winrtLib.WindowsNs.FoundationNs.Point
  var velocities: ManipulationVelocities
}

