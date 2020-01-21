package typings.winrtUwp.Windows.Media.Effects

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.audiocaptureeffectschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represent an audio capture effects manager which can be used to discover the audio processing chain on a device for a specific media category and audio processing mode. */
@JSGlobal("Windows.Media.Effects.AudioCaptureEffectsManager")
@js.native
abstract class AudioCaptureEffectsManager () extends js.Object {
  /** Occurs when audio process chain changes. */
  @JSName("onaudiocaptureeffectschanged")
  var onaudiocaptureeffectschanged_Original: TypedEventHandler[AudioCaptureEffectsManager, _] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audiocaptureeffectschanged(`type`: audiocaptureeffectschanged, listener: TypedEventHandler[AudioCaptureEffectsManager, _]): Unit = js.native
  /**
    * Gets the list of audio effects on the device.
    * @return The list of audio effects.
    */
  def getAudioCaptureEffects(): IVectorView[AudioEffect] = js.native
  /** Occurs when audio process chain changes. */
  def onaudiocaptureeffectschanged(ev: js.Any with WinRTEvent[AudioCaptureEffectsManager]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audiocaptureeffectschanged(`type`: audiocaptureeffectschanged, listener: TypedEventHandler[AudioCaptureEffectsManager, _]): Unit = js.native
}

