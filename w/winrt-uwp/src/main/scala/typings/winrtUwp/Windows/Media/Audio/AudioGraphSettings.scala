package typings.winrtUwp.Windows.Media.Audio

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Media.AudioProcessing
import typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import typings.winrtUwp.Windows.Media.Render.AudioRenderCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents initialization settings for an audio graph. Set the properties of this object to your desired values and then call AudioGraph::CreateAsync to create a new audio graph instance with the specified settings. */
trait AudioGraphSettings extends StObject {
  
  /** Gets or sets a value that indicates the audio render category setting for the audio graph. */
  var audioRenderCategory: AudioRenderCategory
  
  /** Gets or sets a value that indicates the desired audio processing mode setting for the audio graph. */
  var desiredRenderDeviceAudioProcessing: AudioProcessing
  
  /** Gets or sets the desired number of samples per quantum defined for the audio graph. */
  var desiredSamplesPerQuantum: Double
  
  /** Gets or sets the audio encoding properties setting for the audio graph. */
  var encodingProperties: AudioEncodingProperties
  
  /** Gets or sets an object that represents the primary render device for the audio graph. */
  var primaryRenderDevice: DeviceInformation
  
  /** Gets or sets the quantum size selection mode for the audio graph. */
  var quantumSizeSelectionMode: QuantumSizeSelectionMode
}
object AudioGraphSettings {
  
  inline def apply(
    audioRenderCategory: AudioRenderCategory,
    desiredRenderDeviceAudioProcessing: AudioProcessing,
    desiredSamplesPerQuantum: Double,
    encodingProperties: AudioEncodingProperties,
    primaryRenderDevice: DeviceInformation,
    quantumSizeSelectionMode: QuantumSizeSelectionMode
  ): AudioGraphSettings = {
    val __obj = js.Dynamic.literal(audioRenderCategory = audioRenderCategory.asInstanceOf[js.Any], desiredRenderDeviceAudioProcessing = desiredRenderDeviceAudioProcessing.asInstanceOf[js.Any], desiredSamplesPerQuantum = desiredSamplesPerQuantum.asInstanceOf[js.Any], encodingProperties = encodingProperties.asInstanceOf[js.Any], primaryRenderDevice = primaryRenderDevice.asInstanceOf[js.Any], quantumSizeSelectionMode = quantumSizeSelectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioGraphSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioGraphSettings] (val x: Self) extends AnyVal {
    
    inline def setAudioRenderCategory(value: AudioRenderCategory): Self = StObject.set(x, "audioRenderCategory", value.asInstanceOf[js.Any])
    
    inline def setDesiredRenderDeviceAudioProcessing(value: AudioProcessing): Self = StObject.set(x, "desiredRenderDeviceAudioProcessing", value.asInstanceOf[js.Any])
    
    inline def setDesiredSamplesPerQuantum(value: Double): Self = StObject.set(x, "desiredSamplesPerQuantum", value.asInstanceOf[js.Any])
    
    inline def setEncodingProperties(value: AudioEncodingProperties): Self = StObject.set(x, "encodingProperties", value.asInstanceOf[js.Any])
    
    inline def setPrimaryRenderDevice(value: DeviceInformation): Self = StObject.set(x, "primaryRenderDevice", value.asInstanceOf[js.Any])
    
    inline def setQuantumSizeSelectionMode(value: QuantumSizeSelectionMode): Self = StObject.set(x, "quantumSizeSelectionMode", value.asInstanceOf[js.Any])
  }
}
