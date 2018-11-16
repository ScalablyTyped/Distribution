package typings
package threeLib.threeDashFirstPersonControlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-FirstPersonControls", "FirstPersonControls")
@js.native
class FirstPersonControls protected () extends js.Object {
  def this(`object`: threeLib.threeDashCoreMod.Camera) = this()
  def this(`object`: threeLib.threeDashCoreMod.Camera, domElement: stdLib.HTMLElement) = this()
  var activeLook: scala.Boolean = js.native
  var autoForward: scala.Boolean = js.native
  var autoSpeedFactor: scala.Double = js.native
  var constrainVertical: scala.Boolean = js.native
  var domElement: stdLib.HTMLCanvasElement | stdLib.HTMLDocument = js.native
  var enabled: scala.Boolean = js.native
  var freeze: scala.Boolean = js.native
  var heightCoef: scala.Double = js.native
  var heightMax: scala.Double = js.native
  var heightMin: scala.Double = js.native
  var heightSpeed: scala.Boolean = js.native
  var lat: scala.Double = js.native
  var lon: scala.Double = js.native
  var lookSpeed: scala.Double = js.native
  var lookVertical: scala.Boolean = js.native
  var mouseDragOn: scala.Boolean = js.native
  var mouseX: scala.Double = js.native
  var mouseY: scala.Double = js.native
  var moveBackward: scala.Boolean = js.native
  var moveForward: scala.Boolean = js.native
  var moveLeft: scala.Boolean = js.native
  var moveRight: scala.Boolean = js.native
  var movementSpeed: scala.Double = js.native
  var noFly: scala.Boolean = js.native
  var `object`: threeLib.threeDashCoreMod.Object3D = js.native
  var phi: scala.Double = js.native
  var target: threeLib.threeDashCoreMod.Vector3 = js.native
  var theta: scala.Double = js.native
  var verticalMax: scala.Double = js.native
  var verticalMin: scala.Double = js.native
  def dispose(): scala.Unit = js.native
  def update(delta: scala.Double): scala.Unit = js.native
}

