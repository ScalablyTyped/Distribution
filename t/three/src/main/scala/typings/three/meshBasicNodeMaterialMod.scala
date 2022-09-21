package typings.three

import typings.three.shaderMaterialMod.ShaderMaterialParameters
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshBasicNodeMaterialMod {
  
  @JSImport("three/examples/jsm/nodes/materials/MeshBasicNodeMaterial", JSImport.Default)
  @js.native
  open class default () extends MeshBasicNodeMaterial {
    def this(paramters: ShaderMaterialParameters) = this()
  }
  
  @js.native
  trait MeshBasicNodeMaterial
    extends typings.three.nodeMaterialMod.default {
    
    var alphaTestNode: typings.three.nodeMod.default | Null = js.native
    
    var colorNode: typings.three.nodeMod.default | Null = js.native
    
    def copy(source: MeshBasicNodeMaterial): this.type = js.native
    
    var isMeshBasicNodeMaterial: `true` = js.native
    
    var lightNode: typings.three.nodeMod.default | Null = js.native
    
    var opacityNode: typings.three.nodeMod.default | Null = js.native
    
    var positionNode: typings.three.nodeMod.default | Null = js.native
  }
}
