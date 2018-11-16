package typings
package threeLib.threeDashTransformcontrolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-transformcontrols", "TransformControls")
@js.native
class TransformControls protected ()
  extends threeLib.threeDashCoreMod.Object3D {
  def this(`object`: threeLib.threeDashCoreMod.Camera) = this()
  def this(`object`: threeLib.threeDashCoreMod.Camera, domElement: stdLib.HTMLElement) = this()
  var `object`: threeLib.threeDashCoreMod.Object3D = js.native
  var size: scala.Double = js.native
  var space: java.lang.String = js.native
  def attach(`object`: threeLib.threeDashCoreMod.Object3D): scala.Unit = js.native
  def detach(): scala.Unit = js.native
  def getMode(): java.lang.String = js.native
  def setMode(mode: java.lang.String): scala.Unit = js.native
  def setRotationSnap(size: scala.Double): scala.Unit = js.native
  def setSize(size: scala.Double): scala.Unit = js.native
  def setSnap(snap: js.Any): scala.Unit = js.native
  def setSpace(space: java.lang.String): scala.Unit = js.native
  def setTranslationSnap(size: scala.Double): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

