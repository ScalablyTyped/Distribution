package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFft extends js.Object {
  def fft(x: Tensor[Rank]): Tensor[Rank]
  def ifft(x: Tensor[Rank]): Tensor[Rank]
  def irfft(x: Tensor[Rank]): Tensor[Rank]
  def rfft(x: Tensor[Rank]): Tensor[Rank]
}

object AnonFft {
  @scala.inline
  def apply(
    fft: Tensor[Rank] => Tensor[Rank],
    ifft: Tensor[Rank] => Tensor[Rank],
    irfft: Tensor[Rank] => Tensor[Rank],
    rfft: Tensor[Rank] => Tensor[Rank]
  ): AnonFft = {
    val __obj = js.Dynamic.literal(fft = js.Any.fromFunction1(fft), ifft = js.Any.fromFunction1(ifft), irfft = js.Any.fromFunction1(irfft), rfft = js.Any.fromFunction1(rfft))
  
    __obj.asInstanceOf[AnonFft]
  }
}

