package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage
import typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.ContentLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `toneChat` operation. */
@js.native
trait ToneChatParams extends js.Object {
  
  /** The desired language of the response. For two-character arguments, regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can use different languages for **Content-Language** and **Accept-Language**. */
  var accept_language: js.UndefOr[AcceptLanguage | String] = js.native
  
  /** The language of the input text for the request: English or French. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The input content must match the specified language. Do not submit content that contains both languages. You can use different languages for **Content-Language** and **Accept-Language**. * **`2017-09-21`:** Accepts `en` or `fr`. * **`2016-05-19`:** Accepts only `en`. */
  var content_language: js.UndefOr[ContentLanguage | String] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** An array of `Utterance` objects that provides the input content that the service is to analyze. */
  var utterances: js.Array[Utterance] = js.native
}
object ToneChatParams {
  
  @scala.inline
  def apply(utterances: js.Array[Utterance]): ToneChatParams = {
    val __obj = js.Dynamic.literal(utterances = utterances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToneChatParams]
  }
  
  @scala.inline
  implicit class ToneChatParamsOps[Self <: ToneChatParams] (val x: Self) extends AnyVal {
    
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
    def setUtterancesVarargs(value: Utterance*): Self = this.set("utterances", js.Array(value :_*))
    
    @scala.inline
    def setUtterances(value: js.Array[Utterance]): Self = this.set("utterances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccept_language(value: AcceptLanguage | String): Self = this.set("accept_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccept_language: Self = this.set("accept_language", js.undefined)
    
    @scala.inline
    def setContent_language(value: ContentLanguage | String): Self = this.set("content_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent_language: Self = this.set("content_language", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
}
