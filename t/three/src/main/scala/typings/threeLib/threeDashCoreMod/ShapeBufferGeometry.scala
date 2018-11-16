package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "ShapeBufferGeometry")
@js.native
class ShapeBufferGeometry protected () extends BufferGeometry {
  def this(shapes: js.Array[Shape]) = this()
  def this(shapes: Shape) = this()
  def this(shapes: js.Array[Shape], curveSegments: scala.Double) = this()
  def this(shapes: Shape, curveSegments: scala.Double) = this()
}

