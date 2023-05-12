package typings.three

import typings.three.anon.InnerRadius
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesRingGeometryMod {
  
  @JSImport("three/src/geometries/RingGeometry", "RingGeometry")
  @js.native
  open class RingGeometry protected () extends BufferGeometry[NormalBufferAttributes] {
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
    
    /**
      * An object with a property for each of the constructor parameters.
      * @remarks Any modification after instantiation does not change the geometry.
      */
    val parameters: InnerRadius = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `RingGeometry`
      */
    @JSName("type")
    val type_RingGeometry: String | typings.three.threeStrings.RingGeometry = js.native
  }
  /* static members */
  object RingGeometry {
    
    @JSImport("three/src/geometries/RingGeometry", "RingGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): RingGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[RingGeometry]
  }
}
