package typings.watsonDeveloperCloud.v3GeneratedMod

import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.ibmCloudSdkCore.mod.BaseService
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The IBM Watson&trade; Personality Insights service enables applications to derive insights from social media, enterprise data, or other digital communications. The service uses linguistic analytics to infer individuals' intrinsic personality characteristics, including Big Five, Needs, and Values, from digital communications such as email, text messages, tweets, and forum posts.  The service can automatically infer, from potentially noisy social media, portraits of individuals that reflect their personality characteristics. The service can infer consumption preferences based on the results of its analysis and, for JSON content that is timestamped, can report temporal behavior. * For information about the meaning of the models that the service uses to describe personality characteristics, see [Personality models](https://cloud.ibm.com/docs/services/personality-insights/models.html). * For information about the meaning of the consumption preferences, see [Consumption preferences](https://cloud.ibm.com/docs/services/personality-insights/preferences.html).   **Note:** Request logging is disabled for the Personality Insights service. Regardless of whether you set the `X-Watson-Learning-Opt-Out` request header, the service does not log or retain data from requests and responses.
  */
@js.native
trait PersonalityInsightsV3 extends BaseService {
  /*************************
    * methods
    ************************/
  /**
    * Get profile.
    *
    * Generates a personality profile for the author of the input text. The service accepts a maximum of 20 MB of input
    * content, but it requires much less text to produce an accurate profile. The service can analyze text in Arabic,
    * English, Japanese, Korean, or Spanish. It can return its results in a variety of languages.
    *
    * **See also:**
    * * [Requesting a profile](https://cloud.ibm.com/docs/services/personality-insights/input.html)
    * * [Providing sufficient input](https://cloud.ibm.com/docs/services/personality-insights/input.html#sufficient)
    *
    * ### Content types
    *
    *  You can provide input content as plain text (`text/plain`), HTML (`text/html`), or JSON (`application/json`) by
    * specifying the **Content-Type** parameter. The default is `text/plain`.
    * * Per the JSON specification, the default character encoding for JSON content is effectively always UTF-8.
    * * Per the HTTP specification, the default encoding for plain text and HTML is ISO-8859-1 (effectively, the ASCII
    * character set).
    *
    * When specifying a content type of plain text or HTML, include the `charset` parameter to indicate the character
    * encoding of the input text; for example, `Content-Type: text/plain;charset=utf-8`.
    *
    * **See also:** [Specifying request and response
    * formats](https://cloud.ibm.com/docs/services/personality-insights/input.html#formats)
    *
    * ### Accept types
    *
    *  You must request a response as JSON (`application/json`) or comma-separated values (`text/csv`) by specifying the
    * **Accept** parameter. CSV output includes a fixed number of columns. Set the **csv_headers** parameter to `true` to
    * request optional column headers for CSV output.
    *
    * **See also:**
    * * [Understanding a JSON profile](https://cloud.ibm.com/docs/services/personality-insights/output.html)
    * * [Understanding a CSV profile](https://cloud.ibm.com/docs/services/personality-insights/output-csv.html).
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {Content|string} params.content - A maximum of 20 MB of content to analyze, though the service requires much
    * less text; for more information, see [Providing sufficient
    * input](https://cloud.ibm.com/docs/services/personality-insights/input.html#sufficient). For JSON input, provide an
    * object of type `Content`.
    * @param {string} [params.content_language] - The language of the input text for the request: Arabic, English,
    * Japanese, Korean, or Spanish. Regional variants are treated as their parent language; for example, `en-US` is
    * interpreted as `en`.
    *
    * The effect of the **Content-Language** parameter depends on the **Content-Type** parameter. When **Content-Type**
    * is `text/plain` or `text/html`, **Content-Language** is the only way to specify the language. When **Content-Type**
    * is `application/json`, **Content-Language** overrides a language specified with the `language` parameter of a
    * `ContentItem` object, and content items that specify a different language are ignored; omit this parameter to base
    * the language on the specification of the content items. You can specify any combination of languages for
    * **Content-Language** and **Accept-Language**.
    * @param {string} [params.accept_language] - The desired language of the response. For two-character arguments,
    * regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can
    * specify any combination of languages for the input and response content.
    * @param {boolean} [params.raw_scores] - Indicates whether a raw score in addition to a normalized percentile is
    * returned for each characteristic; raw scores are not compared with a sample population. By default, only normalized
    * percentiles are returned.
    * @param {boolean} [params.csv_headers] - Indicates whether column labels are returned with a CSV response. By
    * default, no column labels are returned. Applies only when the response type is CSV (`text/csv`).
    * @param {boolean} [params.consumption_preferences] - Indicates whether consumption preferences are returned with the
    * results. By default, no consumption preferences are returned.
    * @param {string} [params.content_type] - The type of the input. For more information, see **Content types** in the
    * method description.
    *
    * Default: `text/plain`.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def profile(params: ProfileParams): js.Promise[_] | Unit = js.native
  def profile(params: ProfileParams, callback: Callback[Profile]): js.Promise[_] | Unit = js.native
  /**
    * Get profile as csv.
    *
    * Generates a personality profile for the author of the input text. The service accepts a maximum of 20 MB of input
    * content, but it requires much less text to produce an accurate profile. The service can analyze text in Arabic,
    * English, Japanese, Korean, or Spanish. It can return its results in a variety of languages.
    *
    * **See also:**
    * * [Requesting a profile](https://cloud.ibm.com/docs/services/personality-insights/input.html)
    * * [Providing sufficient input](https://cloud.ibm.com/docs/services/personality-insights/input.html#sufficient)
    *
    * ### Content types
    *
    *  You can provide input content as plain text (`text/plain`), HTML (`text/html`), or JSON (`application/json`) by
    * specifying the **Content-Type** parameter. The default is `text/plain`.
    * * Per the JSON specification, the default character encoding for JSON content is effectively always UTF-8.
    * * Per the HTTP specification, the default encoding for plain text and HTML is ISO-8859-1 (effectively, the ASCII
    * character set).
    *
    * When specifying a content type of plain text or HTML, include the `charset` parameter to indicate the character
    * encoding of the input text; for example, `Content-Type: text/plain;charset=utf-8`.
    *
    * **See also:** [Specifying request and response
    * formats](https://cloud.ibm.com/docs/services/personality-insights/input.html#formats)
    *
    * ### Accept types
    *
    *  You must request a response as JSON (`application/json`) or comma-separated values (`text/csv`) by specifying the
    * **Accept** parameter. CSV output includes a fixed number of columns. Set the **csv_headers** parameter to `true` to
    * request optional column headers for CSV output.
    *
    * **See also:**
    * * [Understanding a JSON profile](https://cloud.ibm.com/docs/services/personality-insights/output.html)
    * * [Understanding a CSV profile](https://cloud.ibm.com/docs/services/personality-insights/output-csv.html).
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {Content|string} params.content - A maximum of 20 MB of content to analyze, though the service requires much
    * less text; for more information, see [Providing sufficient
    * input](https://cloud.ibm.com/docs/services/personality-insights/input.html#sufficient). For JSON input, provide an
    * object of type `Content`.
    * @param {string} [params.content_language] - The language of the input text for the request: Arabic, English,
    * Japanese, Korean, or Spanish. Regional variants are treated as their parent language; for example, `en-US` is
    * interpreted as `en`.
    *
    * The effect of the **Content-Language** parameter depends on the **Content-Type** parameter. When **Content-Type**
    * is `text/plain` or `text/html`, **Content-Language** is the only way to specify the language. When **Content-Type**
    * is `application/json`, **Content-Language** overrides a language specified with the `language` parameter of a
    * `ContentItem` object, and content items that specify a different language are ignored; omit this parameter to base
    * the language on the specification of the content items. You can specify any combination of languages for
    * **Content-Language** and **Accept-Language**.
    * @param {string} [params.accept_language] - The desired language of the response. For two-character arguments,
    * regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can
    * specify any combination of languages for the input and response content.
    * @param {boolean} [params.raw_scores] - Indicates whether a raw score in addition to a normalized percentile is
    * returned for each characteristic; raw scores are not compared with a sample population. By default, only normalized
    * percentiles are returned.
    * @param {boolean} [params.csv_headers] - Indicates whether column labels are returned with a CSV response. By
    * default, no column labels are returned. Applies only when the response type is CSV (`text/csv`).
    * @param {boolean} [params.consumption_preferences] - Indicates whether consumption preferences are returned with the
    * results. By default, no consumption preferences are returned.
    * @param {string} [params.content_type] - The type of the input. For more information, see **Content types** in the
    * method description.
    *
    * Default: `text/plain`.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def profileAsCsv(params: ProfileAsCsvParams): js.Promise[_] | Unit = js.native
  def profileAsCsv(params: ProfileAsCsvParams, callback: Callback[ReadableStream | FileObject | Buffer]): js.Promise[_] | Unit = js.native
}

