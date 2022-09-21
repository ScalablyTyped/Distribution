package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.ScalarLike
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sparseFillEmptyRowsMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/sparse/sparse_fill_empty_rows", "sparseFillEmptyRows")
  @js.native
  val sparseFillEmptyRows: js.Function4[
    /* indices */ Tensor2D | TensorLike, 
    /* values */ Tensor1D | TensorLike, 
    /* denseShape */ Tensor1D | TensorLike, 
    /* defaultValue */ Scalar | ScalarLike, 
    NamedTensorMap
  ] = js.native
}
