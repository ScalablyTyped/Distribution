package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringNGramsMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/string/string_n_grams", "stringNGrams")
  @js.native
  val stringNGrams: js.Function8[
    /* data */ Tensor1D | TensorLike, 
    /* dataSplits */ Tensor[Rank] | TensorLike, 
    /* separator */ String, 
    /* nGramWidths */ js.Array[Double], 
    /* leftPad */ String, 
    /* rightPad */ String, 
    /* padWidth */ Double, 
    /* preserveShortSequences */ Boolean, 
    NamedTensorMap
  ] = js.native
}
