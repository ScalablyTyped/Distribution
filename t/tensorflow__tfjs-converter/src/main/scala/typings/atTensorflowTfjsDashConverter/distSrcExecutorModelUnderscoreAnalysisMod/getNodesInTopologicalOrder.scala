package typings.atTensorflowTfjsDashConverter.distSrcExecutorModelUnderscoreAnalysisMod

import typings.atTensorflowTfjsDashConverter.distSrcDataTypesMod.NamedTensorsMap
import typings.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod.Graph
import typings.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/executor/model_analysis", "getNodesInTopologicalOrder")
@js.native
object getNodesInTopologicalOrder extends js.Object {
  def apply(graph: Graph, weightMap: NamedTensorsMap, executionInfo: ExecutionInfo): js.Array[Node] = js.native
}

