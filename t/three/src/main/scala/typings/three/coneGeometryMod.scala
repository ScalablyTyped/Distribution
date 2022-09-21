package typings.three

import typings.three.cylinderGeometryMod.CylinderGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coneGeometryMod {
  
  @JSImport("three/src/geometries/ConeGeometry", "ConeGeometry")
  @js.native
  open class ConeGeometry protected () extends CylinderGeometry {
    /**
      * @param [radius=1] — Radius of the cone base.
      * @param [height=1] — Height of the cone.
      * @param [radialSegments=8] — Number of segmented faces around the circumference of the cone.
      * @param [heightSegments=1] — Number of rows of faces along the height of the cone.
      * @param [openEnded=false] — A Boolean indicating whether the base of the cone is open or capped.
      * @param [thetaStart=0]
      * @param [thetaLength=Math.PI * 2]
      */
    def this(
      radius: js.UndefOr[Double],
      height: js.UndefOr[Double],
      radialSegments: js.UndefOr[Double],
      heightSegments: js.UndefOr[Double],
      openEnded: js.UndefOr[Boolean],
      thetaStart: js.UndefOr[Double],
      thetaLength: js.UndefOr[Double]
    ) = this()
  }
  /* static members */
  object ConeGeometry {
    
    @JSImport("three/src/geometries/ConeGeometry", "ConeGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: Any): ConeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[ConeGeometry]
  }
}
