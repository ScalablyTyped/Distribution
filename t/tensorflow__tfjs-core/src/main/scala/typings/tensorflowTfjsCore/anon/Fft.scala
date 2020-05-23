package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fft extends js.Object {
  def fft(x: Tensor[Rank]): Tensor[Rank]
  def ifft(x: Tensor[Rank]): Tensor[Rank]
  def irfft(x: Tensor[Rank]): Tensor[Rank]
  def rfft(x: Tensor[Rank]): Tensor[Rank]
}

object Fft {
  @scala.inline
  def apply(
    fft: Tensor[Rank] => Tensor[Rank],
    ifft: Tensor[Rank] => Tensor[Rank],
    irfft: Tensor[Rank] => Tensor[Rank],
    rfft: Tensor[Rank] => Tensor[Rank]
  ): Fft = {
    val __obj = js.Dynamic.literal(fft = js.Any.fromFunction1(fft), ifft = js.Any.fromFunction1(ifft), irfft = js.Any.fromFunction1(irfft), rfft = js.Any.fromFunction1(rfft))
    __obj.asInstanceOf[Fft]
  }
}

