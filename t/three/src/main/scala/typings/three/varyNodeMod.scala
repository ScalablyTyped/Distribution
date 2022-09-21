package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object varyNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/VaryNode", JSImport.Default)
  @js.native
  open class default protected () extends VaryNode {
    def this(node: typings.three.nodeMod.default) = this()
    def this(node: typings.three.nodeMod.default, name: String) = this()
  }
  
  @js.native
  trait VaryNode
    extends typings.three.nodeMod.default {
    
    var name: String | Null = js.native
    
    var node: typings.three.nodeMod.default = js.native
  }
}
