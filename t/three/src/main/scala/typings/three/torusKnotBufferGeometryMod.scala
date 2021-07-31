package typings.three

import typings.three.anon.P
import typings.three.bufferGeometryMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object torusKnotBufferGeometryMod {
  
  @JSImport("three/src/geometries/TorusKnotBufferGeometry", "TorusKnotBufferGeometry")
  @js.native
  class TorusKnotBufferGeometry protected () extends BufferGeometry {
    /**
    	 * @param [radius=1]
    	 * @param [tube=0.4]
    	 * @param [radialSegments=64]
    	 * @param [tubularSegments=8]
    	 * @param [p=2]
    	 * @param [q=3]
    	 */
    def this(
      radius: js.UndefOr[Double],
      tube: js.UndefOr[Double],
      tubularSegments: js.UndefOr[Double],
      radialSegments: js.UndefOr[Double],
      p: js.UndefOr[Double],
      q: js.UndefOr[Double]
    ) = this()
    
    var parameters: P = js.native
  }
}
