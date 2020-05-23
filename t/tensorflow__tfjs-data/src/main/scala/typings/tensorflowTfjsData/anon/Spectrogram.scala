package typings.tensorflowTfjsData.anon

import typings.tensorflowTfjsCore.tensorMod.Tensor2D
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spectrogram extends js.Object {
  var spectrogram: Tensor3D
  var waveform: Tensor2D
}

object Spectrogram {
  @scala.inline
  def apply(spectrogram: Tensor3D, waveform: Tensor2D): Spectrogram = {
    val __obj = js.Dynamic.literal(spectrogram = spectrogram.asInstanceOf[js.Any], waveform = waveform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spectrogram]
  }
}

