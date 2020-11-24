package typings.three

import typings.three.anon.InnerRadius
import typings.three.geometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/geometries/RingGeometry", JSImport.Namespace)
@js.native
object ringGeometryMod extends js.Object {
  
  @js.native
  class RingGeometry protected () extends Geometry {
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
