package typings.winrtUwp.Windows.Media.Audio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an equalizer band for the equalizer effect. */
trait EqualizerBand extends StObject {
  
  /** Gets or sets the bandwidth for the equalizer band. */
  var bandwidth: Double
  
  /** Gets or sets the frequency center for the equalizer band. */
  var frequencyCenter: Double
  
  /** Gets or sets the gain for the equalizer band. */
  var gain: Double
}
object EqualizerBand {
  
  @scala.inline
  def apply(bandwidth: Double, frequencyCenter: Double, gain: Double): EqualizerBand = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], frequencyCenter = frequencyCenter.asInstanceOf[js.Any], gain = gain.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqualizerBand]
  }
  
  @scala.inline
  implicit class EqualizerBandMutableBuilder[Self <: EqualizerBand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandwidth(value: Double): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyCenter(value: Double): Self = StObject.set(x, "frequencyCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
  }
}
