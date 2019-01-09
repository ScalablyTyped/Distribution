package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "LatheBufferGeometry")
@js.native
class LatheBufferGeometry protected () extends BufferGeometry {
  def this(points: js.Array[Vector2]) = this()
  def this(points: js.Array[Vector2], segments: scala.Double) = this()
  def this(points: js.Array[Vector2], segments: scala.Double, phiStart: scala.Double) = this()
  def this(points: js.Array[Vector2], segments: scala.Double, phiStart: scala.Double, phiLength: scala.Double) = this()
  var parameters: threeLib.Anon_PhiLength = js.native
}

