package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `tone` operation. */
object ToneConstants {
  
  @js.native
  sealed trait AcceptLanguage extends StObject
  /** The desired language of the response. For two-character arguments, regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can use different languages for **Content-Language** and **Accept-Language**. */
  @JSImport("watson-developer-cloud/tone-analyzer/v3-generated", "ToneConstants.AcceptLanguage")
  @js.native
  object AcceptLanguage extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AcceptLanguage & String] = js.native
    
    @js.native
    sealed trait AR
      extends StObject
         with AcceptLanguage
    /* "ar" */ val AR: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.AR & String = js.native
    
    @js.native
    sealed trait DE
      extends StObject
         with AcceptLanguage
    /* "de" */ val DE: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.DE & String = js.native
    
    @js.native
    sealed trait EN
      extends StObject
         with AcceptLanguage
    /* "en" */ val EN: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.EN & String = js.native
    
    @js.native
    sealed trait ES
      extends StObject
         with AcceptLanguage
    /* "es" */ val ES: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.ES & String = js.native
    
    @js.native
    sealed trait FR
      extends StObject
         with AcceptLanguage
    /* "fr" */ val FR: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.FR & String = js.native
    
    @js.native
    sealed trait IT
      extends StObject
         with AcceptLanguage
    /* "it" */ val IT: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.IT & String = js.native
    
    @js.native
    sealed trait JA
      extends StObject
         with AcceptLanguage
    /* "ja" */ val JA: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.JA & String = js.native
    
    @js.native
    sealed trait KO
      extends StObject
         with AcceptLanguage
    /* "ko" */ val KO: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.KO & String = js.native
    
    @js.native
    sealed trait PT_BR
      extends StObject
         with AcceptLanguage
    /* "pt-br" */ val PT_BR: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.PT_BR & String = js.native
    
    @js.native
    sealed trait ZH_CN
      extends StObject
         with AcceptLanguage
    /* "zh-cn" */ val ZH_CN: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.ZH_CN & String = js.native
    
    @js.native
    sealed trait ZH_TW
      extends StObject
         with AcceptLanguage
    /* "zh-tw" */ val ZH_TW: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.ZH_TW & String = js.native
  }
  
  @js.native
  sealed trait ContentLanguage extends StObject
  /** The language of the input text for the request: English or French. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The input content must match the specified language. Do not submit content that contains both languages. You can use different languages for **Content-Language** and **Accept-Language**. * **`2017-09-21`:** Accepts `en` or `fr`. * **`2016-05-19`:** Accepts only `en`. */
  @JSImport("watson-developer-cloud/tone-analyzer/v3-generated", "ToneConstants.ContentLanguage")
  @js.native
  object ContentLanguage extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ContentLanguage & String] = js.native
    
    @js.native
    sealed trait EN
      extends StObject
         with ContentLanguage
    /* "en" */ val EN: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.ContentLanguage.EN & String = js.native
    
    @js.native
    sealed trait FR
      extends StObject
         with ContentLanguage
    /* "fr" */ val FR: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.ContentLanguage.FR & String = js.native
  }
  
  @js.native
  sealed trait ContentType extends StObject
  /** The type of the input. A character encoding can be specified by including a `charset` parameter. For example, 'text/plain;charset=utf-8'. */
  @JSImport("watson-developer-cloud/tone-analyzer/v3-generated", "ToneConstants.ContentType")
  @js.native
  object ContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ContentType & String] = js.native
    
    @js.native
    sealed trait APPLICATION_JSON
      extends StObject
         with ContentType
    /* "application/json" */ val APPLICATION_JSON: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.ContentType.APPLICATION_JSON & String = js.native
    
    @js.native
    sealed trait TEXT_HTML
      extends StObject
         with ContentType
    /* "text/html" */ val TEXT_HTML: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.ContentType.TEXT_HTML & String = js.native
    
    @js.native
    sealed trait TEXT_PLAIN
      extends StObject
         with ContentType
    /* "text/plain" */ val TEXT_PLAIN: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.ContentType.TEXT_PLAIN & String = js.native
  }
  
  @js.native
  sealed trait Tones extends StObject
  /** **`2017-09-21`:** Deprecated. The service continues to accept the parameter for backward-compatibility, but the parameter no longer affects the response. **`2016-05-19`:** A comma-separated list of tones for which the service is to return its analysis of the input; the indicated tones apply both to the full document and to individual sentences of the document. You can specify one or more of the valid values. Omit the parameter to request results for all three tones. */
  @JSImport("watson-developer-cloud/tone-analyzer/v3-generated", "ToneConstants.Tones")
  @js.native
  object Tones extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Tones & String] = js.native
    
    @js.native
    sealed trait EMOTION
      extends StObject
         with Tones
    /* "emotion" */ val EMOTION: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.Tones.EMOTION & String = js.native
    
    @js.native
    sealed trait LANGUAGE
      extends StObject
         with Tones
    /* "language" */ val LANGUAGE: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.Tones.LANGUAGE & String = js.native
    
    @js.native
    sealed trait SOCIAL
      extends StObject
         with Tones
    /* "social" */ val SOCIAL: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.Tones.SOCIAL & String = js.native
  }
}
