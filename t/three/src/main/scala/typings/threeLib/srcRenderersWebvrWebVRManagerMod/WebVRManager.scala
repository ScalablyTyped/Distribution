package typings
package threeLib.srcRenderersWebvrWebVRManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebVRManager extends js.Object {
  var enabled: scala.Boolean = js.native
  def dispose(): scala.Unit = js.native
  def getCamera(camera: threeLib.srcCamerasPerspectiveCameraMod.PerspectiveCamera): threeLib.srcCamerasPerspectiveCameraMod.PerspectiveCamera | threeLib.srcCamerasArrayCameraMod.ArrayCamera = js.native
  def getDevice(): stdLib.VRDisplay | scala.Null = js.native
  def setDevice(): scala.Unit = js.native
  def setDevice(device: stdLib.VRDisplay): scala.Unit = js.native
  def setPoseTarget(): scala.Unit = js.native
  def setPoseTarget(`object`: threeLib.srcCoreObject3DMod.Object3D): scala.Unit = js.native
  def submitFrame(): scala.Unit = js.native
}

