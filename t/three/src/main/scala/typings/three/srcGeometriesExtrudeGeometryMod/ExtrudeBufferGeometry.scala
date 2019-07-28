package typings.three.srcGeometriesExtrudeGeometryMod

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcExtrasCoreShapeMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/ExtrudeGeometry", "ExtrudeBufferGeometry")
@js.native
class ExtrudeBufferGeometry protected () extends BufferGeometry {
  def this(shapes: js.Array[Shape]) = this()
  def this(shapes: Shape) = this()
  def this(shapes: js.Array[Shape], options: ExtrudeGeometryOptions) = this()
  def this(shapes: Shape, options: ExtrudeGeometryOptions) = this()
  def addShape(shape: Shape): Unit = js.native
  def addShape(shape: Shape, options: js.Any): Unit = js.native
  def addShapeList(shapes: js.Array[Shape]): Unit = js.native
  def addShapeList(shapes: js.Array[Shape], options: js.Any): Unit = js.native
}

/* static members */
@JSImport("three/src/geometries/ExtrudeGeometry", "ExtrudeBufferGeometry")
@js.native
object ExtrudeBufferGeometry extends js.Object {
  var WorldUVGenerator: UVGenerator = js.native
}

