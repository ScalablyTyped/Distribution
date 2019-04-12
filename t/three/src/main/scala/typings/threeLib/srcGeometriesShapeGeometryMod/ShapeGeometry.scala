package typings
package threeLib.srcGeometriesShapeGeometryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/ShapeGeometry", "ShapeGeometry")
@js.native
class ShapeGeometry protected ()
  extends threeLib.srcCoreGeometryMod.Geometry {
  def this(shapes: js.Array[threeLib.srcExtrasCoreShapeMod.Shape]) = this()
  def this(shapes: threeLib.srcExtrasCoreShapeMod.Shape) = this()
  def this(shapes: js.Array[threeLib.srcExtrasCoreShapeMod.Shape], curveSegments: scala.Double) = this()
  def this(shapes: threeLib.srcExtrasCoreShapeMod.Shape, curveSegments: scala.Double) = this()
  def addShape(shape: threeLib.srcExtrasCoreShapeMod.Shape): scala.Unit = js.native
  def addShape(shape: threeLib.srcExtrasCoreShapeMod.Shape, options: js.Any): scala.Unit = js.native
  def addShapeList(shapes: js.Array[threeLib.srcExtrasCoreShapeMod.Shape], options: js.Any): ShapeGeometry = js.native
}

