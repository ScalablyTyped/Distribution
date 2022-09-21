package typings.three

import typings.three.shaderMaterialMod.ShaderMaterialParameters
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshStandardNodeMaterialMod {
  
  @JSImport("three/examples/jsm/nodes/materials/MeshStandardNodeMaterial", JSImport.Default)
  @js.native
  open class default () extends MeshStandardNodeMaterial {
    def this(paramters: ShaderMaterialParameters) = this()
  }
  
  @js.native
  trait MeshStandardNodeMaterial
    extends typings.three.nodeMaterialMod.default {
    
    var alphaTestNode: typings.three.nodeMod.default | Null = js.native
    
    var clearcoatNode: typings.three.nodeMod.default | Null = js.native
    
    var clearcoatRoughnessNode: typings.three.nodeMod.default | Null = js.native
    
    var colorNode: typings.three.nodeMod.default | Null = js.native
    
    def copy(source: MeshStandardNodeMaterial): this.type = js.native
    
    var emissiveNode: typings.three.nodeMod.default | Null = js.native
    
    var envNode: typings.three.nodeMod.default | Null = js.native
    
    var isMeshStandardNodeMaterial: `true` = js.native
    
    var lightsNode: typings.three.nodeMod.default | Null = js.native
    
    var metalnessNode: typings.three.nodeMod.default | Null = js.native
    
    var normalNode: typings.three.nodeMod.default | Null = js.native
    
    var opacityNode: typings.three.nodeMod.default | Null = js.native
    
    var positionNode: typings.three.nodeMod.default | Null = js.native
    
    var roughnessNode: typings.three.nodeMod.default | Null = js.native
  }
}
