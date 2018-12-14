package typings
package threeLib.threeDashMapcontrolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-mapcontrols", "MapControls")
@js.native
class MapControls protected ()
  extends threeLib.threeDashCoreMod.EventDispatcher {
  def this(`object`: threeLib.threeDashCoreMod.Camera) = this()
  def this(`object`: threeLib.threeDashCoreMod.Camera, domElement: stdLib.HTMLElement) = this()
  var autoRotate: scala.Boolean = js.native
  var autoRotateSpeed: scala.Double = js.native
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
  var maxZoom: scala.Double = js.native
  var minAzimuthAngle: scala.Double = js.native
  var minDistance: scala.Double = js.native
  var minPolarAngle: scala.Double = js.native
  var minZoom: scala.Double = js.native
  var mouseButtons: threeLib.Anon_RIGHT = js.native
  var `object`: threeLib.threeDashCoreMod.Camera = js.native
  var panSpeed: scala.Double = js.native
  var position0: threeLib.threeDashCoreMod.Vector3 = js.native
  var rotateSpeed: scala.Double = js.native
  var screenSpacePanning: scala.Boolean = js.native
  var target: threeLib.threeDashCoreMod.Vector3 = js.native
  var target0: threeLib.threeDashCoreMod.Vector3 = js.native
  var zoom0: scala.Double = js.native
  var zoomSpeed: scala.Double = js.native
  def dispose(): scala.Unit = js.native
  def dollyIn(dollyScale: scala.Double): scala.Unit = js.native
  def dollyOut(dollyScale: scala.Double): scala.Unit = js.native
  def getAzimuthalAngle(): scala.Double = js.native
  def getPolarAngle(): scala.Double = js.native
  def pan(deltaX: scala.Double, deltaY: scala.Double): scala.Unit = js.native
  def panLeft(): scala.Unit = js.native
  def panLeft(distance: scala.Double): scala.Unit = js.native
  def panUp(): scala.Unit = js.native
  def panUp(distance: scala.Double): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def rotateLeft(): scala.Unit = js.native
  def rotateLeft(angle: scala.Double): scala.Unit = js.native
  def rotateUp(): scala.Unit = js.native
  def rotateUp(angle: scala.Double): scala.Unit = js.native
  def saveState(): scala.Unit = js.native
  def update(): scala.Boolean = js.native
}

