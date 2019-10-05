package typings.atTensorflowTfjsDashLayers.distEngineTrainingMod

import org.scalablytyped.runtime.StringDictionary
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training", "standardizeInputData")
@js.native
object standardizeInputData extends js.Object {
  def apply(data: js.Array[Tensor[Rank]], names: js.Array[String]): js.Array[Tensor[Rank]] = js.native
  def apply(data: js.Array[Tensor[Rank]], names: js.Array[String], shapes: js.Array[Shape]): js.Array[Tensor[Rank]] = js.native
  def apply(
    data: js.Array[Tensor[Rank]],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Boolean
  ): js.Array[Tensor[Rank]] = js.native
  def apply(
    data: js.Array[Tensor[Rank]],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Boolean,
    exceptionPrefix: String
  ): js.Array[Tensor[Rank]] = js.native
  def apply(data: StringDictionary[Tensor[Rank]], names: js.Array[String]): js.Array[Tensor[Rank]] = js.native
  def apply(data: StringDictionary[Tensor[Rank]], names: js.Array[String], shapes: js.Array[Shape]): js.Array[Tensor[Rank]] = js.native
  def apply(
    data: StringDictionary[Tensor[Rank]],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Boolean
  ): js.Array[Tensor[Rank]] = js.native
  def apply(
    data: StringDictionary[Tensor[Rank]],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Boolean,
    exceptionPrefix: String
  ): js.Array[Tensor[Rank]] = js.native
  def apply(data: Tensor[Rank], names: js.Array[String]): js.Array[Tensor[Rank]] = js.native
  def apply(data: Tensor[Rank], names: js.Array[String], shapes: js.Array[Shape]): js.Array[Tensor[Rank]] = js.native
  def apply(data: Tensor[Rank], names: js.Array[String], shapes: js.Array[Shape], checkBatchAxis: Boolean): js.Array[Tensor[Rank]] = js.native
  def apply(
    data: Tensor[Rank],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Boolean,
    exceptionPrefix: String
  ): js.Array[Tensor[Rank]] = js.native
}

