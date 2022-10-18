package typings.three

import typings.three.srcGeometriesPolyhedronGeometryMod.PolyhedronGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesOctahedronGeometryMod {
  
  @JSImport("three/src/geometries/OctahedronGeometry", "OctahedronGeometry")
  @js.native
  /**
    * @param [radius=1]
    * @param [detail=0]
    */
  open class OctahedronGeometry () extends PolyhedronGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, detail: Double) = this()
    def this(radius: Unit, detail: Double) = this()
  }
  /* static members */
  object OctahedronGeometry {
    
    @JSImport("three/src/geometries/OctahedronGeometry", "OctahedronGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: Any): OctahedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[OctahedronGeometry]
  }
}
