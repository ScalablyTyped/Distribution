package typings.three

import typings.three.examplesJsmNodesMathOperatorNodeMod.OperatorNodeOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreVarNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/VarNode", JSImport.Default)
  @js.native
  open class default protected () extends VarNode {
    def this(node: typings.three.examplesJsmNodesCoreNodeMod.default) = this()
    def this(node: typings.three.examplesJsmNodesCoreNodeMod.default, name: String) = this()
  }
  
  @js.native
  trait VarNode
    extends typings.three.examplesJsmNodesCoreNodeMod.default {
    
    def add(params: typings.three.examplesJsmNodesCoreNodeMod.default*): this.type = js.native
    
    def assign(params: typings.three.examplesJsmNodesCoreNodeMod.default*): this.type = js.native
    
    def div(params: typings.three.examplesJsmNodesCoreNodeMod.default*): this.type = js.native
    
    def mul(params: typings.three.examplesJsmNodesCoreNodeMod.default*): this.type = js.native
    
    var name: String | Null = js.native
    
    var node: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    def op(op: OperatorNodeOp, params: typings.three.examplesJsmNodesCoreNodeMod.default*): this.type = js.native
    
    def sub(params: typings.three.examplesJsmNodesCoreNodeMod.default*): this.type = js.native
  }
}
