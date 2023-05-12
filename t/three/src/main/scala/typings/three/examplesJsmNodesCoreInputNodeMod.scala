package typings.three

import typings.three.examplesJsmNodesCoreConstantsMod.NodeTypeOption
import typings.three.examplesJsmNodesCoreConstantsMod.NodeValueOption
import typings.three.threeBooleans.`true`
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
    
    var isInputNode: `true` = js.native
    
    var precision: Precision | Null = js.native
    
    def setPrecision(precision: Precision): this.type = js.native
    
    var value: NodeValueOption = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.three.threeStrings.low
    - typings.three.threeStrings.medium
    - typings.three.threeStrings.high
  */
  trait Precision extends StObject
  object Precision {
    
    inline def high: typings.three.threeStrings.high = "high".asInstanceOf[typings.three.threeStrings.high]
    
    inline def low: typings.three.threeStrings.low = "low".asInstanceOf[typings.three.threeStrings.low]
    
    inline def medium: typings.three.threeStrings.medium = "medium".asInstanceOf[typings.three.threeStrings.medium]
  }
}
