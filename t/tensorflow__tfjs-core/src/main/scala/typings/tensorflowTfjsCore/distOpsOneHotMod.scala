package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsOneHotMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/one_hot", "oneHot")
  @js.native
  val oneHot: js.Function5[
    /* indices */ Tensor[Rank] | TensorLike, 
    /* depth */ Double, 
    /* onValue */ js.UndefOr[Double], 
    /* offValue */ js.UndefOr[Double], 
    /* dtype */ js.UndefOr[DataType], 
    Tensor[Rank]
  ] = js.native
}
