package typings.tensorflowTfjsCore.opsMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "spectral")
@js.native
object spectral extends js.Object {
  
  def fft(input: Tensor[Rank]): Tensor[Rank] = js.native
  
  def ifft(input: Tensor[Rank]): Tensor[Rank] = js.native
  
  def irfft(input: Tensor[Rank]): Tensor[Rank] = js.native
  
  def rfft(input: Tensor[Rank]): Tensor[Rank] = js.native
  def rfft(input: Tensor[Rank], fftLength: Double): Tensor[Rank] = js.native
}
