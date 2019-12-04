package typings.atTensorflowTfjsDashConverter

import typings.atTensorflowTfjsDashConverter.atTensorflowTfjsDashConverterStrings.control
import typings.atTensorflowTfjsDashConverter.distSrcDataTypesMod.NamedTensorsMap
import typings.atTensorflowTfjsDashConverter.distSrcExecutorExecutionUnderscoreContextMod.ExecutionContext
import typings.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod.Node
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/operations/executors/control_executor", JSImport.Namespace)
@js.native
object distSrcOperationsExecutorsControlUnderscoreExecutorMod extends js.Object {
  val CATEGORY: control = js.native
  def executeOp(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): js.Promise[js.Array[Tensor[Rank]]] = js.native
}

