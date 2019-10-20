package typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod

import typings.ibmDashCloudDashSdkDashCore.ibmDashCloudDashSdkDashCoreMod.BaseService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The IBM Watson&trade; Tone Analyzer service uses linguistic analysis to detect emotional and language tones in written text. The service can analyze tone at both the document and sentence levels. You can use the service to understand how your written communications are perceived and then to improve the tone of your communications. Businesses can use the service to learn the tone of their customers' communications and to respond to each customer appropriately, or to understand and improve their customer conversations.  **Note:** Request logging is disabled for the Tone Analyzer service. Regardless of whether you set the `X-Watson-Learning-Opt-Out` request header, the service does not log or retain data from requests and responses.
  */
@js.native
trait ToneAnalyzerV3 extends BaseService {
  /*************************
    * methods
    ************************/
  /**
    * Analyze general tone.
    *
    * Use the general purpose endpoint to analyze the tone of your input content. The service analyzes the content for
    * emotional and language tones. The method always analyzes the tone of the full document; by default, it also
    * analyzes the tone of each individual sentence of the content.
    *
    * You can submit no more than 128 KB of total input content and no more than 1000 individual sentences in JSON, plain
    * text, or HTML format. The service analyzes the first 1000 sentences for document-level analysis and only the first
    * 100 sentences for sentence-level analysis.
    *
    * Per the JSON specification, the default character encoding for JSON content is effectively always UTF-8; per the
    * HTTP specification, the default encoding for plain text and HTML is ISO-8859-1 (effectively, the ASCII character
    * set). When specifying a content type of plain text or HTML, include the `charset` parameter to indicate the
    * character encoding of the input text; for example: `Content-Type: text/plain;charset=utf-8`. For `text/html`, the
    * service removes HTML tags and analyzes only the textual content.
    *
    * **See also:** [Using the general-purpose
    * endpoint](https://cloud.ibm.com/docs/services/tone-analyzer/using-tone.html#using-the-general-purpose-endpoint).
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {ToneInput|string} params.tone_input - JSON, plain text, or HTML input that contains the content to be
    * analyzed. For JSON input, provide an object of type `ToneInput`.
    * @param {boolean} [params.sentences] - Indicates whether the service is to return an analysis of each individual
    * sentence in addition to its analysis of the full document. If `true` (the default), the service returns results for
    * each sentence.
    * @param {string[]} [params.tones] - **`2017-09-21`:** Deprecated. The service continues to accept the parameter for
    * backward-compatibility, but the parameter no longer affects the response.
    *
    * **`2016-05-19`:** A comma-separated list of tones for which the service is to return its analysis of the input; the
    * indicated tones apply both to the full document and to individual sentences of the document. You can specify one or
    * more of the valid values. Omit the parameter to request results for all three tones.
    * @param {string} [params.content_language] - The language of the input text for the request: English or French.
    * Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The input
    * content must match the specified language. Do not submit content that contains both languages. You can use
    * different languages for **Content-Language** and **Accept-Language**.
    * * **`2017-09-21`:** Accepts `en` or `fr`.
    * * **`2016-05-19`:** Accepts only `en`.
    * @param {string} [params.accept_language] - The desired language of the response. For two-character arguments,
    * regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can use
    * different languages for **Content-Language** and **Accept-Language**.
    * @param {string} [params.content_type] - The type of the input. A character encoding can be specified by including a
    * `charset` parameter. For example, 'text/plain;charset=utf-8'.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def tone(params: ToneParams): js.Promise[_] | Unit = js.native
  def tone(params: ToneParams, callback: Callback[ToneAnalysis]): js.Promise[_] | Unit = js.native
  /**
    * Analyze customer engagement tone.
    *
    * Use the customer engagement endpoint to analyze the tone of customer service and customer support conversations.
    * For each utterance of a conversation, the method reports the most prevalent subset of the following seven tones:
    * sad, frustrated, satisfied, excited, polite, impolite, and sympathetic.
    *
    * If you submit more than 50 utterances, the service returns a warning for the overall content and analyzes only the
    * first 50 utterances. If you submit a single utterance that contains more than 500 characters, the service returns
    * an error for that utterance and does not analyze the utterance. The request fails if all utterances have more than
    * 500 characters. Per the JSON specification, the default character encoding for JSON content is effectively always
    * UTF-8.
    *
    * **See also:** [Using the customer-engagement
    * endpoint](https://cloud.ibm.com/docs/services/tone-analyzer/using-tone-chat.html#using-the-customer-engagement-endpoint).
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {Utterance[]} params.utterances - An array of `Utterance` objects that provides the input content that the
    * service is to analyze.
    * @param {string} [params.content_language] - The language of the input text for the request: English or French.
    * Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The input
    * content must match the specified language. Do not submit content that contains both languages. You can use
    * different languages for **Content-Language** and **Accept-Language**.
    * * **`2017-09-21`:** Accepts `en` or `fr`.
    * * **`2016-05-19`:** Accepts only `en`.
    * @param {string} [params.accept_language] - The desired language of the response. For two-character arguments,
    * regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can use
    * different languages for **Content-Language** and **Accept-Language**.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def toneChat(params: ToneChatParams): js.Promise[_] | Unit = js.native
  def toneChat(params: ToneChatParams, callback: Callback[UtteranceAnalyses]): js.Promise[_] | Unit = js.native
}

