package typings.three

import typings.three.srcGeometriesPolyhedronGeometryMod.PolyhedronGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesTetrahedronGeometryMod {
  
  @JSImport("three/src/geometries/TetrahedronGeometry", "TetrahedronGeometry")
  @js.native
  /**
    * Create a new instance of {@link TetrahedronGeometry}
    * @param radius Radius of the tetrahedron. Expects a `Float`. Default `1`
    * @param detail Setting this to a value greater than 0 adds vertices making it no longer a tetrahedron. Expects a `Integer`. Default `0`
    */
  open class TetrahedronGeometry () extends PolyhedronGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, detail: Double) = this()
    def this(radius: Unit, detail: Double) = this()
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `TetrahedronGeometry`
      */
    @JSName("type")
    val type_TetrahedronGeometry: String | typings.three.threeStrings.TetrahedronGeometry = js.native
  }
  /* static members */
  object TetrahedronGeometry {
    
    @JSImport("three/src/geometries/TetrahedronGeometry", "TetrahedronGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): TetrahedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[TetrahedronGeometry]
  }
}
