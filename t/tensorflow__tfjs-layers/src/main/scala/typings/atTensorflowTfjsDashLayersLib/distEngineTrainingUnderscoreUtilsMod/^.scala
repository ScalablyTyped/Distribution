package typings
package atTensorflowTfjsDashLayersLib.distEngineTrainingUnderscoreUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training_utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def computeWeightedLoss(
    losses: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    sampleWeights: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def standardizeClassWeights(classWeight: ClassWeightMap, outputNames: js.Array[java.lang.String]): js.Array[ClassWeight] = js.native
  def standardizeClassWeights(classWeight: ClassWeight, outputNames: js.Array[java.lang.String]): js.Array[ClassWeight] = js.native
  def standardizeClassWeights(classWeight: js.Array[ClassWeight], outputNames: js.Array[java.lang.String]): js.Array[ClassWeight] = js.native
  def standardizeSampleWeights(classWeight: ClassWeightMap, outputNames: js.Array[java.lang.String]): js.Array[ClassWeight] = js.native
  def standardizeSampleWeights(classWeight: ClassWeight, outputNames: js.Array[java.lang.String]): js.Array[ClassWeight] = js.native
  def standardizeSampleWeights(classWeight: js.Array[ClassWeight], outputNames: js.Array[java.lang.String]): js.Array[ClassWeight] = js.native
  def standardizeWeights(
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): js.Promise[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  def standardizeWeights(
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    sampleWeight: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): js.Promise[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  def standardizeWeights(
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    sampleWeight: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    classWeight: ClassWeight
  ): js.Promise[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  @JSName("standardizeWeights")
  def standardizeWeights_temporal(
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    sampleWeight: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    classWeight: ClassWeight,
    sampleWeightMode: atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.temporal
  ): js.Promise[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
}

