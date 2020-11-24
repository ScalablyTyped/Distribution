package typings.winrtUwp.Windows.Media.SpeechSynthesis

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the functionality of an installed speech synthesis engine (voice). */
@js.native
trait SpeechSynthesizer extends js.Object {
  
  /** Closes the SpeechSynthesizer and releases system resources. */
  def close(): Unit = js.native
  
  /**
    * Asynchronously generate speech output from a string containing Speech Synthesis Markup Language (SSML).
    * @param Ssml The SSML-modified text to speak.
    * @return A SpeechSynthesisStream that represents the speech generated from the Speech Synthesis Markup Language (SSML).
    */
  def synthesizeSsmlToStreamAsync(Ssml: String): IPromiseWithIAsyncOperation[SpeechSynthesisStream] = js.native
  
  /**
    * Asynchronously generate speech output from a string.
    * @param text The text to speak.
    * @return A SpeechSynthesisStream that represents the speech generated from the text.
    */
  def synthesizeTextToStreamAsync(text: String): IPromiseWithIAsyncOperation[SpeechSynthesisStream] = js.native
  
  /** Gets or sets the speech synthesis engine (voice). */
  var voice: VoiceInformation = js.native
}
object SpeechSynthesizer {
  
  @scala.inline
  def apply(
    close: () => Unit,
    synthesizeSsmlToStreamAsync: String => IPromiseWithIAsyncOperation[SpeechSynthesisStream],
    synthesizeTextToStreamAsync: String => IPromiseWithIAsyncOperation[SpeechSynthesisStream],
    voice: VoiceInformation
  ): SpeechSynthesizer = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), synthesizeSsmlToStreamAsync = js.Any.fromFunction1(synthesizeSsmlToStreamAsync), synthesizeTextToStreamAsync = js.Any.fromFunction1(synthesizeTextToStreamAsync), voice = voice.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesizer]
  }
  
  @scala.inline
  implicit class SpeechSynthesizerOps[Self <: SpeechSynthesizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSynthesizeSsmlToStreamAsync(value: String => IPromiseWithIAsyncOperation[SpeechSynthesisStream]): Self = this.set("synthesizeSsmlToStreamAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSynthesizeTextToStreamAsync(value: String => IPromiseWithIAsyncOperation[SpeechSynthesisStream]): Self = this.set("synthesizeTextToStreamAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVoice(value: VoiceInformation): Self = this.set("voice", value.asInstanceOf[js.Any])
  }
}
