package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.SkinnedMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesAccessorsSkinningNodeMod {
  
  @JSImport("three/examples/jsm/nodes/accessors/SkinningNode", JSImport.Default)
  @js.native
  open class default protected () extends SkinningNode {
    def this(skinnedMesh: SkinnedMesh[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]]) = this()
  }
  
  @js.native
  trait SkinningNode
    extends typings.three.examplesJsmNodesCoreNodeMod.default {
    
    var bindMatrixInverseNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var bindMatrixNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var boneMatricesNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var skinIndexNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var skinWeightNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
  }
}
