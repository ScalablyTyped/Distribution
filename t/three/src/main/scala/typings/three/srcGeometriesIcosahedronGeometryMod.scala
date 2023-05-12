package typings.three

import typings.three.srcGeometriesPolyhedronGeometryMod.PolyhedronGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesIcosahedronGeometryMod {
  
  @JSImport("three/src/geometries/IcosahedronGeometry", "IcosahedronGeometry")
  @js.native
  /**
    * Create a new instance of {@link IcosahedronGeometry}
    * @param radius Expects a `Float`. Default `1`
    * @param detail Setting this to a value greater than 0 adds more vertices making it no longer an icosahedron.
    *               When detail is greater than 1, it's effectively a sphere. Expects a `Integer`. Default `0`
    */
  open class IcosahedronGeometry () extends PolyhedronGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, detail: Double) = this()
    def this(radius: Unit, detail: Double) = this()
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `IcosahedronGeometry`
      */
    @JSName("type")
    val type_IcosahedronGeometry: String | typings.three.threeStrings.IcosahedronGeometry = js.native
  }
  /* static members */
  object IcosahedronGeometry {
    
    @JSImport("three/src/geometries/IcosahedronGeometry", "IcosahedronGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): IcosahedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[IcosahedronGeometry]
  }
}
