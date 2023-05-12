package typings.three

import typings.three.examplesJsmMathOctreeMod.Octree
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathColorMod.ColorRepresentation
import typings.three.srcThreeMod.LineSegments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmHelpersOctreeHelperMod {
  
  @JSImport("three/examples/jsm/helpers/OctreeHelper", "OctreeHelper")
  @js.native
  open class OctreeHelper protected ()
    extends LineSegments[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]] {
    def this(octree: Octree) = this()
    def this(octree: Octree, color: ColorRepresentation) = this()
    
    var color: ColorRepresentation = js.native
    
    def dispose(): Unit = js.native
    
    var octree: Octree = js.native
    
    /**
      * @default 'OctreeHelper'
      */
    @JSName("type")
    var type_OctreeHelper: typings.three.threeStrings.OctreeHelper | String = js.native
    
    def update(): Unit = js.native
  }
}
