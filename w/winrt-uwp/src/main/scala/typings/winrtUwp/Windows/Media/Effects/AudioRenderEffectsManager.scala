package typings.winrtUwp.Windows.Media.Effects

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.audiorendereffectschanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represent an audio render effects manager which can be used to discover the audio processing chain on a device for a specific media category and audio processing mode. */
@js.native
trait AudioRenderEffectsManager extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audiorendereffectschanged(`type`: audiorendereffectschanged, listener: TypedEventHandler[AudioRenderEffectsManager, js.Any]): Unit = js.native
  
  /** Gets the label that is associated with this audio effects provider setting. */
  var effectsProviderSettingsLabel: String = js.native
  
  /** Gets the thumbnail image that is associated with this audio effects provider. */
  var effectsProviderThumbnail: IRandomAccessStreamWithContentType = js.native
  
  /**
    * Gets the list of audio effects on the device.
    * @return The list of audio effects.
    */
  def getAudioRenderEffects(): IVectorView[AudioEffect] = js.native
  
  /** Occurs when audio process chain changes. */
  def onaudiorendereffectschanged(ev: js.Any & WinRTEvent[AudioRenderEffectsManager]): Unit = js.native
  /** Occurs when audio process chain changes. */
  @JSName("onaudiorendereffectschanged")
  var onaudiorendereffectschanged_Original: TypedEventHandler[AudioRenderEffectsManager, js.Any] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audiorendereffectschanged(`type`: audiorendereffectschanged, listener: TypedEventHandler[AudioRenderEffectsManager, js.Any]): Unit = js.native
  
  /** Displays the audio effect settings page. */
  def showSettingsUI(): Unit = js.native
}
