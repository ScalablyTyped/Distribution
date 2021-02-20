package typings.three

import typings.three.box3Mod.Box3
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.colorMod.Color
import typings.three.geometryMod.Geometry
import typings.three.lineSegmentsMod.LineSegments
import typings.three.materialMod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object box3HelperMod {
  
  @JSImport("three/src/helpers/Box3Helper", "Box3Helper")
  @js.native
  class Box3Helper protected ()
    extends LineSegments[Geometry | BufferGeometry, Material | js.Array[Material]] {
    /**
    	 * @param box
    	 * @param [color=0xffff00]
    	 */
    def this(box: Box3) = this()
    def this(box: Box3, color: Color) = this()
    
    var box: Box3 = js.native
  }
}
