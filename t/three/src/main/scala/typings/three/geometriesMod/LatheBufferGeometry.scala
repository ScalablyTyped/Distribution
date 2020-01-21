package typings.three.geometriesMod

import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/Geometries", "LatheBufferGeometry")
@js.native
class LatheBufferGeometry protected ()
  extends typings.three.latheGeometryMod.LatheBufferGeometry {
  def this(points: js.Array[Vector2]) = this()
  def this(points: js.Array[Vector2], segments: Double) = this()
  def this(points: js.Array[Vector2], segments: Double, phiStart: Double) = this()
  def this(points: js.Array[Vector2], segments: Double, phiStart: Double, phiLength: Double) = this()
}

