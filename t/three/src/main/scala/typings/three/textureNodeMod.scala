package typings.three

import typings.three.nodesMod.Node
import typings.three.threeBooleans.`true`
import typings.three.threeMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textureNodeMod {
  
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
    extends typings.three.uniformNodeMod.default {
    
    var isTextureNode: `true` = js.native
    
    var levelNode: Node | Null = js.native
    
    var uvNode: Node | Null = js.native
  }
}
