package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `addWord` operation. */
trait AddWordParams extends StObject {
  
  /** The customization ID (GUID) of the custom voice model. You must make the request with service credentials created for the instance of the service that owns the custom model. */
  var customization_id: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** **Japanese only.** The part of speech for the word. The service uses the value to produce the correct intonation for the word. You can create only a single entry, with or without a single part of speech, for any word; you cannot create multiple entries with different parts of speech for the same word. For more information, see [Working with Japanese entries](https://cloud.ibm.com/docs/services/text-to-speech/custom-rules.html#jaNotes). */
  var part_of_speech: js.UndefOr[PartOfSpeech | String] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** The phonetic or sounds-like translation for the word. A phonetic translation is based on the SSML format for representing the phonetic string of a word either as an IPA translation or as an IBM SPR translation. A sounds-like is one or more words that, when combined, sound like the word. */
  var translation: String
  
  /** The word that is to be added or updated for the custom voice model. */
  var word: String
}
object AddWordParams {
  
  inline def apply(customization_id: String, translation: String, word: String): AddWordParams = {
    val __obj = js.Dynamic.literal(customization_id = customization_id.asInstanceOf[js.Any], translation = translation.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddWordParams]
  }
  
  extension [Self <: AddWordParams](x: Self) {
    
    inline def setCustomization_id(value: String): Self = StObject.set(x, "customization_id", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setPart_of_speech(value: PartOfSpeech | String): Self = StObject.set(x, "part_of_speech", value.asInstanceOf[js.Any])
    
    inline def setPart_of_speechUndefined: Self = StObject.set(x, "part_of_speech", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setTranslation(value: String): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
    
    inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
  }
}
