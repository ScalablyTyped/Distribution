package typings.three.geometriesMod

import typings.three.shapeMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/geometries/Geometries", "ShapeGeometry")
@js.native
class ShapeGeometry protected ()
  extends typings.three.shapeGeometryMod.ShapeGeometry {
  def this(shapes: js.Array[Shape]) = this()
  /**
  	 * @param shapes
  	 * @param [curveSegments=12]
  	 */
  def this(shapes: Shape) = this()
  def this(shapes: js.Array[Shape], curveSegments: Double) = this()
  def this(shapes: Shape, curveSegments: Double) = this()
}
