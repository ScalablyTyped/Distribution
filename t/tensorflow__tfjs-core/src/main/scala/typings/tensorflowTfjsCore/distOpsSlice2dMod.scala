package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsSlice2dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/slice2d", "slice2d")
  @js.native
  val slice2d: js.Function3[
    /* x */ Tensor2D | TensorLike, 
    /* begin */ js.Tuple2[Double, Double], 
    /* size */ js.Tuple2[Double, Double], 
    Tensor2D
  ] = js.native
}
