package typings
package threeLib.threeDashOrbitcontrolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-orbitcontrols", "OrbitControls")
@js.native
class OrbitControls protected () extends js.Object {
  def this(`object`: threeLib.threeDashCoreMod.Camera) = this()
  def this(`object`: threeLib.threeDashCoreMod.Camera, domElement: stdLib.HTMLElement) = this()
  var autoRotate: scala.Boolean = js.native
  var autoRotateSpeed: scala.Double = js.native
  // deprecated
  var center: threeLib.threeDashCoreMod.Vector3 = js.native
  var dampingFactor: scala.Double = js.native
  var domElement: stdLib.HTMLElement | stdLib.HTMLDocument = js.native
  var enableDamping: scala.Boolean = js.native
  var enableKeys: scala.Boolean = js.native
  var enablePan: scala.Boolean = js.native
  var enableRotate: scala.Boolean = js.native
  var enableZoom: scala.Boolean = js.native
  // API
  var enabled: scala.Boolean = js.native
  var keyPanSpeed: scala.Double = js.native
  var keys: threeLib.Anon_RIGHTUP = js.native
  var maxAzimuthAngle: scala.Double = js.native
  var maxDistance: scala.Double = js.native
  var maxPolarAngle: scala.Double = js.native
  var minAzimuthAngle: scala.Double = js.native
  var minDistance: scala.Double = js.native
  var minPolarAngle: scala.Double = js.native
  var mouseButtons: threeLib.Anon_ZOOM = js.native
  var `object`: threeLib.threeDashCoreMod.Camera = js.native
  var rotateSpeed: scala.Double = js.native
  var screenSpacePanning: scala.Boolean = js.native
  var target: threeLib.threeDashCoreMod.Vector3 = js.native
  var zoomSpeed: scala.Double = js.native
  // EventDispatcher mixins
  def addEventListener(`type`: java.lang.String, listener: js.Function1[/* event */ js.Any, scala.Unit]): scala.Unit = js.native
  def dispatchEvent(event: threeLib.Anon_Type): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  def dollyIn(dollyScale: scala.Double): scala.Unit = js.native
  def dollyOut(dollyScale: scala.Double): scala.Unit = js.native
  def getAzimuthalAngle(): scala.Double = js.native
  def getPolarAngle(): scala.Double = js.native
  def hasEventListener(`type`: java.lang.String, listener: js.Function1[/* event */ js.Any, scala.Unit]): scala.Boolean = js.native
  def pan(deltaX: scala.Double, deltaY: scala.Double): scala.Unit = js.native
  def panLeft(): scala.Unit = js.native
  def panLeft(distance: scala.Double): scala.Unit = js.native
  def panUp(): scala.Unit = js.native
  def panUp(distance: scala.Double): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function1[/* event */ js.Any, scala.Unit]): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def rotateLeft(): scala.Unit = js.native
  def rotateLeft(angle: scala.Double): scala.Unit = js.native
  def rotateUp(): scala.Unit = js.native
  def rotateUp(angle: scala.Double): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

