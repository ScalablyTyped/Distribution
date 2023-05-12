package typings.three

import typings.three.srcGeometriesPolyhedronGeometryMod.PolyhedronGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesOctahedronGeometryMod {
  
  @JSImport("three/src/geometries/OctahedronGeometry", "OctahedronGeometry")
  @js.native
  /**
    * Create a new instance of {@link OctahedronGeometry}
    * @param radius Radius of the octahedron. Expects a `Float`. Default `1`
    * @param detail Setting this to a value greater than zero add vertices making it no longer an octahedron. Expects a `Integer`. Default `0`
    */
  open class OctahedronGeometry () extends PolyhedronGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, detail: Double) = this()
    def this(radius: Unit, detail: Double) = this()
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `OctahedronGeometry`
      */
    @JSName("type")
    val type_OctahedronGeometry: String | typings.three.threeStrings.OctahedronGeometry = js.native
  }
  /* static members */
  object OctahedronGeometry {
    
    @JSImport("three/src/geometries/OctahedronGeometry", "OctahedronGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): OctahedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[OctahedronGeometry]
  }
}
