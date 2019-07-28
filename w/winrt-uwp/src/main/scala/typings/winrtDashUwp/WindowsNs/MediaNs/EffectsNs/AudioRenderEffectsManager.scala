package typings.winrtDashUwp.WindowsNs.MediaNs.EffectsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.audiorendereffectschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represent an audio render effects manager which can be used to discover the audio processing chain on a device for a specific media category and audio processing mode. */
@JSGlobal("Windows.Media.Effects.AudioRenderEffectsManager")
@js.native
abstract class AudioRenderEffectsManager () extends js.Object {
  /** Gets the label that is associated with this audio effects provider setting. */
  var effectsProviderSettingsLabel: String = js.native
  /** Gets the thumbnail image that is associated with this audio effects provider. */
  var effectsProviderThumbnail: IRandomAccessStreamWithContentType = js.native
  /** Occurs when audio process chain changes. */
  @JSName("onaudiorendereffectschanged")
  var onaudiorendereffectschanged_Original: TypedEventHandler[AudioRenderEffectsManager, _] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audiorendereffectschanged(`type`: audiorendereffectschanged, listener: TypedEventHandler[AudioRenderEffectsManager, _]): Unit = js.native
  /**
    * Gets the list of audio effects on the device.
    * @return The list of audio effects.
    */
  def getAudioRenderEffects(): IVectorView[AudioEffect] = js.native
  /** Occurs when audio process chain changes. */
  def onaudiorendereffectschanged(ev: js.Any with WinRTEvent[AudioRenderEffectsManager]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audiorendereffectschanged(`type`: audiorendereffectschanged, listener: TypedEventHandler[AudioRenderEffectsManager, _]): Unit = js.native
  /** Displays the audio effect settings page. */
  def showSettingsUI(): Unit = js.native
}

