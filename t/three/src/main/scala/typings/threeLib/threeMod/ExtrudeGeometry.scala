package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "ExtrudeGeometry")
@js.native
class ExtrudeGeometry protected ()
  extends threeLib.srcGeometriesGeometriesMod.ExtrudeGeometry {
  def this(shapes: js.Array[threeLib.srcExtrasCoreShapeMod.Shape]) = this()
  def this(shapes: threeLib.srcExtrasCoreShapeMod.Shape) = this()
  def this(shapes: js.Array[threeLib.srcExtrasCoreShapeMod.Shape], options: threeLib.srcGeometriesExtrudeGeometryMod.ExtrudeGeometryOptions) = this()
  def this(shapes: threeLib.srcExtrasCoreShapeMod.Shape, options: threeLib.srcGeometriesExtrudeGeometryMod.ExtrudeGeometryOptions) = this()
}

/* static members */
@JSImport("three", "ExtrudeGeometry")
@js.native
object ExtrudeGeometry extends js.Object {
  var WorldUVGenerator: threeLib.srcGeometriesExtrudeGeometryMod.UVGenerator = js.native
}

