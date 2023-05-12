package typings.three

import typings.three.anon.CapSegments
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesCapsuleGeometryMod {
  
  @JSImport("three/src/geometries/CapsuleGeometry", "CapsuleGeometry")
  @js.native
  /**
    * Create a new instance of {@link CapsuleGeometry}
    * @param radius Radius of the capsule. Expects a `Float`. Default `1`
    * @param length Length of the middle section. Expects a `Float`. Default `1`
    * @param capSubdivisions Number of curve segments used to build the caps. Expects a `Integer`. Default `4`
    * @param radialSegments Number of segmented faces around the circumference of the capsule. Expects a `Integer`. Default `8`
    */
  open class CapsuleGeometry () extends BufferGeometry[NormalBufferAttributes] {
    def this(radius: Double) = this()
    def this(radius: Double, length: Double) = this()
    def this(radius: Unit, length: Double) = this()
    def this(radius: Double, length: Double, capSegments: Double) = this()
    def this(radius: Double, length: Unit, capSegments: Double) = this()
    def this(radius: Unit, length: Double, capSegments: Double) = this()
    def this(radius: Unit, length: Unit, capSegments: Double) = this()
    def this(radius: Double, length: Double, capSegments: Double, radialSegments: Double) = this()
    def this(radius: Double, length: Double, capSegments: Unit, radialSegments: Double) = this()
    def this(radius: Double, length: Unit, capSegments: Double, radialSegments: Double) = this()
    def this(radius: Double, length: Unit, capSegments: Unit, radialSegments: Double) = this()
    def this(radius: Unit, length: Double, capSegments: Double, radialSegments: Double) = this()
    def this(radius: Unit, length: Double, capSegments: Unit, radialSegments: Double) = this()
    def this(radius: Unit, length: Unit, capSegments: Double, radialSegments: Double) = this()
    def this(radius: Unit, length: Unit, capSegments: Unit, radialSegments: Double) = this()
    
    /**
      * An object with a property for each of the constructor parameters.
      * @remarks Any modification after instantiation does not change the geometry.
      */
    val parameters: CapSegments = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `CapsuleGeometry`
      */
    @JSName("type")
    val type_CapsuleGeometry: String | typings.three.threeStrings.CapsuleGeometry = js.native
  }
  /* static members */
  object CapsuleGeometry {
    
    @JSImport("three/src/geometries/CapsuleGeometry", "CapsuleGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): CapsuleGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[CapsuleGeometry]
  }
}
