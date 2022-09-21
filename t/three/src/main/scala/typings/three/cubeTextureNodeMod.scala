package typings.three

import typings.three.nodesMod.Node
import typings.three.threeMod.CubeTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cubeTextureNodeMod {
  
  @JSImport("three/examples/jsm/nodes/accessors/CubeTextureNode", JSImport.Default)
  @js.native
  open class default protected () extends CubeTextureNode {
    def this(value: CubeTexture) = this()
    def this(value: CubeTexture, uvNode: Node) = this()
    def this(value: CubeTexture, uvNode: Null, levelNode: Node) = this()
    def this(value: CubeTexture, uvNode: Unit, levelNode: Node) = this()
    def this(value: CubeTexture, uvNode: Node, levelNode: Node) = this()
  }
  
  @js.native
  trait CubeTextureNode
    extends typings.three.textureNodeMod.default {
    
    var isCubeTextureNode: Boolean = js.native
  }
}
