package typings
package threeLib.threeDashEditorcontrolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-editorcontrols", "EditorControls")
@js.native
class EditorControls protected ()
  extends threeLib.threeDashCoreMod.EventDispatcher {
  def this(`object`: threeLib.threeDashCoreMod.Camera) = this()
  def this(`object`: threeLib.threeDashCoreMod.Camera, domElement: stdLib.HTMLElement) = this()
  var center: threeLib.threeDashCoreMod.Vector3 = js.native
  var enabled: scala.Boolean = js.native
  def dispose(): scala.Unit = js.native
  def focus(target: threeLib.threeDashCoreMod.Object3D, frame: scala.Boolean): scala.Unit = js.native
  def pan(delta: threeLib.threeDashCoreMod.Vector3): scala.Unit = js.native
  def rotate(delta: threeLib.threeDashCoreMod.Vector3): scala.Unit = js.native
  def zoom(delta: threeLib.threeDashCoreMod.Vector3): scala.Unit = js.native
}

