package typings.atTensorflowTfjsDashConverter.distSrcExecutorModelUnderscoreAnalysisMod

import typings.atTensorflowTfjsDashConverter.distSrcDataTypesMod.NamedTensorsMap
import typings.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod.Node
import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/executor/model_analysis", "getExecutionSubgraph")
@js.native
object getExecutionSubgraph extends js.Object {
  def apply(inputs: NamedTensorMap, outputs: js.Array[Node], weightMap: NamedTensorsMap): ExecutionInfo = js.native
}

