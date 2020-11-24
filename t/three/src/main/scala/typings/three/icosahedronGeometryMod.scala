package typings.three

import typings.three.geometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/geometries/IcosahedronGeometry", JSImport.Namespace)
@js.native
object icosahedronGeometryMod extends js.Object {
  
  @js.native
  /**
  	 * @param [radius=1]
  	 * @param [detail=0]
  	 */
  class IcosahedronGeometry () extends Geometry {
    def this(radius: Double) = this()
    def this(radius: js.UndefOr[scala.Nothing], detail: Double) = this()
    def this(radius: Double, detail: Double) = this()
  }
}
