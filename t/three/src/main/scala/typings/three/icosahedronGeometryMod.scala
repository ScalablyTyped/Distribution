package typings.three

import typings.three.geometryMod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object icosahedronGeometryMod {
  
  @JSImport("three/src/geometries/IcosahedronGeometry", "IcosahedronGeometry")
  @js.native
  /**
  	 * @param [radius=1]
  	 * @param [detail=0]
  	 */
  class IcosahedronGeometry () extends Geometry {
    def this(radius: Double) = this()
    def this(radius: Double, detail: Double) = this()
    def this(radius: Unit, detail: Double) = this()
  }
}
