package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.geometryMod.Geometry
import typings.three.lineSegmentsMod.LineSegments
import typings.three.materialMod.Material
import typings.three.planeMod.Plane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/helpers/PlaneHelper", JSImport.Namespace)
@js.native
object planeHelperMod extends js.Object {
  
  @js.native
  class PlaneHelper protected ()
    extends LineSegments[Geometry | BufferGeometry, Material | js.Array[Material]] {
    /**
    	 * @param plane
    	 * @param [size=1]
    	 * @param [hex=0xffff00]
    	 */
    def this(plane: Plane) = this()
    def this(plane: Plane, size: Double) = this()
    def this(plane: Plane, size: js.UndefOr[scala.Nothing], hex: Double) = this()
    def this(plane: Plane, size: Double, hex: Double) = this()
    
    var plane: Plane = js.native
    
    /**
    	 * @default 1
    	 */
    var size: Double = js.native
  }
}
