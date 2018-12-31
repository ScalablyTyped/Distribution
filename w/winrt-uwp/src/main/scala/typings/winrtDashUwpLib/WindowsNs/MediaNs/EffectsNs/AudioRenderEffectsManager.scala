package typings
package winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represent an audio render effects manager which can be used to discover the audio processing chain on a device for a specific media category and audio processing mode. */
@JSGlobal("Windows.Media.Effects.AudioRenderEffectsManager")
@js.native
abstract class AudioRenderEffectsManager () extends js.Object {
  /** Gets the label that is associated with this audio effects provider setting. */
  var effectsProviderSettingsLabel: java.lang.String = js.native
  /** Gets the thumbnail image that is associated with this audio effects provider. */
  var effectsProviderThumbnail: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType = js.native
  /** Occurs when audio process chain changes. */
  @JSName("onaudiorendereffectschanged")
  var onaudiorendereffectschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioRenderEffectsManager, _] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audiorendereffectschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.audiorendereffectschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioRenderEffectsManager, _]
  ): scala.Unit = js.native
  /**
    * Gets the list of audio effects on the device.
    * @return The list of audio effects.
    */
  def getAudioRenderEffects(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[AudioEffect] = js.native
  /** Occurs when audio process chain changes. */
  def onaudiorendereffectschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[AudioRenderEffectsManager]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audiorendereffectschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.audiorendereffectschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioRenderEffectsManager, _]
  ): scala.Unit = js.native
  /** Displays the audio effect settings page. */
  def showSettingsUI(): scala.Unit = js.native
}

