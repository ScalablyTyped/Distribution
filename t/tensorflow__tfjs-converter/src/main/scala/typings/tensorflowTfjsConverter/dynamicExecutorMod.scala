package typings.tensorflowTfjsConverter

import typings.tensorflowTfjsConverter.executionContextMod.ExecutionContext
import typings.tensorflowTfjsConverter.operationsTypesMod.Node
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.dynamic
import typings.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/operations/executors/dynamic_executor", JSImport.Namespace)
@js.native
object dynamicExecutorMod extends js.Object {
  val CATEGORY: dynamic = js.native
  def executeOp(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): js.Promise[js.Array[Tensor_[Rank]]] = js.native
}

