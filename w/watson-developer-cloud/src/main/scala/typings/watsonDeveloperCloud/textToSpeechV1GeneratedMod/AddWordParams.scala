package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `addWord` operation. */
@js.native
trait AddWordParams extends js.Object {
  /** The customization ID (GUID) of the custom voice model. You must make the request with service credentials created for the instance of the service that owns the custom model. */
  var customization_id: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** **Japanese only.** The part of speech for the word. The service uses the value to produce the correct intonation for the word. You can create only a single entry, with or without a single part of speech, for any word; you cannot create multiple entries with different parts of speech for the same word. For more information, see [Working with Japanese entries](https://cloud.ibm.com/docs/services/text-to-speech/custom-rules.html#jaNotes). */
  var part_of_speech: js.UndefOr[PartOfSpeech | String] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** The phonetic or sounds-like translation for the word. A phonetic translation is based on the SSML format for representing the phonetic string of a word either as an IPA translation or as an IBM SPR translation. A sounds-like is one or more words that, when combined, sound like the word. */
  var translation: String = js.native
  /** The word that is to be added or updated for the custom voice model. */
  var word: String = js.native
}

object AddWordParams {
  @scala.inline
  def apply(customization_id: String, translation: String, word: String): AddWordParams = {
    val __obj = js.Dynamic.literal(customization_id = customization_id.asInstanceOf[js.Any], translation = translation.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddWordParams]
  }
  @scala.inline
  implicit class AddWordParamsOps[Self <: AddWordParams] (val x: Self) extends AnyVal {
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
    def setCustomization_id(value: String): Self = this.set("customization_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslation(value: String): Self = this.set("translation", value.asInstanceOf[js.Any])
    @scala.inline
    def setWord(value: String): Self = this.set("word", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setPart_of_speech(value: PartOfSpeech | String): Self = this.set("part_of_speech", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePart_of_speech: Self = this.set("part_of_speech", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
  
}

