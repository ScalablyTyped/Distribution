package typings
package atTensorflowTfjsDashDataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Spectrogram extends js.Object {
  var spectrogram: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D
  var waveform: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
}

object Anon_Spectrogram {
  @scala.inline
  def apply(
    spectrogram: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D,
    waveform: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ): Anon_Spectrogram = {
    val __obj = js.Dynamic.literal(spectrogram = spectrogram, waveform = waveform)
  
    __obj.asInstanceOf[Anon_Spectrogram]
  }
}

