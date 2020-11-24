package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/dropout_util", JSImport.Namespace)
@js.native
object dropoutUtilMod extends js.Object {
  
  def getNoiseShape(x: Tensor[Rank]): js.Array[Double] = js.native
  def getNoiseShape(x: Tensor[Rank], noiseShape: js.Array[Double]): js.Array[Double] = js.native
}
