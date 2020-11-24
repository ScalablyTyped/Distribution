package typings.winrtUwp.Windows.Media.Audio

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Media.AudioProcessing
import typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import typings.winrtUwp.Windows.Media.Render.AudioRenderCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents initialization settings for an audio graph. Set the properties of this object to your desired values and then call AudioGraph::CreateAsync to create a new audio graph instance with the specified settings. */
@js.native
trait AudioGraphSettings extends js.Object {
  
  /** Gets or sets a value that indicates the audio render category setting for the audio graph. */
  var audioRenderCategory: AudioRenderCategory = js.native
  
  /** Gets or sets a value that indicates the desired audio processing mode setting for the audio graph. */
  var desiredRenderDeviceAudioProcessing: AudioProcessing = js.native
  
  /** Gets or sets the desired number of samples per quantum defined for the audio graph. */
  var desiredSamplesPerQuantum: Double = js.native
  
  /** Gets or sets the audio encoding properties setting for the audio graph. */
  var encodingProperties: AudioEncodingProperties = js.native
  
  /** Gets or sets an object that represents the primary render device for the audio graph. */
  var primaryRenderDevice: DeviceInformation = js.native
  
  /** Gets or sets the quantum size selection mode for the audio graph. */
  var quantumSizeSelectionMode: QuantumSizeSelectionMode = js.native
}
object AudioGraphSettings {
  
  @scala.inline
  def apply(
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
  implicit class AudioGraphSettingsOps[Self <: AudioGraphSettings] (val x: Self) extends AnyVal {
    
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
    def setAudioRenderCategory(value: AudioRenderCategory): Self = this.set("audioRenderCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredRenderDeviceAudioProcessing(value: AudioProcessing): Self = this.set("desiredRenderDeviceAudioProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredSamplesPerQuantum(value: Double): Self = this.set("desiredSamplesPerQuantum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingProperties(value: AudioEncodingProperties): Self = this.set("encodingProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryRenderDevice(value: DeviceInformation): Self = this.set("primaryRenderDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantumSizeSelectionMode(value: QuantumSizeSelectionMode): Self = this.set("quantumSizeSelectionMode", value.asInstanceOf[js.Any])
  }
}
