package typings.tensorflowTfjsConverter

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsConverter.distDataTypesMod.NamedTensorsMap
import typings.tensorflowTfjsConverter.distExecutorExecutionContextMod.ExecutionContext
import typings.tensorflowTfjsConverter.distOperationsTypesMod.GraphNode
import typings.tensorflowTfjsConverter.distOperationsTypesMod.Node
import typings.tensorflowTfjsConverter.distOperationsTypesMod.ValueType
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsCustomOpNodeValueImplMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/custom_op/node_value_impl", "NodeValueImpl")
  @js.native
  open class NodeValueImpl protected ()
    extends StObject
       with GraphNode {
    def this(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext) = this()
    
    /* CompleteClass */
    var attrs: StringDictionary[ValueType] = js.native
    
    /* private */ var context: Any = js.native
    
    /**
      * Return the value of the attribute or input param.
      * @param name String: name of attribute or input param.
      */
    /* private */ var getAttr: Any = js.native
    
    /**
      * Return the value of the attribute or input param.
      * @param name String: name of attribute or input param.
      */
    /* private */ var getInput: Any = js.native
    
    /* CompleteClass */
    var inputs: js.Array[Tensor[Rank]] = js.native
    
    /* private */ var node: Any = js.native
    
    /* private */ var tensorMap: Any = js.native
  }
}
