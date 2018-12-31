package typings
package winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represent an audio capture effects manager which can be used to discover the audio processing chain on a device for a specific media category and audio processing mode. */
@JSGlobal("Windows.Media.Effects.AudioCaptureEffectsManager")
@js.native
abstract class AudioCaptureEffectsManager () extends js.Object {
  /** Occurs when audio process chain changes. */
  @JSName("onaudiocaptureeffectschanged")
  var onaudiocaptureeffectschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioCaptureEffectsManager, _] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audiocaptureeffectschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.audiocaptureeffectschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioCaptureEffectsManager, _]
  ): scala.Unit = js.native
  /**
    * Gets the list of audio effects on the device.
    * @return The list of audio effects.
    */
  def getAudioCaptureEffects(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[AudioEffect] = js.native
  /** Occurs when audio process chain changes. */
  def onaudiocaptureeffectschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[AudioCaptureEffectsManager]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audiocaptureeffectschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.audiocaptureeffectschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioCaptureEffectsManager, _]
  ): scala.Unit = js.native
}

