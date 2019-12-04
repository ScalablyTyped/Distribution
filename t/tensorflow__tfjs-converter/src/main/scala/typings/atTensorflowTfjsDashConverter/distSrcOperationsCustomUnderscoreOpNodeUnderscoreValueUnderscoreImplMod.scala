package typings.atTensorflowTfjsDashConverter

import org.scalablytyped.runtime.StringDictionary
import typings.atTensorflowTfjsDashConverter.distSrcDataTypesMod.NamedTensorsMap
import typings.atTensorflowTfjsDashConverter.distSrcExecutorExecutionUnderscoreContextMod.ExecutionContext
import typings.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod.GraphNode
import typings.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod.Node
import typings.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod.ValueType
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/operations/custom_op/node_value_impl", JSImport.Namespace)
@js.native
object distSrcOperationsCustomUnderscoreOpNodeUnderscoreValueUnderscoreImplMod extends js.Object {
  @js.native
  class NodeValueImpl protected () extends GraphNode {
    def this(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext) = this()
    /* CompleteClass */
    override var attrs: StringDictionary[ValueType] = js.native
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
    /* CompleteClass */
    override var inputs: js.Array[Tensor[Rank]] = js.native
    var node: js.Any = js.native
    var tensorMap: js.Any = js.native
  }
  
}

