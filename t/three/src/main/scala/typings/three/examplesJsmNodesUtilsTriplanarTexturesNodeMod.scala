package typings.three

import typings.three.examplesJsmNodesNodesMod.Node
import typings.three.examplesJsmNodesNodesMod.PositionNode
import typings.three.examplesJsmNodesNodesMod.TextureNode
import typings.three.examplesJsmNodesShadernodeShaderNodeMod.Swizzable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesUtilsTriplanarTexturesNodeMod {
  
  @JSImport("three/examples/jsm/nodes/utils/TriplanarTexturesNode", JSImport.Default)
  @js.native
  open class default protected () extends TriplanarTexturesNode {
    def this(
      textureXNode: typings.three.examplesJsmNodesCoreNodeMod.default,
      textureYNode: js.UndefOr[TextureNode | Null],
      textureZNode: js.UndefOr[TextureNode | Null],
      scaleNode: js.UndefOr[Swizzable[Node]],
      positionNode: js.UndefOr[Swizzable[PositionNode]],
      normalNode: js.UndefOr[Swizzable[PositionNode]]
    ) = this()
  }
  
  @js.native
  trait TriplanarTexturesNode
    extends typings.three.examplesJsmNodesCoreNodeMod.default {
    
    var normalNode: Swizzable[PositionNode] = js.native
    
    var positionNode: Swizzable[PositionNode] = js.native
    
    var scaleNode: Swizzable[Node] = js.native
    
    var textureXNode: TextureNode = js.native
    
    var textureYNode: TextureNode | Null = js.native
    
    var textureZNode: TextureNode | Null = js.native
  }
}
