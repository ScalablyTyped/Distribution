package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebVRManager extends js.Object {
  var enabled: scala.Boolean = js.native
  def dispose(): scala.Unit = js.native
  def getCamera(camera: PerspectiveCamera): PerspectiveCamera | ArrayCamera = js.native
  def getDevice(): stdLib.VRDisplay | scala.Null = js.native
  def setDevice(): scala.Unit = js.native
  def setDevice(device: stdLib.VRDisplay): scala.Unit = js.native
  def setPoseTarget(): scala.Unit = js.native
  def setPoseTarget(`object`: Object3D): scala.Unit = js.native
  def submitFrame(): scala.Unit = js.native
}

