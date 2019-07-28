package typings.three.srcGeometriesGeometriesMod

import typings.three.srcExtrasCoreShapeMod.Shape
import typings.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometryOptions
import typings.three.srcGeometriesExtrudeGeometryMod.UVGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/Geometries", "ExtrudeGeometry")
@js.native
class ExtrudeGeometry protected ()
  extends typings.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometry {
  def this(shapes: js.Array[Shape]) = this()
  def this(shapes: Shape) = this()
  def this(shapes: js.Array[Shape], options: ExtrudeGeometryOptions) = this()
  def this(shapes: Shape, options: ExtrudeGeometryOptions) = this()
}

/* static members */
@JSImport("three/src/geometries/Geometries", "ExtrudeGeometry")
@js.native
object ExtrudeGeometry extends js.Object {
  var WorldUVGenerator: UVGenerator = js.native
}

