package typings.three.threeMod

import typings.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometryOptions
import typings.three.srcGeometriesExtrudeGeometryMod.UVGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "ExtrudeGeometry")
@js.native
class ExtrudeGeometry protected ()
  extends typings.three.srcGeometriesGeometriesMod.ExtrudeGeometry {
  def this(shapes: js.Array[typings.three.srcExtrasCoreShapeMod.Shape]) = this()
  def this(shapes: typings.three.srcExtrasCoreShapeMod.Shape) = this()
  def this(shapes: js.Array[typings.three.srcExtrasCoreShapeMod.Shape], options: ExtrudeGeometryOptions) = this()
  def this(shapes: typings.three.srcExtrasCoreShapeMod.Shape, options: ExtrudeGeometryOptions) = this()
}

/* static members */
@JSImport("three", "ExtrudeGeometry")
@js.native
object ExtrudeGeometry extends js.Object {
  var WorldUVGenerator: UVGenerator = js.native
}

