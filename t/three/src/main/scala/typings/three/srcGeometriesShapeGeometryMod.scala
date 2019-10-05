package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreGeometryMod.Geometry
import typings.three.srcExtrasCoreShapeMod.Shape
import typings.three.srcGeometriesShapeGeometryMod.ShapeGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/ShapeGeometry", JSImport.Namespace)
@js.native
object srcGeometriesShapeGeometryMod extends js.Object {
  @js.native
  class ShapeBufferGeometry protected () extends BufferGeometry {
    def this(shapes: js.Array[Shape]) = this()
    def this(shapes: Shape) = this()
    def this(shapes: js.Array[Shape], curveSegments: Double) = this()
    def this(shapes: Shape, curveSegments: Double) = this()
  }
  
  @js.native
  class ShapeGeometry protected () extends Geometry {
    def this(shapes: js.Array[Shape]) = this()
    def this(shapes: Shape) = this()
    def this(shapes: js.Array[Shape], curveSegments: Double) = this()
    def this(shapes: Shape, curveSegments: Double) = this()
    def addShape(shape: Shape): Unit = js.native
    def addShape(shape: Shape, options: js.Any): Unit = js.native
    def addShapeList(shapes: js.Array[Shape], options: js.Any): ShapeGeometry = js.native
  }
  
}

