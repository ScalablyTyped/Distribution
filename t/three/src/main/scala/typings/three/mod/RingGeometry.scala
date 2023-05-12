package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "RingGeometry")
@js.native
open class RingGeometry protected ()
  extends typings.three.srcThreeMod.RingGeometry {
  /**
    * Create a new instance of {@link RingGeometry}
    * @param innerRadius Expects a `Float`. Default `0.5`.
    * @param outerRadius Expects a `Float`. Default `1`.
    * @param thetaSegments Number of segments. A higher number means the ring will be more round. Minimum is 3. Expects a `Integer`. Default `32`.
    * @param phiSegments Minimum is 1. Expects a `Integer`. Default `1`.
    * @param thetaStart Starting angle. Expects a `Float`. Default `0`.
    * @param thetaLength Central angle. Expects a `Float`. Default `Math.PI * 2`.
    */
  def this(
    innerRadius: js.UndefOr[Double],
    outerRadius: js.UndefOr[Double],
    thetaSegments: js.UndefOr[Double],
    phiSegments: js.UndefOr[Double],
    thetaStart: js.UndefOr[Double],
    thetaLength: js.UndefOr[Double]
  ) = this()
}
/* static members */
object RingGeometry {
  
  @JSImport("three", "RingGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromJSON(data: js.Object): typings.three.srcGeometriesRingGeometryMod.RingGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesRingGeometryMod.RingGeometry]
}
