package typings.three

import typings.three.anon.PhiLength
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.vector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object latheBufferGeometryMod {
  
  @JSImport("three/src/geometries/LatheBufferGeometry", "LatheBufferGeometry")
  @js.native
  class LatheBufferGeometry protected () extends BufferGeometry {
    /**
    	 * @param points
    	 * @param [segments=12]
    	 * @param [phiStart=0]
    	 * @param [phiLength=Math.PI * 2]
    	 */
    def this(points: js.Array[Vector2]) = this()
    def this(points: js.Array[Vector2], segments: Double) = this()
    def this(points: js.Array[Vector2], segments: js.UndefOr[scala.Nothing], phiStart: Double) = this()
    def this(points: js.Array[Vector2], segments: Double, phiStart: Double) = this()
    def this(
      points: js.Array[Vector2],
      segments: js.UndefOr[scala.Nothing],
      phiStart: js.UndefOr[scala.Nothing],
      phiLength: Double
    ) = this()
    def this(
      points: js.Array[Vector2],
      segments: js.UndefOr[scala.Nothing],
      phiStart: Double,
      phiLength: Double
    ) = this()
    def this(
      points: js.Array[Vector2],
      segments: Double,
      phiStart: js.UndefOr[scala.Nothing],
      phiLength: Double
    ) = this()
    def this(points: js.Array[Vector2], segments: Double, phiStart: Double, phiLength: Double) = this()
    
    var parameters: PhiLength = js.native
  }
}
