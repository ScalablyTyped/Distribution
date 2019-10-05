package typings.winrtDashUwp.Windows.Media.Audio

import typings.winrtDashUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtDashUwp.Windows.Media.AudioProcessing
import typings.winrtDashUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import typings.winrtDashUwp.Windows.Media.Render.AudioRenderCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents initialization settings for an audio graph. Set the properties of this object to your desired values and then call AudioGraph::CreateAsync to create a new audio graph instance with the specified settings. */
@JSGlobal("Windows.Media.Audio.AudioGraphSettings")
@js.native
class AudioGraphSettings protected () extends js.Object {
  /**
    * Initializes a new instance of the AudioGraphSettings class with initial settings values optimized for the specified AudioRenderCategory .
    * @param audioRenderCategory The AudioRenderCategory that determines the initial settings values.
    */
  def this(audioRenderCategory: AudioRenderCategory) = this()
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

