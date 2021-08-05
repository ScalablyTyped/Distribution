package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType
import typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `recognize` operation. */
trait RecognizeParams extends StObject {
  
  /** The customization ID (GUID) of a custom acoustic model that is to be used with the recognition request. The base model of the specified custom acoustic model must match the model specified with the `model` parameter. You must make the request with credentials for the instance of the service that owns the custom model. By default, no custom acoustic model is used. See [Custom models](https://cloud.ibm.com/docs/services/speech-to-text/input.html#custom-input). */
  var acoustic_customization_id: js.UndefOr[String] = js.undefined
  
  /** The audio to transcribe. */
  var audio: ReadableStream | FileObject | Buffer
  
  /** The version of the specified base model that is to be used with recognition request. Multiple versions of a base model can exist when a model is updated for internal improvements. The parameter is intended primarily for use with custom models that have been upgraded for a new base model. The default value depends on whether the parameter is used with or without a custom model. See [Base model version](https://cloud.ibm.com/docs/services/speech-to-text/input.html#version). */
  var base_model_version: js.UndefOr[String] = js.undefined
  
  /** The format (MIME type) of the audio. For more information about specifying an audio format, see **Audio formats (content types)** in the method description. */
  var content_type: js.UndefOr[ContentType | String] = js.undefined
  
  /** **Deprecated.** Use the `language_customization_id` parameter to specify the customization ID (GUID) of a custom language model that is to be used with the recognition request. Do not specify both parameters with a request. */
  var customization_id: js.UndefOr[String] = js.undefined
  
  /** If you specify the customization ID (GUID) of a custom language model with the recognition request, the customization weight tells the service how much weight to give to words from the custom language model compared to those from the base model for the current request. Specify a value between 0.0 and 1.0. Unless a different customization weight was specified for the custom model when it was trained, the default value is 0.3. A customization weight that you specify overrides a weight that was specified when the custom model was trained. The default value yields the best performance in general. Assign a higher value if your audio makes frequent use of OOV words from the custom model. Use caution when setting the weight: a higher value can improve the accuracy of phrases from the custom model's domain, but it can negatively affect performance on non-domain phrases. See [Custom models](https://cloud.ibm.com/docs/services/speech-to-text/input.html#custom-input). */
  var customization_weight: js.UndefOr[Double] = js.undefined
  
  /** The name of a grammar that is to be used with the recognition request. If you specify a grammar, you must also use the `language_customization_id` parameter to specify the name of the custom language model for which the grammar is defined. The service recognizes only strings that are recognized by the specified grammar; it does not recognize other custom words from the model's words resource. See [Grammars](https://cloud.ibm.com/docs/services/speech-to-text/input.html#grammars-input). */
  var grammar_name: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The time in seconds after which, if only silence (no speech) is detected in streaming audio, the connection is closed with a 400 error. The parameter is useful for stopping audio submission from a live microphone when a user simply walks away. Use `-1` for infinity. See [Inactivity timeout](https://cloud.ibm.com/docs/services/speech-to-text/input.html#timeouts-inactivity). */
  var inactivity_timeout: js.UndefOr[Double] = js.undefined
  
  /** An array of keyword strings to spot in the audio. Each keyword string can include one or more string tokens. Keywords are spotted only in the final results, not in interim hypotheses. If you specify any keywords, you must also specify a keywords threshold. You can spot a maximum of 1000 keywords. Omit the parameter or specify an empty array if you do not need to spot keywords. See [Keyword spotting](https://cloud.ibm.com/docs/services/speech-to-text/output.html#keyword_spotting). */
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A confidence value that is the lower bound for spotting a keyword. A word is considered to match a keyword if its confidence is greater than or equal to the threshold. Specify a probability between 0.0 and 1.0. If you specify a threshold, you must also specify one or more keywords. The service performs no keyword spotting if you omit either parameter. See [Keyword spotting](https://cloud.ibm.com/docs/services/speech-to-text/output.html#keyword_spotting). */
  var keywords_threshold: js.UndefOr[Double] = js.undefined
  
  /** The customization ID (GUID) of a custom language model that is to be used with the recognition request. The base model of the specified custom language model must match the model specified with the `model` parameter. You must make the request with credentials for the instance of the service that owns the custom model. By default, no custom language model is used. See [Custom models](https://cloud.ibm.com/docs/services/speech-to-text/input.html#custom-input). **Note:** Use this parameter instead of the deprecated `customization_id` parameter. */
  var language_customization_id: js.UndefOr[String] = js.undefined
  
  /** The maximum number of alternative transcripts that the service is to return. By default, the service returns a single transcript. If you specify a value of `0`, the service uses the default value, `1`. See [Maximum alternatives](https://cloud.ibm.com/docs/services/speech-to-text/output.html#max_alternatives). */
  var max_alternatives: js.UndefOr[Double] = js.undefined
  
  /** The identifier of the model that is to be used for the recognition request. See [Languages and models](https://cloud.ibm.com/docs/services/speech-to-text/models.html). */
  var model: js.UndefOr[Model | String] = js.undefined
  
  /** If `true`, the service filters profanity from all output except for keyword results by replacing inappropriate words with a series of asterisks. Set the parameter to `false` to return results with no censoring. Applies to US English transcription only. See [Profanity filtering](https://cloud.ibm.com/docs/services/speech-to-text/output.html#profanity_filter). */
  var profanity_filter: js.UndefOr[Boolean] = js.undefined
  
  /** If `true`, the service redacts, or masks, numeric data from final transcripts. The feature redacts any number that has three or more consecutive digits by replacing each digit with an `X` character. It is intended to redact sensitive numeric data, such as credit card numbers. By default, the service performs no redaction. When you enable redaction, the service automatically enables smart formatting, regardless of whether you explicitly disable that feature. To ensure maximum security, the service also disables keyword spotting (ignores the `keywords` and `keywords_threshold` parameters) and returns only a single final transcript (forces the `max_alternatives` parameter to be `1`). **Note:** Applies to US English, Japanese, and Korean transcription only. See [Numeric redaction](https://cloud.ibm.com/docs/services/speech-to-text/output.html#redaction). */
  var redaction: js.UndefOr[Boolean] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** If `true`, the service converts dates, times, series of digits and numbers, phone numbers, currency values, and internet addresses into more readable, conventional representations in the final transcript of a recognition request. For US English, the service also converts certain keyword strings to punctuation symbols. By default, the service performs no smart formatting. **Note:** Applies to US English, Japanese, and Spanish transcription only. See [Smart formatting](https://cloud.ibm.com/docs/services/speech-to-text/output.html#smart_formatting). */
  var smart_formatting: js.UndefOr[Boolean] = js.undefined
  
  /** If `true`, the response includes labels that identify which words were spoken by which participants in a multi-person exchange. By default, the service returns no speaker labels. Setting `speaker_labels` to `true` forces the `timestamps` parameter to be `true`, regardless of whether you specify `false` for the parameter. **Note:** Applies to US English, Japanese, and Spanish transcription only. To determine whether a language model supports speaker labels, you can also use the **Get a model** method and check that the attribute `speaker_labels` is set to `true`. See [Speaker labels](https://cloud.ibm.com/docs/services/speech-to-text/output.html#speaker_labels). */
  var speaker_labels: js.UndefOr[Boolean] = js.undefined
  
  /** If `true`, the service returns time alignment for each word. By default, no timestamps are returned. See [Word timestamps](https://cloud.ibm.com/docs/services/speech-to-text/output.html#word_timestamps). */
  var timestamps: js.UndefOr[Boolean] = js.undefined
  
  /** A confidence value that is the lower bound for identifying a hypothesis as a possible word alternative (also known as "Confusion Networks"). An alternative word is considered if its confidence is greater than or equal to the threshold. Specify a probability between 0.0 and 1.0. By default, the service computes no alternative words. See [Word alternatives](https://cloud.ibm.com/docs/services/speech-to-text/output.html#word_alternatives). */
  var word_alternatives_threshold: js.UndefOr[Double] = js.undefined
  
  /** If `true`, the service returns a confidence measure in the range of 0.0 to 1.0 for each word. By default, the service returns no word confidence scores. See [Word confidence](https://cloud.ibm.com/docs/services/speech-to-text/output.html#word_confidence). */
  var word_confidence: js.UndefOr[Boolean] = js.undefined
}
object RecognizeParams {
  
  inline def apply(audio: ReadableStream | FileObject | Buffer): RecognizeParams = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecognizeParams]
  }
  
  extension [Self <: RecognizeParams](x: Self) {
    
    inline def setAcoustic_customization_id(value: String): Self = StObject.set(x, "acoustic_customization_id", value.asInstanceOf[js.Any])
    
    inline def setAcoustic_customization_idUndefined: Self = StObject.set(x, "acoustic_customization_id", js.undefined)
    
    inline def setAudio(value: ReadableStream | FileObject | Buffer): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setBase_model_version(value: String): Self = StObject.set(x, "base_model_version", value.asInstanceOf[js.Any])
    
    inline def setBase_model_versionUndefined: Self = StObject.set(x, "base_model_version", js.undefined)
    
    inline def setContent_type(value: ContentType | String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
    
    inline def setCustomization_id(value: String): Self = StObject.set(x, "customization_id", value.asInstanceOf[js.Any])
    
    inline def setCustomization_idUndefined: Self = StObject.set(x, "customization_id", js.undefined)
    
    inline def setCustomization_weight(value: Double): Self = StObject.set(x, "customization_weight", value.asInstanceOf[js.Any])
    
    inline def setCustomization_weightUndefined: Self = StObject.set(x, "customization_weight", js.undefined)
    
    inline def setGrammar_name(value: String): Self = StObject.set(x, "grammar_name", value.asInstanceOf[js.Any])
    
    inline def setGrammar_nameUndefined: Self = StObject.set(x, "grammar_name", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setInactivity_timeout(value: Double): Self = StObject.set(x, "inactivity_timeout", value.asInstanceOf[js.Any])
    
    inline def setInactivity_timeoutUndefined: Self = StObject.set(x, "inactivity_timeout", js.undefined)
    
    inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
    
    inline def setKeywords_threshold(value: Double): Self = StObject.set(x, "keywords_threshold", value.asInstanceOf[js.Any])
    
    inline def setKeywords_thresholdUndefined: Self = StObject.set(x, "keywords_threshold", js.undefined)
    
    inline def setLanguage_customization_id(value: String): Self = StObject.set(x, "language_customization_id", value.asInstanceOf[js.Any])
    
    inline def setLanguage_customization_idUndefined: Self = StObject.set(x, "language_customization_id", js.undefined)
    
    inline def setMax_alternatives(value: Double): Self = StObject.set(x, "max_alternatives", value.asInstanceOf[js.Any])
    
    inline def setMax_alternativesUndefined: Self = StObject.set(x, "max_alternatives", js.undefined)
    
    inline def setModel(value: Model | String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setProfanity_filter(value: Boolean): Self = StObject.set(x, "profanity_filter", value.asInstanceOf[js.Any])
    
    inline def setProfanity_filterUndefined: Self = StObject.set(x, "profanity_filter", js.undefined)
    
    inline def setRedaction(value: Boolean): Self = StObject.set(x, "redaction", value.asInstanceOf[js.Any])
    
    inline def setRedactionUndefined: Self = StObject.set(x, "redaction", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setSmart_formatting(value: Boolean): Self = StObject.set(x, "smart_formatting", value.asInstanceOf[js.Any])
    
    inline def setSmart_formattingUndefined: Self = StObject.set(x, "smart_formatting", js.undefined)
    
    inline def setSpeaker_labels(value: Boolean): Self = StObject.set(x, "speaker_labels", value.asInstanceOf[js.Any])
    
    inline def setSpeaker_labelsUndefined: Self = StObject.set(x, "speaker_labels", js.undefined)
    
    inline def setTimestamps(value: Boolean): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    inline def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
    
    inline def setWord_alternatives_threshold(value: Double): Self = StObject.set(x, "word_alternatives_threshold", value.asInstanceOf[js.Any])
    
    inline def setWord_alternatives_thresholdUndefined: Self = StObject.set(x, "word_alternatives_threshold", js.undefined)
    
    inline def setWord_confidence(value: Boolean): Self = StObject.set(x, "word_confidence", value.asInstanceOf[js.Any])
    
    inline def setWord_confidenceUndefined: Self = StObject.set(x, "word_confidence", js.undefined)
  }
}
