package typings.three

import typings.three.srcGeometriesPolyhedronGeometryMod.PolyhedronGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesDodecahedronGeometryMod {
  
  @JSImport("three/src/geometries/DodecahedronGeometry", "DodecahedronGeometry")
  @js.native
  /**
    * Create a new instance of {@link DodecahedronGeometry}
    * @param radius Radius of the dodecahedron. Expects a `Float`. Default `1`
    * @param detail Setting this to a value greater than 0 adds vertices making it no longer a dodecahedron. Expects a `Integer`. Default `0`
    */
  open class DodecahedronGeometry () extends PolyhedronGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, detail: Double) = this()
    def this(radius: Unit, detail: Double) = this()
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `DodecahedronGeometry`
      */
    @JSName("type")
    val type_DodecahedronGeometry: String | typings.three.threeStrings.DodecahedronGeometry = js.native
  }
  /* static members */
  object DodecahedronGeometry {
    
    @JSImport("three/src/geometries/DodecahedronGeometry", "DodecahedronGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): DodecahedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[DodecahedronGeometry]
  }
}
