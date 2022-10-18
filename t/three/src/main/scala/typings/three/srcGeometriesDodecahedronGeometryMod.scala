package typings.three

import typings.three.srcGeometriesPolyhedronGeometryMod.PolyhedronGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesDodecahedronGeometryMod {
  
  @JSImport("three/src/geometries/DodecahedronGeometry", "DodecahedronGeometry")
  @js.native
  /**
    * @param [radius=1]
    * @param [detail=0]
    */
  open class DodecahedronGeometry () extends PolyhedronGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, detail: Double) = this()
    def this(radius: Unit, detail: Double) = this()
  }
  /* static members */
  object DodecahedronGeometry {
    
    @JSImport("three/src/geometries/DodecahedronGeometry", "DodecahedronGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: Any): DodecahedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[DodecahedronGeometry]
  }
}
