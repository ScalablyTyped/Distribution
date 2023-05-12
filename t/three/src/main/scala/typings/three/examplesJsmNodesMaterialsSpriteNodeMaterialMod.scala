package typings.three

import typings.three.examplesJsmNodesNodesMod.NodeBuilder
import typings.three.srcMaterialsShaderMaterialMod.ShaderMaterialParameters
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesMaterialsSpriteNodeMaterialMod {
  
  @JSImport("three/examples/jsm/nodes/materials/SpriteNodeMaterial", JSImport.Default)
  @js.native
  open class default () extends SpriteNodeMaterial {
    def this(parameters: ShaderMaterialParameters) = this()
  }
  
  @js.native
  trait SpriteNodeMaterial
    extends typings.three.examplesJsmNodesMaterialsNodeMaterialMod.default {
    
    def copy(source: SpriteNodeMaterial): this.type = js.native
    
    def generatePosition(builder: NodeBuilder): Unit = js.native
    
    var isSpriteNodeMaterial: `true` = js.native
    
    var lightNode: typings.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var rotationNode: typings.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var scaleNode: typings.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
  }
}
