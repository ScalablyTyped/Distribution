package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/linalg/qr", JSImport.Namespace)
@js.native
object qrMod extends js.Object {
  
  val qr: js.Function2[
    /* x */ Tensor[Rank], 
    /* fullMatrices */ js.UndefOr[Boolean], 
    js.Tuple2[Tensor[Rank], Tensor[Rank]]
  ] = js.native
}
