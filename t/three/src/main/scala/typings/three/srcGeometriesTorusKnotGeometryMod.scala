package typings.three

import typings.three.anon.P
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesTorusKnotGeometryMod {
  
  @JSImport("three/src/geometries/TorusKnotGeometry", "TorusKnotGeometry")
  @js.native
  open class TorusKnotGeometry protected () extends BufferGeometry[NormalBufferAttributes] {
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
    
    /**
      * An object with a property for each of the constructor parameters.
      * @remarks Any modification after instantiation does not change the geometry.
      */
    val parameters: P = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `TorusKnotGeometry`
      */
    @JSName("type")
    val type_TorusKnotGeometry: String | typings.three.threeStrings.TorusKnotGeometry = js.native
  }
  /* static members */
  object TorusKnotGeometry {
    
    @JSImport("three/src/geometries/TorusKnotGeometry", "TorusKnotGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): TorusKnotGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[TorusKnotGeometry]
  }
}
