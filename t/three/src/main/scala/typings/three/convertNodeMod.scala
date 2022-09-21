package typings.three

import typings.three.constantsMod.NodeTypeOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertNodeMod {
  
  @JSImport("three/examples/jsm/nodes/utils/ConvertNode", JSImport.Default)
  @js.native
  open class default protected () extends ConvertNode {
    def this(node: typings.three.nodeMod.default, convertTo: NodeTypeOption) = this()
  }
  
  @js.native
  trait ConvertNode
    extends typings.three.nodeMod.default {
    
    var convertTo: NodeTypeOption = js.native
    
    var node: typings.three.nodeMod.default = js.native
  }
}
