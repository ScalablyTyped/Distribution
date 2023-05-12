package typings.three.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.TorusKnotGeometry")
@js.native
open class TorusKnotGeometry protected ()
  extends typings.three.mod.TorusKnotGeometry {
  /**
    * Create a new instance of {@link TorusKnotGeometry}
    * @param radius Radius of the torus.. Default `1`.
    * @param tube Expects a `Float`. Default `0.4`.
    * @param tubularSegments Expects a `Integer`. Default `64`.
    * @param radialSegments Expects a `Integer`. Default `8`.
    * @param p This value determines, how many times the geometry winds around its axis of rotational symmetry. Expects a `Integer`. Default `2`.
    * @param q This value determines, how many times the geometry winds around a circle in the interior of the torus. Expects a `Integer`. Default `3`.
    */
  def this(
    radius: js.UndefOr[Double],
    tube: js.UndefOr[Double],
    tubularSegments: js.UndefOr[Double],
    radialSegments: js.UndefOr[Double],
    p: js.UndefOr[Double],
    q: js.UndefOr[Double]
  ) = this()
}
/* static members */
object TorusKnotGeometry {
  
  @JSGlobal("THREE.TorusKnotGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromJSON(data: js.Object): typings.three.srcGeometriesTorusKnotGeometryMod.TorusKnotGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesTorusKnotGeometryMod.TorusKnotGeometry]
}
