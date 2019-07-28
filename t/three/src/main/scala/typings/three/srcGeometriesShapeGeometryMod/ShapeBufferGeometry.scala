package typings.three.srcGeometriesShapeGeometryMod

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcExtrasCoreShapeMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/ShapeGeometry", "ShapeBufferGeometry")
@js.native
class ShapeBufferGeometry protected () extends BufferGeometry {
  def this(shapes: js.Array[Shape]) = this()
  def this(shapes: Shape) = this()
  def this(shapes: js.Array[Shape], curveSegments: Double) = this()
  def this(shapes: Shape, curveSegments: Double) = this()
}

