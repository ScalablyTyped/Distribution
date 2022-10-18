package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsRaggedRangeMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ragged_range", "raggedRange")
  @js.native
  val raggedRange: js.Function3[
    /* starts */ Tensor[Rank] | TensorLike, 
    /* limits */ Tensor[Rank] | TensorLike, 
    /* deltas */ Tensor[Rank] | TensorLike, 
    NamedTensorMap
  ] = js.native
}
