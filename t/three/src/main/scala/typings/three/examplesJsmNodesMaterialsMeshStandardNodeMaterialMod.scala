package typings.three

import typings.three.srcMaterialsShaderMaterialMod.ShaderMaterialParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesMaterialsMeshStandardNodeMaterialMod {
  
  @JSImport("three/examples/jsm/nodes/materials/MeshStandardNodeMaterial", JSImport.Default)
  @js.native
  open class default () extends MeshStandardNodeMaterial {
    def this(paramters: ShaderMaterialParameters) = this()
  }
  
  @js.native
  trait MeshStandardNodeMaterial
    extends typings.three.examplesJsmNodesMaterialsNodeMaterialMod.default {
    
    var alphaTestNode: typings.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var clearcoatNode: typings.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var clearcoatRoughnessNode: typings.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var colorNode: typings.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    def copy(source: MeshStandardNodeMaterial): this.type = js.native
    
    var emissiveNode: typings.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var envNode: typings.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var isMeshStandardNodeMaterial: true = js.native
    
    var lightsNode: typings.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var metalnessNode: typings.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var normalNode: typings.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var opacityNode: typings.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var positionNode: typings.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var roughnessNode: typings.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
  }
}
