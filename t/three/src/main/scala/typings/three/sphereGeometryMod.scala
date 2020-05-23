package typings.three

import typings.three.anon.PhiStart
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.geometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/SphereGeometry", JSImport.Namespace)
@js.native
object sphereGeometryMod extends js.Object {
  @js.native
  class SphereBufferGeometry protected () extends BufferGeometry {
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
  
  @js.native
  class SphereGeometry protected () extends Geometry {
    /**
    	 * The geometry is created by sweeping and calculating vertexes around the Y axis (horizontal sweep) and the Z axis (vertical sweep). Thus, incomplete spheres (akin to 'sphere slices') can be created through the use of different values of phiStart, phiLength, thetaStart and thetaLength, in order to define the points in which we start (or end) calculating those vertices.
    	 *
    	 * @param radius — sphere radius. Default is 50.
    	 * @param widthSegments — number of horizontal segments. Minimum value is 3, and the default is 8.
    	 * @param heightSegments — number of vertical segments. Minimum value is 2, and the default is 6.
    	 * @param phiStart — specify horizontal starting angle. Default is 0.
    	 * @param phiLength — specify horizontal sweep angle size. Default is Math.PI * 2.
    	 * @param thetaStart — specify vertical starting angle. Default is 0.
    	 * @param thetaLength — specify vertical sweep angle size. Default is Math.PI.
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
  
}

