package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsDropoutUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/dropout_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNoiseShape(x: Tensor[Rank]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNoiseShape")(x.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def getNoiseShape(x: Tensor[Rank], noiseShape: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNoiseShape")(x.asInstanceOf[js.Any], noiseShape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
