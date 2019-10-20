package typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod

import typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage
import typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.ContentLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `toneChat` operation. */
@JSImport("watson-developer-cloud/tone-analyzer/v3-generated", "ToneChatConstants")
@js.native
object ToneChatConstants extends js.Object {
  @js.native
  sealed trait AcceptLanguage extends js.Object
  
  @js.native
  sealed trait ContentLanguage extends js.Object
  
  /** The desired language of the response. For two-character arguments, regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can use different languages for **Content-Language** and **Accept-Language**. */
  @js.native
  object AcceptLanguage extends js.Object {
    @js.native
    sealed trait AR extends AcceptLanguage
    
    @js.native
    sealed trait DE extends AcceptLanguage
    
    @js.native
    sealed trait EN extends AcceptLanguage
    
    @js.native
    sealed trait ES extends AcceptLanguage
    
    @js.native
    sealed trait FR extends AcceptLanguage
    
    @js.native
    sealed trait IT extends AcceptLanguage
    
    @js.native
    sealed trait JA extends AcceptLanguage
    
    @js.native
    sealed trait KO extends AcceptLanguage
    
    @js.native
    sealed trait PT_BR extends AcceptLanguage
    
    @js.native
    sealed trait ZH_CN extends AcceptLanguage
    
    @js.native
    sealed trait ZH_TW extends AcceptLanguage
    
    /* "ar" */ val AR: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage.AR with String = js.native
    /* "de" */ val DE: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage.DE with String = js.native
    /* "en" */ val EN: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage.EN with String = js.native
    /* "es" */ val ES: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage.ES with String = js.native
    /* "fr" */ val FR: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage.FR with String = js.native
    /* "it" */ val IT: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage.IT with String = js.native
    /* "ja" */ val JA: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage.JA with String = js.native
    /* "ko" */ val KO: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage.KO with String = js.native
    /* "pt-br" */ val PT_BR: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage.PT_BR with String = js.native
    /* "zh-cn" */ val ZH_CN: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage.ZH_CN with String = js.native
    /* "zh-tw" */ val ZH_TW: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage.ZH_TW with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AcceptLanguage with String] = js.native
  }
  
  /** The language of the input text for the request: English or French. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The input content must match the specified language. Do not submit content that contains both languages. You can use different languages for **Content-Language** and **Accept-Language**. * **`2017-09-21`:** Accepts `en` or `fr`. * **`2016-05-19`:** Accepts only `en`. */
  @js.native
  object ContentLanguage extends js.Object {
    @js.native
    sealed trait EN extends ContentLanguage
    
    @js.native
    sealed trait FR extends ContentLanguage
    
    /* "en" */ val EN: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.ContentLanguage.EN with String = js.native
    /* "fr" */ val FR: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.ContentLanguage.FR with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ContentLanguage with String] = js.native
  }
  
}

