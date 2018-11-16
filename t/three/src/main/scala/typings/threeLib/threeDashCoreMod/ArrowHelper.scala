package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "ArrowHelper")
@js.native
class ArrowHelper protected () extends Object3D {
  def this(dir: Vector3) = this()
  def this(dir: Vector3, origin: Vector3) = this()
  def this(dir: Vector3, origin: Vector3, length: scala.Double) = this()
  def this(dir: Vector3, origin: Vector3, length: scala.Double, hex: scala.Double) = this()
  def this(dir: Vector3, origin: Vector3, length: scala.Double, hex: scala.Double, headLength: scala.Double) = this()
  def this(dir: Vector3, origin: Vector3, length: scala.Double, hex: scala.Double, headLength: scala.Double, headWidth: scala.Double) = this()
  var cone: Mesh = js.native
  var line: Line = js.native
  def setColor(color: Color): scala.Unit = js.native
  def setDirection(dir: Vector3): scala.Unit = js.native
  def setLength(length: scala.Double): scala.Unit = js.native
  def setLength(length: scala.Double, headLength: scala.Double): scala.Unit = js.native
  def setLength(length: scala.Double, headLength: scala.Double, headWidth: scala.Double): scala.Unit = js.native
}

