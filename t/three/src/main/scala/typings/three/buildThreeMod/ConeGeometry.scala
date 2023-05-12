package typings.three.buildThreeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three", "ConeGeometry")
@js.native
open class ConeGeometry protected ()
  extends typings.three.srcThreeMod.ConeGeometry {
  /**
    * Create a new instance of {@link ConeGeometry}
    * @param radius Radius of the cone base. Expects a `Float`. Default `1`
    * @param height Height of the cone. Expects a `Float`. Default `1`
    * @param radialSegments Number of segmented faces around the circumference of the cone. Expects a `Integer`. Default `32`
    * @param heightSegments Number of rows of faces along the height of the cone. Expects a `Integer`. Default `1`
    * @param openEnded A Boolean indicating whether the base of the cone is open or capped. Default `false`, _meaning capped_.
    * @param thetaStart Start angle for first segment. Expects a `Float`. Default `0`, _(three o'clock position)_.
    * @param thetaLength The central angle, often called theta, of the circular sector. Expects a `Float`. Default `Math.PI * 2`, _which makes for a complete cone_.
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
  
  @JSImport("three/build/three", "ConeGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromJSON(data: js.Object): typings.three.srcGeometriesConeGeometryMod.ConeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesConeGeometryMod.ConeGeometry]
}
