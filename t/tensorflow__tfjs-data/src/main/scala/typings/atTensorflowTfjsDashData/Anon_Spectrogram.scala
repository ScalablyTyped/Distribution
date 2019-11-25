package typings.atTensorflowTfjsDashData

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Spectrogram extends js.Object {
  var spectrogram: Tensor3D
  var waveform: Tensor2D
}

object Anon_Spectrogram {
  @scala.inline
  def apply(spectrogram: Tensor3D, waveform: Tensor2D): Anon_Spectrogram = {
    val __obj = js.Dynamic.literal(spectrogram = spectrogram.asInstanceOf[js.Any], waveform = waveform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Spectrogram]
  }
}

