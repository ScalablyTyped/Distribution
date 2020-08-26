package typings.three.geometriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/Geometries", "PolyhedronGeometry")
@js.native
class PolyhedronGeometry protected ()
  extends typings.three.polyhedronGeometryMod.PolyhedronGeometry {
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

