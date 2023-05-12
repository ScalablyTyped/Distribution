package typings.three

import typings.three.examplesJsmNodesNodesMod.TextureNode
import typings.three.srcThreeMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesUtilsMaxMipLevelNodeMod {
  
  @JSImport("three/examples/jsm/nodes/utils/MaxMipLevelNode", JSImport.Default)
  @js.native
  open class default protected () extends MaxMipLevelNode {
    def this(textureNode: TextureNode) = this()
  }
  
  @js.native
  trait MaxMipLevelNode
    extends typings.three.examplesJsmNodesCoreUniformNodeMod.default {
    
    def texture: Texture = js.native
    
    var textureNode: TextureNode = js.native
  }
}
