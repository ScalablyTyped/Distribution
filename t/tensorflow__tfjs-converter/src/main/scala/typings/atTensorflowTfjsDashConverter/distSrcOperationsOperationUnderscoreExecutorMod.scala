package typings.atTensorflowTfjsDashConverter

import typings.atTensorflowTfjsDashConverter.distSrcDataTypesMod.NamedTensorsMap
import typings.atTensorflowTfjsDashConverter.distSrcExecutorExecutionUnderscoreContextMod.ExecutionContext
import typings.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod.Node
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/operations/operation_executor", JSImport.Namespace)
@js.native
object distSrcOperationsOperationUnderscoreExecutorMod extends js.Object {
  def executeOp(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): js.Array[Tensor[Rank]] | js.Promise[js.Array[Tensor[Rank]]] = js.native
}

