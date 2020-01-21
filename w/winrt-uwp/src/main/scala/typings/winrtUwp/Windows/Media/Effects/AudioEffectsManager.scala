package typings.winrtUwp.Windows.Media.Effects

import typings.winrtUwp.Windows.Media.AudioProcessing
import typings.winrtUwp.Windows.Media.Capture.MediaCategory
import typings.winrtUwp.Windows.Media.Render.AudioRenderCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for creating audio capture and render effects manager objects. */
@JSGlobal("Windows.Media.Effects.AudioEffectsManager")
@js.native
abstract class AudioEffectsManager () extends js.Object

/* static members */
@JSGlobal("Windows.Media.Effects.AudioEffectsManager")
@js.native
object AudioEffectsManager extends js.Object {
  /**
    * Creates a AudioCaptureEffectsManager object for the specified device for a specific media category.
    * @param deviceId The device id.
    * @param category The media category.
    * @return The new audio capture effects manager.
    */
  def createAudioCaptureEffectsManager(deviceId: String, category: MediaCategory): AudioCaptureEffectsManager = js.native
  /**
    * Creates a AudioCaptureEffectsManager object for the specified device for a specific media category and audio processing mode.
    * @param deviceId The device id.
    * @param category The media category.
    * @param mode The audio processing mode.
    * @return The new audio capture effects manager.
    */
  def createAudioCaptureEffectsManager(deviceId: String, category: MediaCategory, mode: AudioProcessing): AudioCaptureEffectsManager = js.native
  /**
    * Creates a AudioRenderEffectsManager object for the specified device for a specific media category and audio processing mode.
    * @param deviceId The device id.
    * @param category The audio render category.
    * @return The new audio render effects manager.
    */
  def createAudioRenderEffectsManager(deviceId: String, category: AudioRenderCategory): AudioRenderEffectsManager = js.native
  /**
    * Creates a AudioRenderEffectsManager object for the specified device for a specific media category.
    * @param deviceId The device id.
    * @param category The audio render category.
    * @param mode The audio precessing mode.
    * @return The new audio render effects manager.
    */
  def createAudioRenderEffectsManager(deviceId: String, category: AudioRenderCategory, mode: AudioProcessing): AudioRenderEffectsManager = js.native
}

