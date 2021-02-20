package typings.watsonDeveloperCloud.v3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    def apply(value: String): js.UndefOr[AcceptLanguage with String] = js.native
    
    @js.native
    sealed trait AR extends AcceptLanguage
    /* "ar" */ val AR: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.AR with String = js.native
    
    @js.native
    sealed trait DE extends AcceptLanguage
    /* "de" */ val DE: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.DE with String = js.native
    
    @js.native
    sealed trait EN extends AcceptLanguage
    /* "en" */ val EN: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.EN with String = js.native
    
    @js.native
    sealed trait ES extends AcceptLanguage
    /* "es" */ val ES: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.ES with String = js.native
    
    @js.native
    sealed trait FR extends AcceptLanguage
    /* "fr" */ val FR: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.FR with String = js.native
    
    @js.native
    sealed trait IT extends AcceptLanguage
    /* "it" */ val IT: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.IT with String = js.native
    
    @js.native
    sealed trait JA extends AcceptLanguage
    /* "ja" */ val JA: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.JA with String = js.native
    
    @js.native
    sealed trait KO extends AcceptLanguage
    /* "ko" */ val KO: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.KO with String = js.native
    
    @js.native
    sealed trait PT_BR extends AcceptLanguage
    /* "pt-br" */ val PT_BR: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.PT_BR with String = js.native
    
    @js.native
    sealed trait ZH_CN extends AcceptLanguage
    /* "zh-cn" */ val ZH_CN: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.ZH_CN with String = js.native
    
    @js.native
    sealed trait ZH_TW extends AcceptLanguage
    /* "zh-tw" */ val ZH_TW: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.ZH_TW with String = js.native
  }
  
  @js.native
  sealed trait ContentLanguage extends StObject
  /** The language of the input text for the request: Arabic, English, Japanese, Korean, or Spanish. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The effect of the **Content-Language** parameter depends on the **Content-Type** parameter. When **Content-Type** is `text/plain` or `text/html`, **Content-Language** is the only way to specify the language. When **Content-Type** is `application/json`, **Content-Language** overrides a language specified with the `language` parameter of a `ContentItem` object, and content items that specify a different language are ignored; omit this parameter to base the language on the specification of the content items. You can specify any combination of languages for **Content-Language** and **Accept-Language**. */
  @JSImport("watson-developer-cloud/personality-insights/v3-generated", "ProfileAsCsvConstants.ContentLanguage")
  @js.native
  object ContentLanguage extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ContentLanguage with String] = js.native
    
    @js.native
    sealed trait AR extends ContentLanguage
    /* "ar" */ val AR: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.ContentLanguage.AR with String = js.native
    
    @js.native
    sealed trait EN extends ContentLanguage
    /* "en" */ val EN: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.ContentLanguage.EN with String = js.native
    
    @js.native
    sealed trait ES extends ContentLanguage
    /* "es" */ val ES: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.ContentLanguage.ES with String = js.native
    
    @js.native
    sealed trait JA extends ContentLanguage
    /* "ja" */ val JA: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.ContentLanguage.JA with String = js.native
    
    @js.native
    sealed trait KO extends ContentLanguage
    /* "ko" */ val KO: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.ContentLanguage.KO with String = js.native
  }
  
  @js.native
  sealed trait ContentType extends StObject
  /** The type of the input. For more information, see **Content types** in the method description. Default: `text/plain`. */
  @JSImport("watson-developer-cloud/personality-insights/v3-generated", "ProfileAsCsvConstants.ContentType")
  @js.native
  object ContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ContentType with String] = js.native
    
    @js.native
    sealed trait APPLICATION_JSON extends ContentType
    /* "application/json" */ val APPLICATION_JSON: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.ContentType.APPLICATION_JSON with String = js.native
    
    @js.native
    sealed trait TEXT_HTML extends ContentType
    /* "text/html" */ val TEXT_HTML: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.ContentType.TEXT_HTML with String = js.native
    
    @js.native
    sealed trait TEXT_PLAIN extends ContentType
    /* "text/plain" */ val TEXT_PLAIN: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.ContentType.TEXT_PLAIN with String = js.native
  }
}
