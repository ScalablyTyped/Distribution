package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.temporal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEngineTrainingUtilsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeWeightedLoss(losses: Tensor[Rank], sampleWeights: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeWeightedLoss")(losses.asInstanceOf[js.Any], sampleWeights.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def standardizeClassWeights(classWeight: js.Array[ClassWeight], outputNames: js.Array[String]): js.Array[ClassWeight] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeClassWeights")(classWeight.asInstanceOf[js.Any], outputNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[ClassWeight]]
  inline def standardizeClassWeights(classWeight: ClassWeightMap, outputNames: js.Array[String]): js.Array[ClassWeight] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeClassWeights")(classWeight.asInstanceOf[js.Any], outputNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[ClassWeight]]
  inline def standardizeClassWeights(classWeight: ClassWeight, outputNames: js.Array[String]): js.Array[ClassWeight] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeClassWeights")(classWeight.asInstanceOf[js.Any], outputNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[ClassWeight]]
  
  inline def standardizeSampleWeights(classWeight: js.Array[ClassWeight], outputNames: js.Array[String]): js.Array[ClassWeight] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeSampleWeights")(classWeight.asInstanceOf[js.Any], outputNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[ClassWeight]]
  inline def standardizeSampleWeights(classWeight: ClassWeightMap, outputNames: js.Array[String]): js.Array[ClassWeight] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeSampleWeights")(classWeight.asInstanceOf[js.Any], outputNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[ClassWeight]]
  inline def standardizeSampleWeights(classWeight: ClassWeight, outputNames: js.Array[String]): js.Array[ClassWeight] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeSampleWeights")(classWeight.asInstanceOf[js.Any], outputNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[ClassWeight]]
  
  inline def standardizeWeights(y: Tensor[Rank]): js.Promise[Tensor[Rank]] = ^.asInstanceOf[js.Dynamic].applyDynamic("standardizeWeights")(y.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tensor[Rank]]]
  inline def standardizeWeights(y: Tensor[Rank], sampleWeight: Unit, classWeight: ClassWeight): js.Promise[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeWeights")(y.asInstanceOf[js.Any], sampleWeight.asInstanceOf[js.Any], classWeight.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor[Rank]]]
  inline def standardizeWeights(y: Tensor[Rank], sampleWeight: Tensor[Rank]): js.Promise[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeWeights")(y.asInstanceOf[js.Any], sampleWeight.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor[Rank]]]
  inline def standardizeWeights(y: Tensor[Rank], sampleWeight: Tensor[Rank], classWeight: ClassWeight): js.Promise[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeWeights")(y.asInstanceOf[js.Any], sampleWeight.asInstanceOf[js.Any], classWeight.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor[Rank]]]
  
  inline def standardizeWeights_temporal(y: Tensor[Rank], sampleWeight: Unit, classWeight: Unit, sampleWeightMode: temporal): js.Promise[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeWeights")(y.asInstanceOf[js.Any], sampleWeight.asInstanceOf[js.Any], classWeight.asInstanceOf[js.Any], sampleWeightMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor[Rank]]]
  inline def standardizeWeights_temporal(y: Tensor[Rank], sampleWeight: Unit, classWeight: ClassWeight, sampleWeightMode: temporal): js.Promise[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeWeights")(y.asInstanceOf[js.Any], sampleWeight.asInstanceOf[js.Any], classWeight.asInstanceOf[js.Any], sampleWeightMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor[Rank]]]
  inline def standardizeWeights_temporal(y: Tensor[Rank], sampleWeight: Tensor[Rank], classWeight: Unit, sampleWeightMode: temporal): js.Promise[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeWeights")(y.asInstanceOf[js.Any], sampleWeight.asInstanceOf[js.Any], classWeight.asInstanceOf[js.Any], sampleWeightMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor[Rank]]]
  inline def standardizeWeights_temporal(y: Tensor[Rank], sampleWeight: Tensor[Rank], classWeight: ClassWeight, sampleWeightMode: temporal): js.Promise[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeWeights")(y.asInstanceOf[js.Any], sampleWeight.asInstanceOf[js.Any], classWeight.asInstanceOf[js.Any], sampleWeightMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor[Rank]]]
  
  type ClassWeight = NumberDictionary[Double]
  
  type ClassWeightMap = StringDictionary[ClassWeight]
}
