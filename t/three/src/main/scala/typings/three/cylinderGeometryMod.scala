package typings.three

import typings.three.anon.HeightSegments
import typings.three.bufferGeometryMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cylinderGeometryMod {
  
  @JSImport("three/src/geometries/CylinderGeometry", "CylinderGeometry")
  @js.native
  open class CylinderGeometry protected () extends BufferGeometry {
    /**
      * @param [radiusTop=1] — Radius of the cylinder at the top.
      * @param [radiusBottom=1] — Radius of the cylinder at the bottom.
      * @param [height=1] — Height of the cylinder.
      * @param [radialSegments=8] — Number of segmented faces around the circumference of the cylinder.
      * @param [heightSegments=1] — Number of rows of faces along the height of the cylinder.
      * @param [openEnded=false] - A Boolean indicating whether or not to cap the ends of the cylinder.
      * @param [thetaStart=0]
      * @param [thetaLength=Math.PI * 2]
      */
    def this(
      radiusTop: js.UndefOr[Double],
      radiusBottom: js.UndefOr[Double],
      height: js.UndefOr[Double],
      radialSegments: js.UndefOr[Double],
      heightSegments: js.UndefOr[Double],
      openEnded: js.UndefOr[Boolean],
      thetaStart: js.UndefOr[Double],
      thetaLength: js.UndefOr[Double]
    ) = this()
    
    var parameters: HeightSegments = js.native
  }
  /* static members */
  object CylinderGeometry {
    
    @JSImport("three/src/geometries/CylinderGeometry", "CylinderGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: Any): CylinderGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[CylinderGeometry]
  }
}
