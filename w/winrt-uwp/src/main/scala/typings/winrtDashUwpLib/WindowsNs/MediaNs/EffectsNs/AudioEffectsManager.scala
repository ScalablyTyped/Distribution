package typings
package winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for creating audio capture and render effects manager objects. */
@JSGlobal("Windows.Media.Effects.AudioEffectsManager")
@js.native
abstract class AudioEffectsManager () extends js.Object

/** Provides functionality for creating audio capture and render effects manager objects. */
@JSGlobal("Windows.Media.Effects.AudioEffectsManager")
@js.native
object AudioEffectsManager extends js.Object {
  /**
                   * Creates a AudioCaptureEffectsManager object for the specified device for a specific media category.
                   * @param deviceId The device id.
                   * @param category The media category.
                   * @return The new audio capture effects manager.
                   */
  def createAudioCaptureEffectsManager(deviceId: java.lang.String, category: winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaCategory): winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioCaptureEffectsManager = js.native
  /**
                   * Creates a AudioCaptureEffectsManager object for the specified device for a specific media category and audio processing mode.
                   * @param deviceId The device id.
                   * @param category The media category.
                   * @param mode The audio processing mode.
                   * @return The new audio capture effects manager.
                   */
  def createAudioCaptureEffectsManager(
    deviceId: java.lang.String,
    category: winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaCategory,
    mode: winrtDashUwpLib.WindowsNs.MediaNs.AudioProcessing
  ): winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioCaptureEffectsManager = js.native
  /**
                   * Creates a AudioRenderEffectsManager object for the specified device for a specific media category and audio processing mode.
                   * @param deviceId The device id.
                   * @param category The audio render category.
                   * @return The new audio render effects manager.
                   */
  def createAudioRenderEffectsManager(
    deviceId: java.lang.String,
    category: winrtDashUwpLib.WindowsNs.MediaNs.RenderNs.AudioRenderCategory
  ): winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioRenderEffectsManager = js.native
  /**
                   * Creates a AudioRenderEffectsManager object for the specified device for a specific media category.
                   * @param deviceId The device id.
                   * @param category The audio render category.
                   * @param mode The audio precessing mode.
                   * @return The new audio render effects manager.
                   */
  def createAudioRenderEffectsManager(
    deviceId: java.lang.String,
    category: winrtDashUwpLib.WindowsNs.MediaNs.RenderNs.AudioRenderCategory,
    mode: winrtDashUwpLib.WindowsNs.MediaNs.AudioProcessing
  ): winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioRenderEffectsManager = js.native
}

