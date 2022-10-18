package typings.watsonDeveloperCloud.personalityInsightsV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `profileAsCsv` operation. */
object ProfileAsCsvConstants {
  
  @js.native
  sealed trait AcceptLanguage extends StObject
  /** The desired language of the response. For two-character arguments, regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can specify any combination of languages for the input and response content. */
  @JSImport("watson-developer-cloud/personality-insights/v3-generated", "ProfileAsCsvConstants.AcceptLanguage")
  @js.native
  object AcceptLanguage extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AcceptLanguage & String] = js.native
    
    @js.native
    sealed trait AR
      extends StObject
         with AcceptLanguage
    /* "ar" */ val AR: typings.watsonDeveloperCloud.personalityInsightsV3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.AR & String = js.native
    
    @js.native
    sealed trait DE
      extends StObject
         with AcceptLanguage
    /* "de" */ val DE: typings.watsonDeveloperCloud.personalityInsightsV3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.DE & String = js.native
    
    @js.native
    sealed trait EN
      extends StObject
         with AcceptLanguage
    /* "en" */ val EN: typings.watsonDeveloperCloud.personalityInsightsV3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.EN & String = js.native
    
    @js.native
    sealed trait ES
      extends StObject
         with AcceptLanguage
    /* "es" */ val ES: typings.watsonDeveloperCloud.personalityInsightsV3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.ES & String = js.native
    
    @js.native
    sealed trait FR
      extends StObject
         with AcceptLanguage
    /* "fr" */ val FR: typings.watsonDeveloperCloud.personalityInsightsV3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.FR & String = js.native
    
    @js.native
    sealed trait IT
      extends StObject
         with AcceptLanguage
    /* "it" */ val IT: typings.watsonDeveloperCloud.personalityInsightsV3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.IT & String = js.native
    
    @js.native
    sealed trait JA
      extends StObject
         with AcceptLanguage
    /* "ja" */ val JA: typings.watsonDeveloperCloud.personalityInsightsV3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.JA & String = js.native
    
    @js.native
    sealed trait KO
      extends StObject
         with AcceptLanguage
    /* "ko" */ val KO: typings.watsonDeveloperCloud.personalityInsightsV3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.KO & String = js.native
    
    @js.native
    sealed trait PT_BR
      extends StObject
         with AcceptLanguage
    /* "pt-br" */ val PT_BR: typings.watsonDeveloperCloud.personalityInsightsV3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.PT_BR & String = js.native
    
    @js.native
    sealed trait ZH_CN
      extends StObject
         with AcceptLanguage
    /* "zh-cn" */ val ZH_CN: typings.watsonDeveloperCloud.personalityInsightsV3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.ZH_CN & String = js.native
    
    @js.native
    sealed trait ZH_TW
      extends StObject
         with AcceptLanguage
    /* "zh-tw" */ val ZH_TW: typings.watsonDeveloperCloud.personalityInsightsV3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.ZH_TW & String = js.native
  }
  
  @js.native
  sealed trait ContentLanguage extends StObject
  /** The language of the input text for the request: Arabic, English, Japanese, Korean, or Spanish. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The effect of the **Content-Language** parameter depends on the **Content-Type** parameter. When **Content-Type** is `text/plain` or `text/html`, **Content-Language** is the only way to specify the language. When **Content-Type** is `application/json`, **Content-Language** overrides a language specified with the `language` parameter of a `ContentItem` object, and content items that specify a different language are ignored; omit this parameter to base the language on the specification of the content items. You can specify any combination of languages for **Content-Language** and **Accept-Language**. */
  @JSImport("watson-developer-cloud/personality-insights/v3-generated", "ProfileAsCsvConstants.ContentLanguage")
  @js.native
  object ContentLanguage extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ContentLanguage & String] = js.native
    
    @js.native
    sealed trait AR
      extends StObject
         with ContentLanguage
    /* "ar" */ val AR: typings.watsonDeveloperCloud.personalityInsightsV3GeneratedMod.ProfileAsCsvConstants.ContentLanguage.AR & String = js.native
    
    @js.native
    sealed trait EN
      extends StObject
         with ContentLanguage
    /* "en" */ val EN: typings.watsonDeveloperCloud.personalityInsightsV3GeneratedMod.ProfileAsCsvConstants.ContentLanguage.EN & String = js.native
    
    @js.native
    sealed trait ES
      extends StObject
         with ContentLanguage
    /* "es" */ val ES: typings.watsonDeveloperCloud.personalityInsightsV3GeneratedMod.ProfileAsCsvConstants.ContentLanguage.ES & String = js.native
    
    @js.native
    sealed trait JA
      extends StObject
         with ContentLanguage
    /* "ja" */ val JA: typings.watsonDeveloperCloud.personalityInsightsV3GeneratedMod.ProfileAsCsvConstants.ContentLanguage.JA & String = js.native
    
    @js.native
    sealed trait KO
      extends StObject
         with ContentLanguage
    /* "ko" */ val KO: typings.watsonDeveloperCloud.personalityInsightsV3GeneratedMod.ProfileAsCsvConstants.ContentLanguage.KO & String = js.native
  }
  
  @js.native
  sealed trait ContentType extends StObject
  /** The type of the input. For more information, see **Content types** in the method description. Default: `text/plain`. */
  @JSImport("watson-developer-cloud/personality-insights/v3-generated", "ProfileAsCsvConstants.ContentType")
  @js.native
  object ContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ContentType & String] = js.native
    
    @js.native
    sealed trait APPLICATION_JSON
      extends StObject
         with ContentType
    /* "application/json" */ val APPLICATION_JSON: typings.watsonDeveloperCloud.personalityInsightsV3GeneratedMod.ProfileAsCsvConstants.ContentType.APPLICATION_JSON & String = js.native
    
    @js.native
    sealed trait TEXT_HTML
      extends StObject
         with ContentType
    /* "text/html" */ val TEXT_HTML: typings.watsonDeveloperCloud.personalityInsightsV3GeneratedMod.ProfileAsCsvConstants.ContentType.TEXT_HTML & String = js.native
    
    @js.native
    sealed trait TEXT_PLAIN
      extends StObject
         with ContentType
    /* "text/plain" */ val TEXT_PLAIN: typings.watsonDeveloperCloud.personalityInsightsV3GeneratedMod.ProfileAsCsvConstants.ContentType.TEXT_PLAIN & String = js.native
  }
}
