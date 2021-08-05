package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchnormUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/batchnorm_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def xAs4D[R /* <: Rank */](x: Tensor[R]): Tensor[R4] = ^.asInstanceOf[js.Dynamic].applyDynamic("xAs4D")(x.asInstanceOf[js.Any]).asInstanceOf[Tensor[R4]]
}
