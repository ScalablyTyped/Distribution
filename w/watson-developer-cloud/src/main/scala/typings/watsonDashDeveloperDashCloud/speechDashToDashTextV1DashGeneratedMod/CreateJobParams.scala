package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import typings.ibmDashCloudDashSdkDashCore.libHelperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.ContentType
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.Events
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createJob` operation. */
trait CreateJobParams extends js.Object {
  /** The customization ID (GUID) of a custom acoustic model that is to be used with the recognition request. The base model of the specified custom acoustic model must match the model specified with the `model` parameter. You must make the request with credentials for the instance of the service that owns the custom model. By default, no custom acoustic model is used. See [Custom models](https://cloud.ibm.com/docs/services/speech-to-text/input.html#custom-input). */
  var acoustic_customization_id: js.UndefOr[String] = js.undefined
  /** The audio to transcribe. */
  var audio: ReadableStream | FileObject | Buffer
  /** The version of the specified base model that is to be used with recognition request. Multiple versions of a base model can exist when a model is updated for internal improvements. The parameter is intended primarily for use with custom models that have been upgraded for a new base model. The default value depends on whether the parameter is used with or without a custom model. See [Base model version](https://cloud.ibm.com/docs/services/speech-to-text/input.html#version). */
  var base_model_version: js.UndefOr[String] = js.undefined
  /** A URL to which callback notifications are to be sent. The URL must already be successfully white-listed by using the **Register a callback** method. You can include the same callback URL with any number of job creation requests. Omit the parameter to poll the service for job completion and results. Use the `user_token` parameter to specify a unique user-specified string with each job to differentiate the callback notifications for the jobs. */
  var callback_url: js.UndefOr[String] = js.undefined
  /** The format (MIME type) of the audio. For more information about specifying an audio format, see **Audio formats (content types)** in the method description. */
  var content_type: js.UndefOr[ContentType | String] = js.undefined
  /** **Deprecated.** Use the `language_customization_id` parameter to specify the customization ID (GUID) of a custom language model that is to be used with the recognition request. Do not specify both parameters with a request. */
  var customization_id: js.UndefOr[String] = js.undefined
  /** If you specify the customization ID (GUID) of a custom language model with the recognition request, the customization weight tells the service how much weight to give to words from the custom language model compared to those from the base model for the current request. Specify a value between 0.0 and 1.0. Unless a different customization weight was specified for the custom model when it was trained, the default value is 0.3. A customization weight that you specify overrides a weight that was specified when the custom model was trained. The default value yields the best performance in general. Assign a higher value if your audio makes frequent use of OOV words from the custom model. Use caution when setting the weight: a higher value can improve the accuracy of phrases from the custom model's domain, but it can negatively affect performance on non-domain phrases. See [Custom models](https://cloud.ibm.com/docs/services/speech-to-text/input.html#custom-input). */
  var customization_weight: js.UndefOr[Double] = js.undefined
  /** If the job includes a callback URL, a comma-separated list of notification events to which to subscribe. Valid events are * `recognitions.started` generates a callback notification when the service begins to process the job. * `recognitions.completed` generates a callback notification when the job is complete. You must use the **Check a job** method to retrieve the results before they time out or are deleted. * `recognitions.completed_with_results` generates a callback notification when the job is complete. The notification includes the results of the request. * `recognitions.failed` generates a callback notification if the service experiences an error while processing the job. The `recognitions.completed` and `recognitions.completed_with_results` events are incompatible. You can specify only of the two events. If the job includes a callback URL, omit the parameter to subscribe to the default events: `recognitions.started`, `recognitions.completed`, and `recognitions.failed`. If the job does not include a callback URL, omit the parameter. */
  var events: js.UndefOr[Events | String] = js.undefined
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
  /** The number of minutes for which the results are to be available after the job has finished. If not delivered via a callback, the results must be retrieved within this time. Omit the parameter to use a time to live of one week. The parameter is valid with or without a callback URL. */
  var results_ttl: js.UndefOr[Double] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** If `true`, the service converts dates, times, series of digits and numbers, phone numbers, currency values, and internet addresses into more readable, conventional representations in the final transcript of a recognition request. For US English, the service also converts certain keyword strings to punctuation symbols. By default, the service performs no smart formatting. **Note:** Applies to US English, Japanese, and Spanish transcription only. See [Smart formatting](https://cloud.ibm.com/docs/services/speech-to-text/output.html#smart_formatting). */
  var smart_formatting: js.UndefOr[Boolean] = js.undefined
  /** If `true`, the response includes labels that identify which words were spoken by which participants in a multi-person exchange. By default, the service returns no speaker labels. Setting `speaker_labels` to `true` forces the `timestamps` parameter to be `true`, regardless of whether you specify `false` for the parameter. **Note:** Applies to US English, Japanese, and Spanish transcription only. To determine whether a language model supports speaker labels, you can also use the **Get a model** method and check that the attribute `speaker_labels` is set to `true`. See [Speaker labels](https://cloud.ibm.com/docs/services/speech-to-text/output.html#speaker_labels). */
  var speaker_labels: js.UndefOr[Boolean] = js.undefined
  /** If `true`, the service returns time alignment for each word. By default, no timestamps are returned. See [Word timestamps](https://cloud.ibm.com/docs/services/speech-to-text/output.html#word_timestamps). */
  var timestamps: js.UndefOr[Boolean] = js.undefined
  /** If the job includes a callback URL, a user-specified string that the service is to include with each callback notification for the job; the token allows the user to maintain an internal mapping between jobs and notification events. If the job does not include a callback URL, omit the parameter. */
  var user_token: js.UndefOr[String] = js.undefined
  /** A confidence value that is the lower bound for identifying a hypothesis as a possible word alternative (also known as "Confusion Networks"). An alternative word is considered if its confidence is greater than or equal to the threshold. Specify a probability between 0.0 and 1.0. By default, the service computes no alternative words. See [Word alternatives](https://cloud.ibm.com/docs/services/speech-to-text/output.html#word_alternatives). */
  var word_alternatives_threshold: js.UndefOr[Double] = js.undefined
  /** If `true`, the service returns a confidence measure in the range of 0.0 to 1.0 for each word. By default, the service returns no word confidence scores. See [Word confidence](https://cloud.ibm.com/docs/services/speech-to-text/output.html#word_confidence). */
  var word_confidence: js.UndefOr[Boolean] = js.undefined
}

object CreateJobParams {
  @scala.inline
  def apply(
    audio: ReadableStream | FileObject | Buffer,
    acoustic_customization_id: String = null,
    base_model_version: String = null,
    callback_url: String = null,
    content_type: ContentType | String = null,
    customization_id: String = null,
    customization_weight: Int | Double = null,
    events: Events | String = null,
    grammar_name: String = null,
    headers: js.Object = null,
    inactivity_timeout: Int | Double = null,
    keywords: js.Array[String] = null,
    keywords_threshold: Int | Double = null,
    language_customization_id: String = null,
    max_alternatives: Int | Double = null,
    model: Model | String = null,
    profanity_filter: js.UndefOr[Boolean] = js.undefined,
    redaction: js.UndefOr[Boolean] = js.undefined,
    results_ttl: Int | Double = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    smart_formatting: js.UndefOr[Boolean] = js.undefined,
    speaker_labels: js.UndefOr[Boolean] = js.undefined,
    timestamps: js.UndefOr[Boolean] = js.undefined,
    user_token: String = null,
    word_alternatives_threshold: Int | Double = null,
    word_confidence: js.UndefOr[Boolean] = js.undefined
  ): CreateJobParams = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any])
    if (acoustic_customization_id != null) __obj.updateDynamic("acoustic_customization_id")(acoustic_customization_id.asInstanceOf[js.Any])
    if (base_model_version != null) __obj.updateDynamic("base_model_version")(base_model_version.asInstanceOf[js.Any])
    if (callback_url != null) __obj.updateDynamic("callback_url")(callback_url.asInstanceOf[js.Any])
    if (content_type != null) __obj.updateDynamic("content_type")(content_type.asInstanceOf[js.Any])
    if (customization_id != null) __obj.updateDynamic("customization_id")(customization_id.asInstanceOf[js.Any])
    if (customization_weight != null) __obj.updateDynamic("customization_weight")(customization_weight.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (grammar_name != null) __obj.updateDynamic("grammar_name")(grammar_name.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (inactivity_timeout != null) __obj.updateDynamic("inactivity_timeout")(inactivity_timeout.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (keywords_threshold != null) __obj.updateDynamic("keywords_threshold")(keywords_threshold.asInstanceOf[js.Any])
    if (language_customization_id != null) __obj.updateDynamic("language_customization_id")(language_customization_id.asInstanceOf[js.Any])
    if (max_alternatives != null) __obj.updateDynamic("max_alternatives")(max_alternatives.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(profanity_filter)) __obj.updateDynamic("profanity_filter")(profanity_filter.asInstanceOf[js.Any])
    if (!js.isUndefined(redaction)) __obj.updateDynamic("redaction")(redaction.asInstanceOf[js.Any])
    if (results_ttl != null) __obj.updateDynamic("results_ttl")(results_ttl.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    if (!js.isUndefined(smart_formatting)) __obj.updateDynamic("smart_formatting")(smart_formatting.asInstanceOf[js.Any])
    if (!js.isUndefined(speaker_labels)) __obj.updateDynamic("speaker_labels")(speaker_labels.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamps)) __obj.updateDynamic("timestamps")(timestamps.asInstanceOf[js.Any])
    if (user_token != null) __obj.updateDynamic("user_token")(user_token.asInstanceOf[js.Any])
    if (word_alternatives_threshold != null) __obj.updateDynamic("word_alternatives_threshold")(word_alternatives_threshold.asInstanceOf[js.Any])
    if (!js.isUndefined(word_confidence)) __obj.updateDynamic("word_confidence")(word_confidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobParams]
  }
}

