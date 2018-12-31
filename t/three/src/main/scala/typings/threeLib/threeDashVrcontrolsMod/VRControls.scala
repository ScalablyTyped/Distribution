package typings
package threeLib.threeDashVrcontrolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-vrcontrols", "VRControls")
@js.native
class VRControls protected () extends js.Object {
  def this(camera: threeLib.threeDashCoreMod.Camera) = this()
  def this(camera: threeLib.threeDashCoreMod.Camera, callback: js.Function1[/* param */ java.lang.String, scala.Unit]) = this()
  var scale: scala.Double = js.native
  def setVRDisplay(display: stdLib.VRDisplay): scala.Unit = js.native
  /**
    * Update VR Instance Tracking
    */
  def update(): scala.Unit = js.native
  def zeroSensor(): scala.Unit = js.native
}

