package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sparseReshapeMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/sparse/sparse_reshape", "sparseReshape")
  @js.native
  val sparseReshape: js.Function3[
    /* inputIndices */ Tensor2D | TensorLike, 
    /* inputShape */ Tensor1D | TensorLike, 
    /* newShape */ Tensor1D | TensorLike, 
    NamedTensorMap
  ] = js.native
}
