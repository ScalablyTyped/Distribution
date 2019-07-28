package typings.three.srcRenderersWebvrWebVRManagerMod

import typings.std.VRDisplay
import typings.three.srcCamerasArrayCameraMod.ArrayCamera
import typings.three.srcCamerasPerspectiveCameraMod.PerspectiveCamera
import typings.three.srcCoreObject3DMod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebVRManager extends js.Object {
  var enabled: Boolean = js.native
  def dispose(): Unit = js.native
  def getCamera(camera: PerspectiveCamera): PerspectiveCamera | ArrayCamera = js.native
  def getDevice(): VRDisplay | Null = js.native
  def setDevice(): Unit = js.native
  def setDevice(device: VRDisplay): Unit = js.native
  def setPoseTarget(): Unit = js.native
  def setPoseTarget(`object`: Object3D): Unit = js.native
  def submitFrame(): Unit = js.native
}

