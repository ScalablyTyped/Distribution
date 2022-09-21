package typings.three

import typings.three.srcConstantsMod.NormalMapTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalMapNodeMod {
  
  @JSImport("three/examples/jsm/nodes/display/NormalMapNode", JSImport.Default)
  @js.native
  open class default protected () extends NormalMapNode {
    def this(node: typings.three.nodeMod.default) = this()
    def this(node: typings.three.nodeMod.default, scaleNode: typings.three.nodeMod.default) = this()
  }
  
  @js.native
  trait NormalMapNode
    extends typings.three.tempNodeMod.default {
    
    var node: typings.three.nodeMod.default = js.native
    
    var normalMapType: NormalMapTypes = js.native
    
    var scaleNode: typings.three.nodeMod.default | Null = js.native
  }
}
