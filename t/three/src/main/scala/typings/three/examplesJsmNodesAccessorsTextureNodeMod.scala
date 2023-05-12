package typings.three

import typings.three.examplesJsmNodesNodesMod.Node
import typings.three.srcThreeMod.Texture
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesAccessorsTextureNodeMod {
  
  @JSImport("three/examples/jsm/nodes/accessors/TextureNode", JSImport.Default)
  @js.native
  open class default protected () extends TextureNode {
    def this(value: Texture) = this()
    def this(value: Texture, uvNode: Node) = this()
    def this(value: Texture, uvNode: Unit, levelNode: Node) = this()
    def this(value: Texture, uvNode: Node, levelNode: Node) = this()
  }
  
  @js.native
  trait TextureNode
    extends typings.three.examplesJsmNodesCoreUniformNodeMod.default {
    
    def getDefaultUV(): Node = js.native
    
    var isTextureNode: `true` = js.native
    
    var levelNode: Node | Null = js.native
    
    var uvNode: Node | Null = js.native
  }
}
