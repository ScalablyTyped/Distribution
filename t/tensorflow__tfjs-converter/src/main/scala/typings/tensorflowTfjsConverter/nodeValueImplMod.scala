package typings.tensorflowTfjsConverter

import typings.tensorflowTfjsConverter.executionContextMod.ExecutionContext
import typings.tensorflowTfjsConverter.operationsTypesMod.GraphNode
import typings.tensorflowTfjsConverter.operationsTypesMod.Node
import typings.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-converter/dist/operations/custom_op/node_value_impl", JSImport.Namespace)
@js.native
object nodeValueImplMod extends js.Object {
  
  @js.native
  class NodeValueImpl protected () extends GraphNode {
    def this(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext) = this()
    
    var context: js.Any = js.native
    
    /**
      * Return the value of the attribute or input param.
      * @param name String: name of attribute or input param.
      */
    var getAttr: js.Any = js.native
    
    /**
      * Return the value of the attribute or input param.
      * @param name String: name of attribute or input param.
      */
    var getInput: js.Any = js.native
    
    var node: js.Any = js.native
    
    var tensorMap: js.Any = js.native
  }
}
