package typings.three.geometriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/geometries/Geometries", "PolyhedronGeometry")
@js.native
class PolyhedronGeometry protected ()
  extends typings.three.polyhedronGeometryMod.PolyhedronGeometry {
  /**
  	 * @param vertices
  	 * @param indices
  	 * @param [radius=1]
  	 * @param [detail=0]
  	 */
  def this(vertices: js.Array[Double], indices: js.Array[Double]) = this()
  def this(vertices: js.Array[Double], indices: js.Array[Double], radius: Double) = this()
  def this(
    vertices: js.Array[Double],
    indices: js.Array[Double],
    radius: js.UndefOr[scala.Nothing],
    detail: Double
  ) = this()
  def this(vertices: js.Array[Double], indices: js.Array[Double], radius: Double, detail: Double) = this()
}
