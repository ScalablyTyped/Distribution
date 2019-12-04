package typings.atTensorflowTfjsDashConverter

import typings.atTensorflowTfjsDashConverter.distSrcDataTypesMod.NamedTensorsMap
import typings.atTensorflowTfjsDashConverter.distSrcExecutorExecutionUnderscoreContextMod.ExecutionContext
import typings.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod.Node
import typings.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod.ValueType
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/operations/executors/utils", JSImport.Namespace)
@js.native
object distSrcOperationsExecutorsUtilsMod extends js.Object {
  def getNodeNameAndIndex(inputName: String): js.Tuple2[String, Double] = js.native
  def getNodeNameAndIndex(inputName: String, context: ExecutionContext): js.Tuple2[String, Double] = js.native
  def getParamValue(paramName: String, node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): ValueType = js.native
  def getTensor(name: String, tensorsMap: NamedTensorsMap, context: ExecutionContext): Tensor[Rank] = js.native
  def getTensorsForCurrentContenxt(name: String, tensorsMap: NamedTensorsMap, context: ExecutionContext): js.Array[Tensor[Rank]] = js.native
  def parseNodeName(name: String): js.Tuple2[String, Double] = js.native
  def split(arr: js.Array[Double], size: Double): js.Array[js.Array[Double]] = js.native
}

