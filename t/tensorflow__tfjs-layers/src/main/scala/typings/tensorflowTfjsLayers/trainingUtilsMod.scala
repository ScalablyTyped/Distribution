package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.temporal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/engine/training_utils", JSImport.Namespace)
@js.native
object trainingUtilsMod extends js.Object {
  
  def computeWeightedLoss(losses: Tensor[Rank], sampleWeights: Tensor[Rank]): Tensor[Rank] = js.native
  
  def standardizeClassWeights(classWeight: js.Array[ClassWeight], outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  def standardizeClassWeights(classWeight: ClassWeightMap, outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  def standardizeClassWeights(classWeight: ClassWeight, outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  
  def standardizeSampleWeights(classWeight: js.Array[ClassWeight], outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  def standardizeSampleWeights(classWeight: ClassWeightMap, outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  def standardizeSampleWeights(classWeight: ClassWeight, outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  
  def standardizeWeights(y: Tensor[Rank]): js.Promise[Tensor[Rank]] = js.native
  def standardizeWeights(y: Tensor[Rank], sampleWeight: js.UndefOr[scala.Nothing], classWeight: ClassWeight): js.Promise[Tensor[Rank]] = js.native
  def standardizeWeights(y: Tensor[Rank], sampleWeight: Tensor[Rank]): js.Promise[Tensor[Rank]] = js.native
  def standardizeWeights(y: Tensor[Rank], sampleWeight: Tensor[Rank], classWeight: ClassWeight): js.Promise[Tensor[Rank]] = js.native
  @JSName("standardizeWeights")
  def standardizeWeights_temporal(
    y: Tensor[Rank],
    sampleWeight: js.UndefOr[scala.Nothing],
    classWeight: js.UndefOr[scala.Nothing],
    sampleWeightMode: temporal
  ): js.Promise[Tensor[Rank]] = js.native
  @JSName("standardizeWeights")
  def standardizeWeights_temporal(
    y: Tensor[Rank],
    sampleWeight: js.UndefOr[scala.Nothing],
    classWeight: ClassWeight,
    sampleWeightMode: temporal
  ): js.Promise[Tensor[Rank]] = js.native
  @JSName("standardizeWeights")
  def standardizeWeights_temporal(
    y: Tensor[Rank],
    sampleWeight: Tensor[Rank],
    classWeight: js.UndefOr[scala.Nothing],
    sampleWeightMode: temporal
  ): js.Promise[Tensor[Rank]] = js.native
  @JSName("standardizeWeights")
  def standardizeWeights_temporal(y: Tensor[Rank], sampleWeight: Tensor[Rank], classWeight: ClassWeight, sampleWeightMode: temporal): js.Promise[Tensor[Rank]] = js.native
  
  type ClassWeight = NumberDictionary[Double]
  
  type ClassWeightMap = StringDictionary[ClassWeight]
}
