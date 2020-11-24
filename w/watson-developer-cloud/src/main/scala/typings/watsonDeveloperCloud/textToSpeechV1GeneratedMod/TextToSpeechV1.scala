package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.ibmCloudSdkCore.mod.BaseService
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ### Service Overview The IBM&reg; Text to Speech service provides APIs that use IBM's speech-synthesis capabilities to synthesize text into natural-sounding speech in a variety of languages, dialects, and voices. The service supports at least one male or female voice, sometimes both, for each language. The audio is streamed back to the client with minimal delay.   For speech synthesis, the service supports a synchronous HTTP Representational State Transfer (REST) interface. It also supports a WebSocket interface that provides both plain text and SSML input, including the SSML &lt;mark&gt; element and word timings. SSML is an XML-based markup language that provides text annotation for speech-synthesis applications.   The service also offers a customization interface. You can use the interface to define sounds-like or phonetic translations for words. A sounds-like translation consists of one or more words that, when combined, sound like the word. A phonetic translation is based on the SSML phoneme format for representing a word. You can specify a phonetic translation in standard International Phonetic Alphabet (IPA) representation or in the proprietary IBM Symbolic Phonetic Representation (SPR).
  */
@js.native
trait TextToSpeechV1 extends BaseService {
  
  /*************************
    * customWords
    ************************/
  /**
    * Add a custom word.
    *
    * Adds a single word and its translation to the specified custom voice model. Adding a new translation for a word
    * that already exists in a custom model overwrites the word's existing translation. A custom model can contain no
    * more than 20,000 entries. You must use credentials for the instance of the service that owns a model to add a word
    * to it.
    *
    * You can define sounds-like or phonetic translations for words. A sounds-like translation consists of one or more
    * words that, when combined, sound like the word. Phonetic translations are based on the SSML phoneme format for
    * representing a word. You can specify them in standard International Phonetic Alphabet (IPA) representation
    *
    *   <code>&lt;phoneme alphabet=\"ipa\" ph=\"t&#601;m&#712;&#593;to\"&gt;&lt;/phoneme&gt;</code>
    *
    *   or in the proprietary IBM Symbolic Phonetic Representation (SPR)
    *
    *   <code>&lt;phoneme alphabet=\"ibm\" ph=\"1gAstroEntxrYFXs\"&gt;&lt;/phoneme&gt;</code>
    *
    * **Note:** This method is currently a beta release.
    *
    * **See also:**
    * * [Adding a single word to a custom
    * model](https://cloud.ibm.com/docs/services/text-to-speech/custom-entries.html#cuWordAdd)
    * * [Adding words to a Japanese custom
    * model](https://cloud.ibm.com/docs/services/text-to-speech/custom-entries.html#cuJapaneseAdd)
    * * [Understanding customization](https://cloud.ibm.com/docs/services/text-to-speech/custom-intro.html).
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.customization_id - The customization ID (GUID) of the custom voice model. You must make the
    * request with service credentials created for the instance of the service that owns the custom model.
    * @param {string} params.word - The word that is to be added or updated for the custom voice model.
    * @param {string} params.translation - The phonetic or sounds-like translation for the word. A phonetic translation
    * is based on the SSML format for representing the phonetic string of a word either as an IPA translation or as an
    * IBM SPR translation. A sounds-like is one or more words that, when combined, sound like the word.
    * @param {string} [params.part_of_speech] - **Japanese only.** The part of speech for the word. The service uses the
    * value to produce the correct intonation for the word. You can create only a single entry, with or without a single
    * part of speech, for any word; you cannot create multiple entries with different parts of speech for the same word.
    * For more information, see [Working with Japanese
    * entries](https://cloud.ibm.com/docs/services/text-to-speech/custom-rules.html#jaNotes).
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def addWord(params: AddWordParams): js.Promise[_] | Unit = js.native
  def addWord(params: AddWordParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  
  /**
    * Add custom words.
    *
    * Adds one or more words and their translations to the specified custom voice model. Adding a new translation for a
    * word that already exists in a custom model overwrites the word's existing translation. A custom model can contain
    * no more than 20,000 entries. You must use credentials for the instance of the service that owns a model to add
    * words to it.
    *
    * You can define sounds-like or phonetic translations for words. A sounds-like translation consists of one or more
    * words that, when combined, sound like the word. Phonetic translations are based on the SSML phoneme format for
    * representing a word. You can specify them in standard International Phonetic Alphabet (IPA) representation
    *
    *   <code>&lt;phoneme alphabet=\"ipa\" ph=\"t&#601;m&#712;&#593;to\"&gt;&lt;/phoneme&gt;</code>
    *
    *   or in the proprietary IBM Symbolic Phonetic Representation (SPR)
    *
    *   <code>&lt;phoneme alphabet=\"ibm\" ph=\"1gAstroEntxrYFXs\"&gt;&lt;/phoneme&gt;</code>
    *
    * **Note:** This method is currently a beta release.
    *
    * **See also:**
    * * [Adding multiple words to a custom
    * model](https://cloud.ibm.com/docs/services/text-to-speech/custom-entries.html#cuWordsAdd)
    * * [Adding words to a Japanese custom
    * model](https://cloud.ibm.com/docs/services/text-to-speech/custom-entries.html#cuJapaneseAdd)
    * * [Understanding customization](https://cloud.ibm.com/docs/services/text-to-speech/custom-intro.html).
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.customization_id - The customization ID (GUID) of the custom voice model. You must make the
    * request with service credentials created for the instance of the service that owns the custom model.
    * @param {Word[]} params.words - The **Add custom words** method accepts an array of `Word` objects. Each object
    * provides a word that is to be added or updated for the custom voice model and the word's translation.
    *
    * The **List custom words** method returns an array of `Word` objects. Each object shows a word and its translation
    * from the custom voice model. The words are listed in alphabetical order, with uppercase letters listed before
    * lowercase letters. The array is empty if the custom model contains no words.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def addWords(params: AddWordsParams): js.Promise[_] | Unit = js.native
  def addWords(params: AddWordsParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  
  /*************************
    * customModels
    ************************/
  /**
    * Create a custom model.
    *
    * Creates a new empty custom voice model. You must specify a name for the new custom model. You can optionally
    * specify the language and a description for the new model. The model is owned by the instance of the service whose
    * credentials are used to create it.
    *
    * **Note:** This method is currently a beta release.
    *
    * **See also:** [Creating a custom
    * model](https://cloud.ibm.com/docs/services/text-to-speech/custom-models.html#cuModelsCreate).
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.name - The name of the new custom voice model.
    * @param {string} [params.language] - The language of the new custom voice model. Omit the parameter to use the the
    * default language, `en-US`.
    * @param {string} [params.description] - A description of the new custom voice model. Specifying a description is
    * recommended.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createVoiceModel(params: CreateVoiceModelParams): js.Promise[_] | Unit = js.native
  def createVoiceModel(params: CreateVoiceModelParams, callback: Callback[VoiceModel]): js.Promise[_] | Unit = js.native
  
  /*************************
    * userData
    ************************/
  /**
    * Delete labeled data.
    *
    * Deletes all data that is associated with a specified customer ID. The method deletes all data for the customer ID,
    * regardless of the method by which the information was added. The method has no effect if no data is associated with
    * the customer ID. You must issue the request with credentials for the same instance of the service that was used to
    * associate the customer ID with the data.
    *
    * You associate a customer ID with data by passing the `X-Watson-Metadata` header with a request that passes the
    * data.
    *
    * **See also:** [Information security](https://cloud.ibm.com/docs/services/text-to-speech/information-security.html).
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.customer_id - The customer ID for which all data is to be deleted.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteUserData(params: DeleteUserDataParams): js.Promise[_] | Unit = js.native
  def deleteUserData(params: DeleteUserDataParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  
  /**
    * Delete a custom model.
    *
    * Deletes the specified custom voice model. You must use credentials for the instance of the service that owns a
    * model to delete it.
    *
    * **Note:** This method is currently a beta release.
    *
    * **See also:** [Deleting a custom
    * model](https://cloud.ibm.com/docs/services/text-to-speech/custom-models.html#cuModelsDelete).
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.customization_id - The customization ID (GUID) of the custom voice model. You must make the
    * request with service credentials created for the instance of the service that owns the custom model.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteVoiceModel(params: DeleteVoiceModelParams): js.Promise[_] | Unit = js.native
  def deleteVoiceModel(params: DeleteVoiceModelParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  
  /**
    * Delete a custom word.
    *
    * Deletes a single word from the specified custom voice model. You must use credentials for the instance of the
    * service that owns a model to delete its words.
    *
    * **Note:** This method is currently a beta release.
    *
    * **See also:** [Deleting a word from a custom
    * model](https://cloud.ibm.com/docs/services/text-to-speech/custom-entries.html#cuWordDelete).
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.customization_id - The customization ID (GUID) of the custom voice model. You must make the
    * request with service credentials created for the instance of the service that owns the custom model.
    * @param {string} params.word - The word that is to be deleted from the custom voice model.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteWord(params: DeleteWordParams): js.Promise[_] | Unit = js.native
  def deleteWord(params: DeleteWordParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  
  /*************************
    * pronunciation
    ************************/
  /**
    * Get pronunciation.
    *
    * Gets the phonetic pronunciation for the specified word. You can request the pronunciation for a specific format.
    * You can also request the pronunciation for a specific voice to see the default translation for the language of that
    * voice or for a specific custom voice model to see the translation for that voice model.
    *
    * **Note:** This method is currently a beta release.
    *
    * **See also:** [Querying a word from a
    * language](https://cloud.ibm.com/docs/services/text-to-speech/custom-entries.html#cuWordsQueryLanguage).
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.text - The word for which the pronunciation is requested.
    * @param {string} [params.voice] - A voice that specifies the language in which the pronunciation is to be returned.
    * All voices for the same language (for example, `en-US`) return the same translation.
    * @param {string} [params.format] - The phoneme format in which to return the pronunciation. Omit the parameter to
    * obtain the pronunciation in the default format.
    * @param {string} [params.customization_id] - The customization ID (GUID) of a custom voice model for which the
    * pronunciation is to be returned. The language of a specified custom model must match the language of the specified
    * voice. If the word is not defined in the specified custom model, the service returns the default translation for
    * the custom model's language. You must make the request with service credentials created for the instance of the
    * service that owns the custom model. Omit the parameter to see the translation for the specified voice with no
    * customization.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getPronunciation(params: GetPronunciationParams): js.Promise[_] | Unit = js.native
  def getPronunciation(params: GetPronunciationParams, callback: Callback[Pronunciation]): js.Promise[_] | Unit = js.native
  
  /*************************
    * voices
    ************************/
  /**
    * Get a voice.
    *
    * Gets information about the specified voice. The information includes the name, language, gender, and other details
    * about the voice. Specify a customization ID to obtain information for that custom voice model of the specified
    * voice. To list information about all available voices, use the **List voices** method.
    *
    * **See also:** [Listing a specific voice](https://cloud.ibm.com/docs/services/text-to-speech/voices.html#listVoice).
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.voice - The voice for which information is to be returned.
    * @param {string} [params.customization_id] - The customization ID (GUID) of a custom voice model for which
    * information is to be returned. You must make the request with service credentials created for the instance of the
    * service that owns the custom model. Omit the parameter to see information about the specified voice with no
    * customization.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getVoice(params: GetVoiceParams): js.Promise[_] | Unit = js.native
  def getVoice(params: GetVoiceParams, callback: Callback[Voice]): js.Promise[_] | Unit = js.native
  
  /**
    * Get a custom model.
    *
    * Gets all information about a specified custom voice model. In addition to metadata such as the name and description
    * of the voice model, the output includes the words and their translations as defined in the model. To see just the
    * metadata for a voice model, use the **List custom models** method.
    *
    * **Note:** This method is currently a beta release.
    *
    * **See also:** [Querying a custom
    * model](https://cloud.ibm.com/docs/services/text-to-speech/custom-models.html#cuModelsQuery).
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.customization_id - The customization ID (GUID) of the custom voice model. You must make the
    * request with service credentials created for the instance of the service that owns the custom model.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getVoiceModel(params: GetVoiceModelParams): js.Promise[_] | Unit = js.native
  def getVoiceModel(params: GetVoiceModelParams, callback: Callback[VoiceModel]): js.Promise[_] | Unit = js.native
  
  /**
    * Get a custom word.
    *
    * Gets the translation for a single word from the specified custom model. The output shows the translation as it is
    * defined in the model. You must use credentials for the instance of the service that owns a model to list its words.
    *
    *
    * **Note:** This method is currently a beta release.
    *
    * **See also:** [Querying a single word from a custom
    * model](https://cloud.ibm.com/docs/services/text-to-speech/custom-entries.html#cuWordQueryModel).
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.customization_id - The customization ID (GUID) of the custom voice model. You must make the
    * request with service credentials created for the instance of the service that owns the custom model.
    * @param {string} params.word - The word that is to be queried from the custom voice model.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getWord(params: GetWordParams): js.Promise[_] | Unit = js.native
  def getWord(params: GetWordParams, callback: Callback[Translation]): js.Promise[_] | Unit = js.native
  
  /**
    * List custom models.
    *
    * Lists metadata such as the name and description for all custom voice models that are owned by an instance of the
    * service. Specify a language to list the voice models for that language only. To see the words in addition to the
    * metadata for a specific voice model, use the **List a custom model** method. You must use credentials for the
    * instance of the service that owns a model to list information about it.
    *
    * **Note:** This method is currently a beta release.
    *
    * **See also:** [Querying all custom
    * models](https://cloud.ibm.com/docs/services/text-to-speech/custom-models.html#cuModelsQueryAll).
    *
    * @param {Object} [params] - The parameters to send to the service.
    * @param {string} [params.language] - The language for which custom voice models that are owned by the requesting
    * service credentials are to be returned. Omit the parameter to see all custom voice models that are owned by the
    * requester.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listVoiceModels(): js.Promise[_] | Unit = js.native
  def listVoiceModels(params: js.UndefOr[scala.Nothing], callback: Callback[VoiceModels]): js.Promise[_] | Unit = js.native
  def listVoiceModels(params: ListVoiceModelsParams): js.Promise[_] | Unit = js.native
  def listVoiceModels(params: ListVoiceModelsParams, callback: Callback[VoiceModels]): js.Promise[_] | Unit = js.native
  
  /**
    * List voices.
    *
    * Lists all voices available for use with the service. The information includes the name, language, gender, and other
    * details about the voice. To see information about a specific voice, use the **Get a voice** method.
    *
    * **See also:** [Listing all available
    * voices](https://cloud.ibm.com/docs/services/text-to-speech/voices.html#listVoices).
    *
    * @param {Object} [params] - The parameters to send to the service.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listVoices(): js.Promise[_] | Unit = js.native
  def listVoices(params: js.UndefOr[scala.Nothing], callback: Callback[Voices]): js.Promise[_] | Unit = js.native
  def listVoices(params: ListVoicesParams): js.Promise[_] | Unit = js.native
  def listVoices(params: ListVoicesParams, callback: Callback[Voices]): js.Promise[_] | Unit = js.native
  
  /**
    * List custom words.
    *
    * Lists all of the words and their translations for the specified custom voice model. The output shows the
    * translations as they are defined in the model. You must use credentials for the instance of the service that owns a
    * model to list its words.
    *
    * **Note:** This method is currently a beta release.
    *
    * **See also:** [Querying all words from a custom
    * model](https://cloud.ibm.com/docs/services/text-to-speech/custom-entries.html#cuWordsQueryModel).
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.customization_id - The customization ID (GUID) of the custom voice model. You must make the
    * request with service credentials created for the instance of the service that owns the custom model.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listWords(params: ListWordsParams): js.Promise[_] | Unit = js.native
  def listWords(params: ListWordsParams, callback: Callback[Words]): js.Promise[_] | Unit = js.native
  
  /*************************
    * synthesis
    ************************/
  /**
    * Synthesize audio.
    *
    * Synthesizes text to audio that is spoken in the specified voice. The service bases its understanding of the
    * language for the input text on the specified voice. Use a voice that matches the language of the input text.
    *
    * The method accepts a maximum of 5 KB of input text in the body of the request, and 8 KB for the URL and headers.
    * The 5 KB limit includes any SSML tags that you specify. The service returns the synthesized audio stream as an
    * array of bytes.
    *
    * **See also:** [The HTTP interface](https://cloud.ibm.com/docs/services/text-to-speech/http.html).
    *
    * ### Audio formats (accept types)
    *
    *  The service can return audio in the following formats (MIME types).
    * * Where indicated, you can optionally specify the sampling rate (`rate`) of the audio. You must specify a sampling
    * rate for the `audio/l16` and `audio/mulaw` formats. A specified sampling rate must lie in the range of 8 kHz to 192
    * kHz.
    * * For the `audio/l16` format, you can optionally specify the endianness (`endianness`) of the audio:
    * `endianness=big-endian` or `endianness=little-endian`.
    *
    * Use the `Accept` header or the `accept` parameter to specify the requested format of the response audio. If you
    * omit an audio format altogether, the service returns the audio in Ogg format with the Opus codec
    * (`audio/ogg;codecs=opus`). The service always returns single-channel audio.
    * * `audio/basic`
    *
    *   The service returns audio with a sampling rate of 8000 Hz.
    * * `audio/flac`
    *
    *   You can optionally specify the `rate` of the audio. The default sampling rate is 22,050 Hz.
    * * `audio/l16`
    *
    *   You must specify the `rate` of the audio. You can optionally specify the `endianness` of the audio. The default
    * endianness is `little-endian`.
    * * `audio/mp3`
    *
    *   You can optionally specify the `rate` of the audio. The default sampling rate is 22,050 Hz.
    * * `audio/mpeg`
    *
    *   You can optionally specify the `rate` of the audio. The default sampling rate is 22,050 Hz.
    * * `audio/mulaw`
    *
    *   You must specify the `rate` of the audio.
    * * `audio/ogg`
    *
    *   The service returns the audio in the `vorbis` codec. You can optionally specify the `rate` of the audio. The
    * default sampling rate is 22,050 Hz.
    * * `audio/ogg;codecs=opus`
    *
    *   You can optionally specify the `rate` of the audio. The default sampling rate is 22,050 Hz.
    * * `audio/ogg;codecs=vorbis`
    *
    *   You can optionally specify the `rate` of the audio. The default sampling rate is 22,050 Hz.
    * * `audio/wav`
    *
    *   You can optionally specify the `rate` of the audio. The default sampling rate is 22,050 Hz.
    * * `audio/webm`
    *
    *   The service returns the audio in the `opus` codec. The service returns audio with a sampling rate of 48,000 Hz.
    * * `audio/webm;codecs=opus`
    *
    *   The service returns audio with a sampling rate of 48,000 Hz.
    * * `audio/webm;codecs=vorbis`
    *
    *   You can optionally specify the `rate` of the audio. The default sampling rate is 22,050 Hz.
    *
    * For more information about specifying an audio format, including additional details about some of the formats, see
    * [Audio formats](https://cloud.ibm.com/docs/services/text-to-speech/audio-formats.html).
    *
    * ### Warning messages
    *
    *  If a request includes invalid query parameters, the service returns a `Warnings` response header that provides
    * messages about the invalid parameters. The warning includes a descriptive message and a list of invalid argument
    * strings. For example, a message such as `\"Unknown arguments:\"` or `\"Unknown url query arguments:\"` followed by
    * a list of the form `\"{invalid_arg_1}, {invalid_arg_2}.\"` The request succeeds despite the warnings.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.text - The text to synthesize.
    * @param {string} [params.voice] - The voice to use for synthesis.
    * @param {string} [params.customization_id] - The customization ID (GUID) of a custom voice model to use for the
    * synthesis. If a custom voice model is specified, it is guaranteed to work only if it matches the language of the
    * indicated voice. You must make the request with service credentials created for the instance of the service that
    * owns the custom model. Omit the parameter to use the specified voice with no customization.
    * @param {string} [params.accept] - The requested format (MIME type) of the audio. You can use the `Accept` header or
    * the `accept` parameter to specify the audio format. For more information about specifying an audio format, see
    * **Audio formats (accept types)** in the method description.
    *
    * Default: `audio/ogg;codecs=opus`.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def synthesize(params: SynthesizeParams): js.Promise[_] | Unit = js.native
  def synthesize(params: SynthesizeParams, callback: Callback[ReadableStream | FileObject | Buffer]): js.Promise[_] | Unit = js.native
  
  /**
    * Update a custom model.
    *
    * Updates information for the specified custom voice model. You can update metadata such as the name and description
    * of the voice model. You can also update the words in the model and their translations. Adding a new translation for
    * a word that already exists in a custom model overwrites the word's existing translation. A custom model can contain
    * no more than 20,000 entries. You must use credentials for the instance of the service that owns a model to update
    * it.
    *
    * You can define sounds-like or phonetic translations for words. A sounds-like translation consists of one or more
    * words that, when combined, sound like the word. Phonetic translations are based on the SSML phoneme format for
    * representing a word. You can specify them in standard International Phonetic Alphabet (IPA) representation
    *
    *   <code>&lt;phoneme alphabet=\"ipa\" ph=\"t&#601;m&#712;&#593;to\"&gt;&lt;/phoneme&gt;</code>
    *
    *   or in the proprietary IBM Symbolic Phonetic Representation (SPR)
    *
    *   <code>&lt;phoneme alphabet=\"ibm\" ph=\"1gAstroEntxrYFXs\"&gt;&lt;/phoneme&gt;</code>
    *
    * **Note:** This method is currently a beta release.
    *
    * **See also:**
    * * [Updating a custom model](https://cloud.ibm.com/docs/services/text-to-speech/custom-models.html#cuModelsUpdate)
    * * [Adding words to a Japanese custom
    * model](https://cloud.ibm.com/docs/services/text-to-speech/custom-entries.html#cuJapaneseAdd)
    * * [Understanding customization](https://cloud.ibm.com/docs/services/text-to-speech/custom-intro.html).
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.customization_id - The customization ID (GUID) of the custom voice model. You must make the
    * request with service credentials created for the instance of the service that owns the custom model.
    * @param {string} [params.name] - A new name for the custom voice model.
    * @param {string} [params.description] - A new description for the custom voice model.
    * @param {Word[]} [params.words] - An array of `Word` objects that provides the words and their translations that are
    * to be added or updated for the custom voice model. Pass an empty array to make no additions or updates.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def updateVoiceModel(params: UpdateVoiceModelParams): js.Promise[_] | Unit = js.native
  def updateVoiceModel(params: UpdateVoiceModelParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
}
