package typings.three.geometriesMod

import typings.three.vector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/geometries/Geometries", "LatheBufferGeometry")
@js.native
class LatheBufferGeometry protected ()
  extends typings.three.latheBufferGeometryMod.LatheBufferGeometry {
  /**
  	 * @param points
  	 * @param [segments=12]
  	 * @param [phiStart=0]
  	 * @param [phiLength=Math.PI * 2]
  	 */
  def this(points: js.Array[Vector2]) = this()
  def this(points: js.Array[Vector2], segments: Double) = this()
  def this(points: js.Array[Vector2], segments: Double, phiStart: Double) = this()
  def this(points: js.Array[Vector2], segments: Unit, phiStart: Double) = this()
  def this(points: js.Array[Vector2], segments: Double, phiStart: Double, phiLength: Double) = this()
  def this(points: js.Array[Vector2], segments: Double, phiStart: Unit, phiLength: Double) = this()
  def this(points: js.Array[Vector2], segments: Unit, phiStart: Double, phiLength: Double) = this()
  def this(points: js.Array[Vector2], segments: Unit, phiStart: Unit, phiLength: Double) = this()
}
