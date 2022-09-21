package typings.three

import typings.three.nodeBuilderMod.NodeBuilderContext
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/ContextNode", JSImport.Default)
  @js.native
  open class default protected () extends ContextNode {
    def this(node: typings.three.nodeMod.default, context: NodeBuilderContext) = this()
  }
  
  @js.native
  trait ContextNode
    extends typings.three.nodeMod.default {
    
    var context: NodeBuilderContext = js.native
    
    var isContextNode: `true` = js.native
    
    var node: typings.three.nodeMod.default = js.native
  }
}
