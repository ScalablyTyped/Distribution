package typings.three

import typings.three.examplesJsmNodesCoreConstantsMod.NodeTypeOption
import typings.three.examplesJsmNodesCoreConstantsMod.NodeValueOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreInputNodeMod {
  
  /* note: abstract class */ @JSImport("three/examples/jsm/nodes/core/InputNode", JSImport.Default)
  @js.native
  open class default protected () extends InputNode {
    def this(value: NodeValueOption) = this()
    def this(value: NodeValueOption, nodeType: NodeTypeOption) = this()
  }
  
  @js.native
  trait InputNode
    extends typings.three.examplesJsmNodesCoreNodeMod.default {
    
    def getInputType(builder: typings.three.examplesJsmNodesCoreNodeBuilderMod.default): String | Null = js.native
    
    var isInputNode: true = js.native
    
    var value: NodeValueOption = js.native
  }
}
