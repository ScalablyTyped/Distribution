package typings.three

import typings.three.anon.Indices
import typings.three.bufferGeometryMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polyhedronBufferGeometryMod {
  
  @JSImport("three/src/geometries/PolyhedronBufferGeometry", "PolyhedronBufferGeometry")
  @js.native
  class PolyhedronBufferGeometry protected () extends BufferGeometry {
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
    
    var parameters: Indices = js.native
  }
}
