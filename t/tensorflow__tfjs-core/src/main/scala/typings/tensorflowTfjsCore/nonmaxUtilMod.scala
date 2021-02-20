package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.IouThreshold
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nonmaxUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/nonmax_util", "nonMaxSuppSanityCheck")
  @js.native
  def nonMaxSuppSanityCheck(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): IouThreshold = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/nonmax_util", "nonMaxSuppSanityCheck")
  @js.native
  def nonMaxSuppSanityCheck(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): IouThreshold = js.native
}
