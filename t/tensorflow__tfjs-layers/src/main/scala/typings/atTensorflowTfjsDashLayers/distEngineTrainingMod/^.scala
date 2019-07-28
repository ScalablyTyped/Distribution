package typings.atTensorflowTfjsDashLayers.distEngineTrainingMod

import org.scalablytyped.runtime.StringDictionary
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import typings.atTensorflowTfjsDashLayers.distTypesMod.LossOrMetricFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def checkArrayLengths(inputs: js.Array[Tensor[Rank]], targets: js.Array[Tensor[Rank]]): Unit = js.native
  def checkArrayLengths(inputs: js.Array[Tensor[Rank]], targets: js.Array[Tensor[Rank]], weights: js.Array[Tensor[Rank]]): Unit = js.native
  def collectMetrics(metrics: String, outputNames: js.Array[String]): js.Array[js.Array[String | LossOrMetricFn]] = js.native
  def collectMetrics(metrics: js.Array[String | LossOrMetricFn], outputNames: js.Array[String]): js.Array[js.Array[String | LossOrMetricFn]] = js.native
  def collectMetrics(metrics: StringDictionary[String | LossOrMetricFn], outputNames: js.Array[String]): js.Array[js.Array[String | LossOrMetricFn]] = js.native
  def collectMetrics(metrics: LossOrMetricFn, outputNames: js.Array[String]): js.Array[js.Array[String | LossOrMetricFn]] = js.native
  def isDataArray(x: js.Array[Tensor[Rank]]): Boolean = js.native
  def isDataArray(x: StringDictionary[Tensor[Rank]]): Boolean = js.native
  def isDataArray(x: Tensor[Rank]): Boolean = js.native
  def isDataDict(x: js.Array[Tensor[Rank]]): Boolean = js.native
  def isDataDict(x: StringDictionary[Tensor[Rank]]): Boolean = js.native
  def isDataDict(x: Tensor[Rank]): Boolean = js.native
  def isDataTensor(x: js.Array[Tensor[Rank]]): Boolean = js.native
  def isDataTensor(x: StringDictionary[js.Array[Tensor[Rank]] | Tensor[Rank]]): Boolean = js.native
  def isDataTensor(x: Tensor[Rank]): Boolean = js.native
  def standardizeInputData(data: js.Array[Tensor[Rank]], names: js.Array[String]): js.Array[Tensor[Rank]] = js.native
  def standardizeInputData(data: js.Array[Tensor[Rank]], names: js.Array[String], shapes: js.Array[Shape]): js.Array[Tensor[Rank]] = js.native
  def standardizeInputData(
    data: js.Array[Tensor[Rank]],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Boolean
  ): js.Array[Tensor[Rank]] = js.native
  def standardizeInputData(
    data: js.Array[Tensor[Rank]],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Boolean,
    exceptionPrefix: String
  ): js.Array[Tensor[Rank]] = js.native
  def standardizeInputData(data: StringDictionary[Tensor[Rank]], names: js.Array[String]): js.Array[Tensor[Rank]] = js.native
  def standardizeInputData(data: StringDictionary[Tensor[Rank]], names: js.Array[String], shapes: js.Array[Shape]): js.Array[Tensor[Rank]] = js.native
  def standardizeInputData(
    data: StringDictionary[Tensor[Rank]],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Boolean
  ): js.Array[Tensor[Rank]] = js.native
  def standardizeInputData(
    data: StringDictionary[Tensor[Rank]],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Boolean,
    exceptionPrefix: String
  ): js.Array[Tensor[Rank]] = js.native
  def standardizeInputData(data: Tensor[Rank], names: js.Array[String]): js.Array[Tensor[Rank]] = js.native
  def standardizeInputData(data: Tensor[Rank], names: js.Array[String], shapes: js.Array[Shape]): js.Array[Tensor[Rank]] = js.native
  def standardizeInputData(data: Tensor[Rank], names: js.Array[String], shapes: js.Array[Shape], checkBatchAxis: Boolean): js.Array[Tensor[Rank]] = js.native
  def standardizeInputData(
    data: Tensor[Rank],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Boolean,
    exceptionPrefix: String
  ): js.Array[Tensor[Rank]] = js.native
}

