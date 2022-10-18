package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLayersPreprocessingPreprocessingUtilsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/preprocessing/preprocessing_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encodeCategoricalInputs(inputs: js.Array[Tensor[Rank]], outputMode: OutputMode, depth: Double): Tensor[Rank] | js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeCategoricalInputs")(inputs.asInstanceOf[js.Any], outputMode.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank] | js.Array[Tensor[Rank]]]
  inline def encodeCategoricalInputs(
    inputs: js.Array[Tensor[Rank]],
    outputMode: OutputMode,
    depth: Double,
    weights: Tensor1D | Tensor2D
  ): Tensor[Rank] | js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeCategoricalInputs")(inputs.asInstanceOf[js.Any], outputMode.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank] | js.Array[Tensor[Rank]]]
  inline def encodeCategoricalInputs(inputs: js.Array[Tensor[Rank]], outputMode: OutputMode, depth: Double, weights: TensorLike): Tensor[Rank] | js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeCategoricalInputs")(inputs.asInstanceOf[js.Any], outputMode.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank] | js.Array[Tensor[Rank]]]
  inline def encodeCategoricalInputs(inputs: Tensor[Rank], outputMode: OutputMode, depth: Double): Tensor[Rank] | js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeCategoricalInputs")(inputs.asInstanceOf[js.Any], outputMode.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank] | js.Array[Tensor[Rank]]]
  inline def encodeCategoricalInputs(inputs: Tensor[Rank], outputMode: OutputMode, depth: Double, weights: Tensor1D | Tensor2D): Tensor[Rank] | js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeCategoricalInputs")(inputs.asInstanceOf[js.Any], outputMode.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank] | js.Array[Tensor[Rank]]]
  inline def encodeCategoricalInputs(inputs: Tensor[Rank], outputMode: OutputMode, depth: Double, weights: TensorLike): Tensor[Rank] | js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeCategoricalInputs")(inputs.asInstanceOf[js.Any], outputMode.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank] | js.Array[Tensor[Rank]]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.oneHot
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.multiHot
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.count
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tfIdf
  */
  trait OutputMode extends StObject
  object OutputMode {
    
    inline def count: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.count = "count".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.count]
    
    inline def int: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int = "int".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int]
    
    inline def multiHot: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.multiHot = "multiHot".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.multiHot]
    
    inline def oneHot: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.oneHot = "oneHot".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.oneHot]
    
    inline def tfIdf: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tfIdf = "tfIdf".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tfIdf]
  }
}
