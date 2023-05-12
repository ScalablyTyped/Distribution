package typings.three

import typings.three.anon.OpenEnded
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesCylinderGeometryMod {
  
  @JSImport("three/src/geometries/CylinderGeometry", "CylinderGeometry")
  @js.native
  open class CylinderGeometry protected () extends BufferGeometry[NormalBufferAttributes] {
    /**
      * Create a new instance of {@link CylinderGeometry}
      * @param radiusTop Radius of the cylinder at the top. Default `1`
      * @param radiusBottom Radius of the cylinder at the bottom. Default `1`
      * @param height Height of the cylinder. Default `1`
      * @param radialSegments Number of segmented faces around the circumference of the cylinder. Default `32`
      * @param heightSegments Number of rows of faces along the height of the cylinder. Expects a `Integer`. Default `1`
      * @param openEnded A Boolean indicating whether the ends of the cylinder are open or capped. Default `false`, _meaning capped_.
      * @param thetaStart Start angle for first segment. Default `0`, _(three o'clock position)_.
      * @param thetaLength The central angle, often called theta, of the circular sector. Default `Math.PI * 2`, _which makes for a complete cylinder.
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
    
    /**
      * An object with a property for each of the constructor parameters.
      * @remarks Any modification after instantiation does not change the geometry.
      */
    val parameters: OpenEnded = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `CylinderGeometry`
      */
    @JSName("type")
    val type_CylinderGeometry: String | typings.three.threeStrings.CylinderGeometry = js.native
  }
  /* static members */
  object CylinderGeometry {
    
    @JSImport("three/src/geometries/CylinderGeometry", "CylinderGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: Any): CylinderGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[CylinderGeometry]
  }
}
