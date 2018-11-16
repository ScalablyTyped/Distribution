package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "ShapeGeometry")
@js.native
class ShapeGeometry protected () extends Geometry {
  def this(shapes: js.Array[Shape]) = this()
  def this(shapes: Shape) = this()
  def this(shapes: js.Array[Shape], curveSegments: scala.Double) = this()
  def this(shapes: Shape, curveSegments: scala.Double) = this()
  def addShape(shape: Shape): scala.Unit = js.native
  def addShape(shape: Shape, options: js.Any): scala.Unit = js.native
  def addShapeList(shapes: js.Array[Shape], options: js.Any): ShapeGeometry = js.native
}

