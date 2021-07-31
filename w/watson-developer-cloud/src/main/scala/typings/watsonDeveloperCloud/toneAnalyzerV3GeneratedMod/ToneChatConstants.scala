package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `toneChat` operation. */
object ToneChatConstants {
  
  @js.native
  sealed trait AcceptLanguage extends StObject
  /** The desired language of the response. For two-character arguments, regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can use different languages for **Content-Language** and **Accept-Language**. */
  @JSImport("watson-developer-cloud/tone-analyzer/v3-generated", "ToneChatConstants.AcceptLanguage")
  @js.native
  object AcceptLanguage extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AcceptLanguage & String] = js.native
    
    @js.native
    sealed trait AR
      extends StObject
         with AcceptLanguage
    /* "ar" */ val AR: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage.AR & String = js.native
    
    @js.native
    sealed trait DE
      extends StObject
         with AcceptLanguage
    /* "de" */ val DE: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage.DE & String = js.native
    
    @js.native
    sealed trait EN
      extends StObject
         with AcceptLanguage
    /* "en" */ val EN: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage.EN & String = js.native
    
    @js.native
    sealed trait ES
      extends StObject
         with AcceptLanguage
    /* "es" */ val ES: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage.ES & String = js.native
    
    @js.native
    sealed trait FR
      extends StObject
         with AcceptLanguage
    /* "fr" */ val FR: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage.FR & String = js.native
    
    @js.native
    sealed trait IT
      extends StObject
         with AcceptLanguage
    /* "it" */ val IT: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage.IT & String = js.native
    
    @js.native
    sealed trait JA
      extends StObject
         with AcceptLanguage
    /* "ja" */ val JA: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage.JA & String = js.native
    
    @js.native
    sealed trait KO
      extends StObject
         with AcceptLanguage
    /* "ko" */ val KO: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage.KO & String = js.native
    
    @js.native
    sealed trait PT_BR
      extends StObject
         with AcceptLanguage
    /* "pt-br" */ val PT_BR: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage.PT_BR & String = js.native
    
    @js.native
    sealed trait ZH_CN
      extends StObject
         with AcceptLanguage
    /* "zh-cn" */ val ZH_CN: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage.ZH_CN & String = js.native
    
    @js.native
    sealed trait ZH_TW
      extends StObject
         with AcceptLanguage
    /* "zh-tw" */ val ZH_TW: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage.ZH_TW & String = js.native
  }
  
  @js.native
  sealed trait ContentLanguage extends StObject
  /** The language of the input text for the request: English or French. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The input content must match the specified language. Do not submit content that contains both languages. You can use different languages for **Content-Language** and **Accept-Language**. * **`2017-09-21`:** Accepts `en` or `fr`. * **`2016-05-19`:** Accepts only `en`. */
  @JSImport("watson-developer-cloud/tone-analyzer/v3-generated", "ToneChatConstants.ContentLanguage")
  @js.native
  object ContentLanguage extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ContentLanguage & String] = js.native
    
    @js.native
    sealed trait EN
      extends StObject
         with ContentLanguage
    /* "en" */ val EN: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.ContentLanguage.EN & String = js.native
    
    @js.native
    sealed trait FR
      extends StObject
         with ContentLanguage
    /* "fr" */ val FR: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.ContentLanguage.FR & String = js.native
  }
}
