package typings.three

import typings.three.examplesJsmNodesNodesMod.CheckerNode
import typings.three.examplesJsmNodesNodesMod.Node
import typings.three.examplesJsmNodesShadernodeShaderNodeMod.Swizzable
import typings.three.srcMaterialsShaderMaterialMod.ShaderMaterialParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesMaterialsMeshPhysicalNodeMaterialMod {
  
  @JSImport("three/examples/jsm/nodes/materials/MeshPhysicalNodeMaterial", JSImport.Default)
  @js.native
  open class default protected () extends MeshPhysicalNodeMaterial {
    def this(parameters: ShaderMaterialParameters) = this()
  }
  
  @js.native
  trait MeshPhysicalNodeMaterial
    extends typings.three.examplesJsmNodesMaterialsMeshStandardNodeMaterialMod.default {
    
    var attenuationColorNode: Node | Null = js.native
    
    var attenuationDistanceNode: Node | Null = js.native
    
    def copy(source: MeshPhysicalNodeMaterial): this.type = js.native
    
    var iridescenceIORNode: Null | Swizzable[Node] = js.native
    
    var iridescenceNode: Null | Swizzable[CheckerNode] = js.native
    
    var iridescenceThicknessNode: Null | Swizzable[Node] = js.native
    
    var specularColorNode: Node | Null = js.native
    
    var specularIntensityNode: Node | Null = js.native
    
    var thicknessNode: Node | Null = js.native
    
    var transmissionNode: Node | Null = js.native
  }
}
