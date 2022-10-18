package typings.three

import typings.three.anon.PhiStart
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesSphereGeometryMod {
  
  @JSImport("three/src/geometries/SphereGeometry", "SphereGeometry")
  @js.native
  open class SphereGeometry protected () extends BufferGeometry {
    /**
      * @param [radius=50] — sphere radius. Default is 50.
      * @param [widthSegments=8] — number of horizontal segments. Minimum value is 3, and the default is 8.
      * @param [heightSegments=6] — number of vertical segments. Minimum value is 2, and the default is 6.
      * @param [phiStart=0] — specify horizontal starting angle. Default is 0.
      * @param [phiLength=Math.PI * 2] — specify horizontal sweep angle size. Default is Math.PI * 2.
      * @param [thetaStart=0] — specify vertical starting angle. Default is 0.
      * @param [thetaLength=Math.PI * 2] — specify vertical sweep angle size. Default is Math.PI.
      */
    def this(
      radius: js.UndefOr[Double],
      widthSegments: js.UndefOr[Double],
      heightSegments: js.UndefOr[Double],
      phiStart: js.UndefOr[Double],
      phiLength: js.UndefOr[Double],
      thetaStart: js.UndefOr[Double],
      thetaLength: js.UndefOr[Double]
    ) = this()
    
    var parameters: PhiStart = js.native
  }
  /* static members */
  object SphereGeometry {
    
    @JSImport("three/src/geometries/SphereGeometry", "SphereGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: Any): SphereGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[SphereGeometry]
  }
}
