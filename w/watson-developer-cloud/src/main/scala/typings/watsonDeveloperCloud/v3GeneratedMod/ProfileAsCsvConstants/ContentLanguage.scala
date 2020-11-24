package typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContentLanguage extends js.Object
/** The language of the input text for the request: Arabic, English, Japanese, Korean, or Spanish. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The effect of the **Content-Language** parameter depends on the **Content-Type** parameter. When **Content-Type** is `text/plain` or `text/html`, **Content-Language** is the only way to specify the language. When **Content-Type** is `application/json`, **Content-Language** overrides a language specified with the `language` parameter of a `ContentItem` object, and content items that specify a different language are ignored; omit this parameter to base the language on the specification of the content items. You can specify any combination of languages for **Content-Language** and **Accept-Language**. */
@JSImport("watson-developer-cloud/personality-insights/v3-generated", "ProfileAsCsvConstants.ContentLanguage")
@js.native
object ContentLanguage extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContentLanguage with String] = js.native
  
  @js.native
  sealed trait AR extends ContentLanguage
  /* "ar" */ @js.native
  object AR extends TopLevel[AR with String]
  
  @js.native
  sealed trait EN extends ContentLanguage
  /* "en" */ @js.native
  object EN extends TopLevel[EN with String]
  
  @js.native
  sealed trait ES extends ContentLanguage
  /* "es" */ @js.native
  object ES extends TopLevel[ES with String]
  
  @js.native
  sealed trait JA extends ContentLanguage
  /* "ja" */ @js.native
  object JA extends TopLevel[JA with String]
  
  @js.native
  sealed trait KO extends ContentLanguage
  /* "ko" */ @js.native
  object KO extends TopLevel[KO with String]
}
