package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage
import typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.ContentLanguage
import typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.ContentType
import typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.Tones
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * request interfaces
  ************************/
/** Parameters for the `tone` operation. */
@js.native
trait ToneParams extends js.Object {
  
  /** The desired language of the response. For two-character arguments, regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can use different languages for **Content-Language** and **Accept-Language**. */
  var accept_language: js.UndefOr[AcceptLanguage | String] = js.native
  
  /** The language of the input text for the request: English or French. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The input content must match the specified language. Do not submit content that contains both languages. You can use different languages for **Content-Language** and **Accept-Language**. * **`2017-09-21`:** Accepts `en` or `fr`. * **`2016-05-19`:** Accepts only `en`. */
  var content_language: js.UndefOr[ContentLanguage | String] = js.native
  
  /** The type of the input. A character encoding can be specified by including a `charset` parameter. For example, 'text/plain;charset=utf-8'. */
  var content_type: js.UndefOr[ContentType | String] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** Indicates whether the service is to return an analysis of each individual sentence in addition to its analysis of the full document. If `true` (the default), the service returns results for each sentence. */
  var sentences: js.UndefOr[Boolean] = js.native
  
  /** JSON, plain text, or HTML input that contains the content to be analyzed. For JSON input, provide an object of type `ToneInput`. */
  var tone_input: ToneInput | String = js.native
  
  /** **`2017-09-21`:** Deprecated. The service continues to accept the parameter for backward-compatibility, but the parameter no longer affects the response. **`2016-05-19`:** A comma-separated list of tones for which the service is to return its analysis of the input; the indicated tones apply both to the full document and to individual sentences of the document. You can specify one or more of the valid values. Omit the parameter to request results for all three tones. */
  var tones: js.UndefOr[js.Array[String | Tones]] = js.native
}
object ToneParams {
  
  @scala.inline
  def apply(tone_input: ToneInput | String): ToneParams = {
    val __obj = js.Dynamic.literal(tone_input = tone_input.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToneParams]
  }
  
  @scala.inline
  implicit class ToneParamsOps[Self <: ToneParams] (val x: Self) extends AnyVal {
    
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
    def setTone_input(value: ToneInput | String): Self = this.set("tone_input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccept_language(value: AcceptLanguage | String): Self = this.set("accept_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccept_language: Self = this.set("accept_language", js.undefined)
    
    @scala.inline
    def setContent_language(value: ContentLanguage | String): Self = this.set("content_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent_language: Self = this.set("content_language", js.undefined)
    
    @scala.inline
    def setContent_type(value: ContentType | String): Self = this.set("content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent_type: Self = this.set("content_type", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
    
    @scala.inline
    def setSentences(value: Boolean): Self = this.set("sentences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentences: Self = this.set("sentences", js.undefined)
    
    @scala.inline
    def setTonesVarargs(value: (String | Tones)*): Self = this.set("tones", js.Array(value :_*))
    
    @scala.inline
    def setTones(value: js.Array[String | Tones]): Self = this.set("tones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTones: Self = this.set("tones", js.undefined)
  }
}
