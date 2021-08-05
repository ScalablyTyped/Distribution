package typings.tensorflowTfjsConverter

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsConverter.executionContextMod.ExecutionContext
import typings.tensorflowTfjsConverter.operationsTypesMod.GraphNode
import typings.tensorflowTfjsConverter.operationsTypesMod.Node
import typings.tensorflowTfjsConverter.operationsTypesMod.ValueType
import typings.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeValueImplMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/custom_op/node_value_impl", "NodeValueImpl")
  @js.native
  class NodeValueImpl protected ()
    extends StObject
       with GraphNode {
    def this(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext) = this()
    
    /* CompleteClass */
    var attrs: StringDictionary[ValueType] = js.native
    
    /* private */ var context: js.Any = js.native
    
    /**
      * Return the value of the attribute or input param.
      * @param name String: name of attribute or input param.
      */
    /* private */ var getAttr: js.Any = js.native
    
    /**
      * Return the value of the attribute or input param.
      * @param name String: name of attribute or input param.
      */
    /* private */ var getInput: js.Any = js.native
    
    /* CompleteClass */
    var inputs: js.Array[Tensor[Rank]] = js.native
    
    /* private */ var node: js.Any = js.native
    
    /* private */ var tensorMap: js.Any = js.native
  }
}
