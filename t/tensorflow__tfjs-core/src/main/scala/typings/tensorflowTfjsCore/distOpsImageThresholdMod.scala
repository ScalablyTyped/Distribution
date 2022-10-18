package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsImageThresholdMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/image/threshold", "threshold")
  @js.native
  val threshold: js.Function4[
    /* image */ Tensor3D | TensorLike, 
    /* method */ js.UndefOr[String], 
    /* inverted */ js.UndefOr[Boolean], 
    /* threshValue */ js.UndefOr[Double], 
    Tensor3D
  ] = js.native
}
