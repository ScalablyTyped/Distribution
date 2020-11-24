package typings.tensorflowTfjsConverter.modelAnalysisMod

import typings.tensorflowTfjsConverter.operationsTypesMod.Node
import typings.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-converter/dist/executor/model_analysis", "getExecutionSubgraph")
@js.native
object getExecutionSubgraph extends js.Object {
  
  def apply(inputs: NamedTensorMap, outputs: js.Array[Node], weightMap: NamedTensorsMap): ExecutionInfo = js.native
  def apply(
    inputs: NamedTensorMap,
    outputs: js.Array[Node],
    weightMap: NamedTensorsMap,
    initNodes: js.Array[Node]
  ): ExecutionInfo = js.native
}
