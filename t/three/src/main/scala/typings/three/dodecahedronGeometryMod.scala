package typings.three

import typings.three.anon.Detail
import typings.three.geometryMod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dodecahedronGeometryMod {
  
  @JSImport("three/src/geometries/DodecahedronGeometry", "DodecahedronGeometry")
  @js.native
  /**
  	 * @param [radius=1]
  	 * @param [detail=0]
  	 */
  class DodecahedronGeometry () extends Geometry {
    def this(radius: Double) = this()
    def this(radius: Double, detail: Double) = this()
    def this(radius: Unit, detail: Double) = this()
    
    var parameters: Detail = js.native
  }
}
