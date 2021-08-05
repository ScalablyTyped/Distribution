package typings.tensorflowTfjsData

import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Spectrogram extends StObject {
    
    var spectrogram: Tensor3D
    
    var waveform: Tensor2D
  }
  object Spectrogram {
    
    inline def apply(spectrogram: Tensor3D, waveform: Tensor2D): Spectrogram = {
      val __obj = js.Dynamic.literal(spectrogram = spectrogram.asInstanceOf[js.Any], waveform = waveform.asInstanceOf[js.Any])
      __obj.asInstanceOf[Spectrogram]
    }
    
    extension [Self <: Spectrogram](x: Self) {
      
      inline def setSpectrogram(value: Tensor3D): Self = StObject.set(x, "spectrogram", value.asInstanceOf[js.Any])
      
      inline def setWaveform(value: Tensor2D): Self = StObject.set(x, "waveform", value.asInstanceOf[js.Any])
    }
  }
}
