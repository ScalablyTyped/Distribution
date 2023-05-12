package typings.three

import typings.three.examplesJsmNodesNodesMod.Node
import typings.three.examplesJsmNodesNodesMod.TextureNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesUtilsSpecularMIPLevelNodeMod {
  
  @JSImport("three/examples/jsm/nodes/utils/SpecularMIPLevelNode", JSImport.Default)
  @js.native
  open class default protected () extends SpecularMIPLevelNode {
    def this(textureNode: TextureNode) = this()
    def this(textureNode: TextureNode, roughnessNode: Node) = this()
  }
  
  @js.native
  trait SpecularMIPLevelNode extends Node {
    
    var roughnessNode: Node | Null = js.native
    
    var textureNode: TextureNode = js.native
  }
}
