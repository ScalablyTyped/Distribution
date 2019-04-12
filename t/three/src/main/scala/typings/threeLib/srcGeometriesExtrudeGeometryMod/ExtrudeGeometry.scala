package typings
package threeLib.srcGeometriesExtrudeGeometryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/ExtrudeGeometry", "ExtrudeGeometry")
@js.native
class ExtrudeGeometry protected ()
  extends threeLib.srcCoreGeometryMod.Geometry {
  def this(shapes: js.Array[threeLib.srcExtrasCoreShapeMod.Shape]) = this()
  def this(shapes: threeLib.srcExtrasCoreShapeMod.Shape) = this()
  def this(shapes: js.Array[threeLib.srcExtrasCoreShapeMod.Shape], options: ExtrudeGeometryOptions) = this()
  def this(shapes: threeLib.srcExtrasCoreShapeMod.Shape, options: ExtrudeGeometryOptions) = this()
  def addShape(shape: threeLib.srcExtrasCoreShapeMod.Shape): scala.Unit = js.native
  def addShape(shape: threeLib.srcExtrasCoreShapeMod.Shape, options: js.Any): scala.Unit = js.native
  def addShapeList(shapes: js.Array[threeLib.srcExtrasCoreShapeMod.Shape]): scala.Unit = js.native
  def addShapeList(shapes: js.Array[threeLib.srcExtrasCoreShapeMod.Shape], options: js.Any): scala.Unit = js.native
}

/* static members */
@JSImport("three/src/geometries/ExtrudeGeometry", "ExtrudeGeometry")
@js.native
object ExtrudeGeometry extends js.Object {
  var WorldUVGenerator: threeLib.srcGeometriesExtrudeGeometryMod.UVGenerator = js.native
}

