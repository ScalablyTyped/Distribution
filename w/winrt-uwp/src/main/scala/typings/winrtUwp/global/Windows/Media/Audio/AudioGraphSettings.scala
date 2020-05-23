package typings.winrtUwp.global.Windows.Media.Audio

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Media.AudioProcessing
import typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import typings.winrtUwp.Windows.Media.Render.AudioRenderCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents initialization settings for an audio graph. Set the properties of this object to your desired values and then call AudioGraph::CreateAsync to create a new audio graph instance with the specified settings. */
@JSGlobal("Windows.Media.Audio.AudioGraphSettings")
@js.native
class AudioGraphSettings protected ()
  extends typings.winrtUwp.Windows.Media.Audio.AudioGraphSettings {
  /**
    * Initializes a new instance of the AudioGraphSettings class with initial settings values optimized for the specified AudioRenderCategory .
    * @param audioRenderCategory The AudioRenderCategory that determines the initial settings values.
    */
  def this(audioRenderCategory: AudioRenderCategory) = this()
  /** Gets or sets a value that indicates the audio render category setting for the audio graph. */
  /* CompleteClass */
  override var audioRenderCategory: AudioRenderCategory = js.native
  /** Gets or sets a value that indicates the desired audio processing mode setting for the audio graph. */
  /* CompleteClass */
  override var desiredRenderDeviceAudioProcessing: AudioProcessing = js.native
  /** Gets or sets the desired number of samples per quantum defined for the audio graph. */
  /* CompleteClass */
  override var desiredSamplesPerQuantum: Double = js.native
  /** Gets or sets the audio encoding properties setting for the audio graph. */
  /* CompleteClass */
  override var encodingProperties: AudioEncodingProperties = js.native
  /** Gets or sets an object that represents the primary render device for the audio graph. */
  /* CompleteClass */
  override var primaryRenderDevice: DeviceInformation = js.native
  /** Gets or sets the quantum size selection mode for the audio graph. */
  /* CompleteClass */
  override var quantumSizeSelectionMode: typings.winrtUwp.Windows.Media.Audio.QuantumSizeSelectionMode = js.native
}

