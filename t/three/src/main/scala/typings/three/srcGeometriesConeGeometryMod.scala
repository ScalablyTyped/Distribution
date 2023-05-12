package typings.three

import typings.three.anon.HeightSegments
import typings.three.srcGeometriesCylinderGeometryMod.CylinderGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesConeGeometryMod {
  
  @JSImport("three/src/geometries/ConeGeometry", "ConeGeometry")
  @js.native
  open class ConeGeometry protected () extends CylinderGeometry {
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
    
    /**
      * An object with a property for each of the constructor parameters.
      * @remarks {@link radiusTop} and {@link radiusBottom} are from base {@link THREE.CylinderGeometry} class.
      * @remarks Any modification after instantiation does not change the geometry.
      */
    @JSName("parameters")
    val parameters_ConeGeometry: HeightSegments = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `ConeGeometry`
      */
    @JSName("type")
    val type_ConeGeometry: String | typings.three.threeStrings.ConeGeometry = js.native
  }
  /* static members */
  object ConeGeometry {
    
    @JSImport("three/src/geometries/ConeGeometry", "ConeGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): ConeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[ConeGeometry]
  }
}
