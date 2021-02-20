package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reverse3dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/reverse_3d", "reverse3d")
  @js.native
  val reverse3d: js.Function2[
    /* x */ Tensor3D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor3D
  ] = js.native
}
