package typings.winrtDashUwp.WindowsNs.MediaNs.SpeechSynthesisNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the functionality of an installed speech synthesis engine (voice). */
@JSGlobal("Windows.Media.SpeechSynthesis.SpeechSynthesizer")
@js.native
/** Initializes a new instance of a SpeechSynthesizer object. */
class SpeechSynthesizer () extends js.Object {
  /** Gets or sets the speech synthesis engine (voice). */
  var voice: VoiceInformation = js.native
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
}

/* static members */
@JSGlobal("Windows.Media.SpeechSynthesis.SpeechSynthesizer")
@js.native
object SpeechSynthesizer extends js.Object {
  /** Gets a collection of all installed speech synthesis engines (voices). */
  var allVoices: IVectorView[VoiceInformation] = js.native
  /** Gets the default speech synthesis engine (voice). */
  var defaultVoice: VoiceInformation = js.native
}

