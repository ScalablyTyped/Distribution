package typings.three

import typings.three.anon.Detail
import typings.three.geometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/geometries/DodecahedronGeometry", JSImport.Namespace)
@js.native
object dodecahedronGeometryMod extends js.Object {
  
  @js.native
  /**
  	 * @param [radius=1]
  	 * @param [detail=0]
  	 */
  class DodecahedronGeometry () extends Geometry {
    def this(radius: Double) = this()
    def this(radius: js.UndefOr[scala.Nothing], detail: Double) = this()
    def this(radius: Double, detail: Double) = this()
    
    var parameters: Detail = js.native
  }
}
