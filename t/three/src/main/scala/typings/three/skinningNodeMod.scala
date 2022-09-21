package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.materialMod.Material
import typings.three.threeMod.SkinnedMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skinningNodeMod {
  
  @JSImport("three/examples/jsm/nodes/accessors/SkinningNode", JSImport.Default)
  @js.native
  open class default protected () extends SkinningNode {
    def this(skinnedMesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]]) = this()
  }
  
  @js.native
  trait SkinningNode
    extends typings.three.nodeMod.default {
    
    var bindMatrixInverseNode: typings.three.nodeMod.default = js.native
    
    var bindMatrixNode: typings.three.nodeMod.default = js.native
    
    var boneMatricesNode: typings.three.nodeMod.default = js.native
    
    var skinIndexNode: typings.three.nodeMod.default = js.native
    
    var skinWeightNode: typings.three.nodeMod.default = js.native
  }
}
