package typings.three.buildThreeDotmoduleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.module", "SphereGeometry")
@js.native
open class SphereGeometry protected ()
  extends typings.three.srcThreeMod.SphereGeometry {
  /**
    * Create a new instance of {@link SphereGeometry}
    * @remarks
    * The geometry is created by sweeping and calculating vertexes
    * around the **Y** axis (horizontal sweep) and the **Z** axis (vertical sweep)
    * Thus, incomplete spheres (akin to `'sphere slices'`) can be created
    * through the use of different values of {@link phiStart}, {@link phiLength}, {@link thetaStart} and {@link thetaLength},
    * in order to define the points in which we start (or end) calculating those vertices.
    * @param radius Sphere radius. Expects a `Float`. Default `1`
    * @param widthSegments Number of horizontal segments. Minimum value is 3, and the Expects a `Integer`. Default `32`
    * @param heightSegments Number of vertical segments. Minimum value is 2, and the Expects a `Integer`. Default `16`
    * @param phiStart Specify horizontal starting angle. Expects a `Float`. Default `0`
    * @param phiLength Specify horizontal sweep angle size. Expects a `Float`. Default `Math.PI * 2`
    * @param thetaStart Specify vertical starting angle. Expects a `Float`. Default `0`
    * @param thetaLength Specify vertical sweep angle size. Expects a `Float`. Default `Math.PI`
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
}
/* static members */
object SphereGeometry {
  
  @JSImport("three/build/three.module", "SphereGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromJSON(data: js.Object): typings.three.srcGeometriesSphereGeometryMod.SphereGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesSphereGeometryMod.SphereGeometry]
}
