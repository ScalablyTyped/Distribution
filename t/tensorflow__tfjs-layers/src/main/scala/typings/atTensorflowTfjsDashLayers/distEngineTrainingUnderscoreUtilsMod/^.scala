package typings.atTensorflowTfjsDashLayers.distEngineTrainingUnderscoreUtilsMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.temporal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training_utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def computeWeightedLoss(losses: Tensor[Rank], sampleWeights: Tensor[Rank]): Tensor[Rank] = js.native
  def standardizeClassWeights(classWeight: js.Array[ClassWeight], outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  def standardizeClassWeights(classWeight: ClassWeightMap, outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  def standardizeClassWeights(classWeight: ClassWeight, outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  def standardizeSampleWeights(classWeight: js.Array[ClassWeight], outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  def standardizeSampleWeights(classWeight: ClassWeightMap, outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  def standardizeSampleWeights(classWeight: ClassWeight, outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  def standardizeWeights(y: Tensor[Rank]): js.Promise[Tensor[Rank]] = js.native
  def standardizeWeights(y: Tensor[Rank], sampleWeight: Tensor[Rank]): js.Promise[Tensor[Rank]] = js.native
  def standardizeWeights(y: Tensor[Rank], sampleWeight: Tensor[Rank], classWeight: ClassWeight): js.Promise[Tensor[Rank]] = js.native
  @JSName("standardizeWeights")
  def standardizeWeights_temporal(y: Tensor[Rank], sampleWeight: Tensor[Rank], classWeight: ClassWeight, sampleWeightMode: temporal): js.Promise[Tensor[Rank]] = js.native
}

