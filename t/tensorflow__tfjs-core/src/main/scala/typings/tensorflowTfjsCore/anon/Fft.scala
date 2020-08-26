package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fft extends js.Object {
  def fft(x: Tensor[Rank]): Tensor[Rank] = js.native
  def ifft(x: Tensor[Rank]): Tensor[Rank] = js.native
  def irfft(x: Tensor[Rank]): Tensor[Rank] = js.native
  def rfft(x: Tensor[Rank]): Tensor[Rank] = js.native
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
  @scala.inline
  implicit class FftOps[Self <: Fft] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFft(value: Tensor[Rank] => Tensor[Rank]): Self = this.set("fft", js.Any.fromFunction1(value))
    @scala.inline
    def setIfft(value: Tensor[Rank] => Tensor[Rank]): Self = this.set("ifft", js.Any.fromFunction1(value))
    @scala.inline
    def setIrfft(value: Tensor[Rank] => Tensor[Rank]): Self = this.set("irfft", js.Any.fromFunction1(value))
    @scala.inline
    def setRfft(value: Tensor[Rank] => Tensor[Rank]): Self = this.set("rfft", js.Any.fromFunction1(value))
  }
  
}

