package typings
package threeLib.threeDashTrackballcontrolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-trackballcontrols", "TrackballControls")
@js.native
class TrackballControls protected ()
  extends threeLib.threeDashCoreMod.EventDispatcher {
  def this(`object`: threeLib.threeDashCoreMod.Camera) = this()
  def this(`object`: threeLib.threeDashCoreMod.Camera, domElement: stdLib.HTMLElement) = this()
  var domElement: stdLib.HTMLElement = js.native
  var dynamicDampingFactor: scala.Double = js.native
  // API
  var enabled: scala.Boolean = js.native
  var keys: js.Array[scala.Double] = js.native
  var maxDistance: scala.Double = js.native
  var minDistance: scala.Double = js.native
  var noPan: scala.Boolean = js.native
  var noRoll: scala.Boolean = js.native
  var noRotate: scala.Boolean = js.native
  var noZoom: scala.Boolean = js.native
  var `object`: threeLib.threeDashCoreMod.Camera = js.native
  var panSpeed: scala.Double = js.native
  var position0: threeLib.threeDashCoreMod.Vector3 = js.native
  var rotateSpeed: scala.Double = js.native
  var screen: threeLib.Anon_HeightLeft = js.native
  var staticMoving: scala.Boolean = js.native
  var target: threeLib.threeDashCoreMod.Vector3 = js.native
  var target0: threeLib.threeDashCoreMod.Vector3 = js.native
  var up0: threeLib.threeDashCoreMod.Vector3 = js.native
  var zoomSpeed: scala.Double = js.native
  def checkDistances(): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  def handleEvent(event: js.Any): scala.Unit = js.native
  def handleResize(): scala.Unit = js.native
  def panCamera(): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def rotateCamera(): scala.Unit = js.native
  def update(): scala.Unit = js.native
  def zoomCamera(): scala.Unit = js.native
}

