package typings.three

import typings.three.constantsMod.NodeTypeOption
import typings.three.constantsMod.NodeValueOption
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/InputNode", JSImport.Default)
  @js.native
  abstract class default protected () extends InputNode {
    def this(value: NodeValueOption) = this()
    def this(value: NodeValueOption, nodeType: NodeTypeOption) = this()
  }
  
  @js.native
  trait InputNode
    extends typings.three.nodeMod.default {
    
    def getInputType(builder: typings.three.nodeBuilderMod.default): String | Null = js.native
    
    var isInputNode: `true` = js.native
    
    var value: NodeValueOption = js.native
  }
}
