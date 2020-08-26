package typings.tensorflowTfjsData.anon

import typings.tensorflowTfjsCore.tensorMod.Tensor2D
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spectrogram extends js.Object {
  var spectrogram: Tensor3D = js.native
  var waveform: Tensor2D = js.native
}

object Spectrogram {
  @scala.inline
  def apply(spectrogram: Tensor3D, waveform: Tensor2D): Spectrogram = {
    val __obj = js.Dynamic.literal(spectrogram = spectrogram.asInstanceOf[js.Any], waveform = waveform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spectrogram]
  }
  @scala.inline
  implicit class SpectrogramOps[Self <: Spectrogram] (val x: Self) extends AnyVal {
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
    def setSpectrogram(value: Tensor3D): Self = this.set("spectrogram", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaveform(value: Tensor2D): Self = this.set("waveform", value.asInstanceOf[js.Any])
  }
  
}

