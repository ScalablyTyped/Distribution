package typings.three

import typings.three.operatorNodeMod.OperatorNodeOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object varNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/VarNode", JSImport.Default)
  @js.native
  open class default protected () extends VarNode {
    def this(node: typings.three.nodeMod.default) = this()
    def this(node: typings.three.nodeMod.default, name: String) = this()
  }
  
  @js.native
  trait VarNode
    extends typings.three.nodeMod.default {
    
    def add(params: typings.three.nodeMod.default*): this.type = js.native
    
    def assign(params: typings.three.nodeMod.default*): this.type = js.native
    
    def div(params: typings.three.nodeMod.default*): this.type = js.native
    
    def mul(params: typings.three.nodeMod.default*): this.type = js.native
    
    var name: String | Null = js.native
    
    var node: typings.three.nodeMod.default = js.native
    
    def op(op: OperatorNodeOp, params: typings.three.nodeMod.default*): this.type = js.native
    
    def sub(params: typings.three.nodeMod.default*): this.type = js.native
  }
}
