package typings
package winrtDashUwpLib.WindowsNs.MediaNs.AudioNs

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
  def this(audioRenderCategory: winrtDashUwpLib.WindowsNs.MediaNs.RenderNs.AudioRenderCategory) = this()
  /** Gets or sets a value that indicates the audio render category setting for the audio graph. */
  var audioRenderCategory: winrtDashUwpLib.WindowsNs.MediaNs.RenderNs.AudioRenderCategory = js.native
  /** Gets or sets a value that indicates the desired audio processing mode setting for the audio graph. */
  var desiredRenderDeviceAudioProcessing: winrtDashUwpLib.WindowsNs.MediaNs.AudioProcessing = js.native
  /** Gets or sets the desired number of samples per quantum defined for the audio graph. */
  var desiredSamplesPerQuantum: scala.Double = js.native
  /** Gets or sets the audio encoding properties setting for the audio graph. */
  var encodingProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties = js.native
  /** Gets or sets an object that represents the primary render device for the audio graph. */
  var primaryRenderDevice: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation = js.native
  /** Gets or sets the quantum size selection mode for the audio graph. */
  var quantumSizeSelectionMode: QuantumSizeSelectionMode = js.native
}

