package typings
package threeLib.threeDashOrthographictrackballcontrolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-orthographictrackballcontrols", "OrthographicTrackballControls")
@js.native
class OrthographicTrackballControls protected ()
  extends threeLib.threeDashCoreMod.EventDispatcher {
  def this(`object`: threeLib.threeDashCoreMod.Camera) = this()
  def this(`object`: threeLib.threeDashCoreMod.Camera, domElement: stdLib.HTMLElement) = this()
  var bottom0: scala.Double = js.native
  var domElement: stdLib.HTMLElement = js.native
  var dynamicDampingFactor: scala.Double = js.native
  // API
  var enabled: scala.Boolean = js.native
  var keys: js.Array[scala.Double] = js.native
  var left0: scala.Double = js.native
  var noPan: scala.Boolean = js.native
  var noRoll: scala.Boolean = js.native
  var noRotate: scala.Boolean = js.native
  var noZoom: scala.Boolean = js.native
  var `object`: threeLib.threeDashCoreMod.Camera = js.native
  var panSpeed: scala.Double = js.native
  var position0: threeLib.threeDashCoreMod.Vector3 = js.native
  var radius: scala.Double = js.native
  var right0: scala.Double = js.native
  var rotateSpeed: scala.Double = js.native
  var screen: threeLib.Anon_Top = js.native
  var staticMoving: scala.Boolean = js.native
  var target: threeLib.threeDashCoreMod.Vector3 = js.native
  var target0: threeLib.threeDashCoreMod.Vector3 = js.native
  var top0: scala.Double = js.native
  var up0: threeLib.threeDashCoreMod.Vector3 = js.native
  var zoomSpeed: scala.Double = js.native
  def checkDistances(): scala.Unit = js.native
  def handleEvent(event: js.Any): scala.Unit = js.native
  def handleResize(): scala.Unit = js.native
  def panCamera(): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def rotateCamera(): scala.Unit = js.native
  def update(): scala.Unit = js.native
  def zoomCamera(): scala.Unit = js.native
}

