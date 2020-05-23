package typings.winrtUwp.Windows.Media.SpeechSynthesis

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the functionality of an installed speech synthesis engine (voice). */
trait SpeechSynthesizer extends js.Object {
  /** Gets or sets the speech synthesis engine (voice). */
  var voice: VoiceInformation
  /** Closes the SpeechSynthesizer and releases system resources. */
  def close(): Unit
  /**
    * Asynchronously generate speech output from a string containing Speech Synthesis Markup Language (SSML).
    * @param Ssml The SSML-modified text to speak.
    * @return A SpeechSynthesisStream that represents the speech generated from the Speech Synthesis Markup Language (SSML).
    */
  def synthesizeSsmlToStreamAsync(Ssml: String): IPromiseWithIAsyncOperation[SpeechSynthesisStream]
  /**
    * Asynchronously generate speech output from a string.
    * @param text The text to speak.
    * @return A SpeechSynthesisStream that represents the speech generated from the text.
    */
  def synthesizeTextToStreamAsync(text: String): IPromiseWithIAsyncOperation[SpeechSynthesisStream]
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
}

