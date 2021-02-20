package typings.three

import typings.three.anon.InnerRadius
import typings.three.bufferGeometryMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ringBufferGeometryMod {
  
  @JSImport("three/src/geometries/RingBufferGeometry", "RingBufferGeometry")
  @js.native
  class RingBufferGeometry protected () extends BufferGeometry {
    /**
    	 * @param [innerRadius=0.5]
    	 * @param [outerRadius=1]
    	 * @param [thetaSegments=8]
    	 * @param [phiSegments=1]
    	 * @param [thetaStart=0]
    	 * @param [thetaLength=Math.PI * 2]
    	 */
    def this(
      innerRadius: js.UndefOr[Double],
      outerRadius: js.UndefOr[Double],
      thetaSegments: js.UndefOr[Double],
      phiSegments: js.UndefOr[Double],
      thetaStart: js.UndefOr[Double],
      thetaLength: js.UndefOr[Double]
    ) = this()
    
    var parameters: InnerRadius = js.native
  }
}
