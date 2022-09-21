package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.materialMod.Material
import typings.three.octreeMod.Octree
import typings.three.threeMod.LineSegments
import typings.three.utilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object octreeHelperMod {
  
  @JSImport("three/examples/jsm/helpers/OctreeHelper", "OctreeHelper")
  @js.native
  open class OctreeHelper protected ()
    extends LineSegments[BufferGeometry, Material | js.Array[Material]] {
    def this(octree: Octree, color: ColorRepresentation) = this()
    
    var color: ColorRepresentation = js.native
    
    var octree: Octree = js.native
    
    /**
      * @default 'OctreeHelper'
      */
    @JSName("type")
    var type_OctreeHelper: typings.three.threeStrings.OctreeHelper | String = js.native
  }
}
