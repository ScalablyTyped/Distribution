package typings
package threeLib.srcGeometriesGeometriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/Geometries", "ExtrudeBufferGeometry")
@js.native
class ExtrudeBufferGeometry protected ()
  extends threeLib.srcGeometriesExtrudeGeometryMod.ExtrudeBufferGeometry {
  def this(shapes: js.Array[threeLib.srcExtrasCoreShapeMod.Shape]) = this()
  def this(shapes: threeLib.srcExtrasCoreShapeMod.Shape) = this()
  def this(shapes: js.Array[threeLib.srcExtrasCoreShapeMod.Shape], options: threeLib.srcGeometriesExtrudeGeometryMod.ExtrudeGeometryOptions) = this()
  def this(shapes: threeLib.srcExtrasCoreShapeMod.Shape, options: threeLib.srcGeometriesExtrudeGeometryMod.ExtrudeGeometryOptions) = this()
}

/* static members */
@JSImport("three/src/geometries/Geometries", "ExtrudeBufferGeometry")
@js.native
object ExtrudeBufferGeometry extends js.Object {
  var WorldUVGenerator: threeLib.srcGeometriesExtrudeGeometryMod.UVGenerator = js.native
}

