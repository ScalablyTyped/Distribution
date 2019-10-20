package typings.watsonDashDeveloperDashCloud.personalityDashInsightsV3DashGeneratedMod.ProfileConstants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentLanguage extends js.Object

/** The language of the input text for the request: Arabic, English, Japanese, Korean, or Spanish. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The effect of the **Content-Language** parameter depends on the **Content-Type** parameter. When **Content-Type** is `text/plain` or `text/html`, **Content-Language** is the only way to specify the language. When **Content-Type** is `application/json`, **Content-Language** overrides a language specified with the `language` parameter of a `ContentItem` object, and content items that specify a different language are ignored; omit this parameter to base the language on the specification of the content items. You can specify any combination of languages for **Content-Language** and **Accept-Language**. */
@JSImport("watson-developer-cloud/personality-insights/v3-generated", "ProfileConstants.ContentLanguage")
@js.native
object ContentLanguage extends js.Object {
  @js.native
  sealed trait AR extends ContentLanguage
  
  @js.native
  sealed trait EN extends ContentLanguage
  
  @js.native
  sealed trait ES extends ContentLanguage
  
  @js.native
  sealed trait JA extends ContentLanguage
  
  @js.native
  sealed trait KO extends ContentLanguage
  
  /* "ar" */ val AR: typings.watsonDashDeveloperDashCloud.personalityDashInsightsV3DashGeneratedMod.ProfileConstants.ContentLanguage.AR with String = js.native
  /* "en" */ val EN: typings.watsonDashDeveloperDashCloud.personalityDashInsightsV3DashGeneratedMod.ProfileConstants.ContentLanguage.EN with String = js.native
  /* "es" */ val ES: typings.watsonDashDeveloperDashCloud.personalityDashInsightsV3DashGeneratedMod.ProfileConstants.ContentLanguage.ES with String = js.native
  /* "ja" */ val JA: typings.watsonDashDeveloperDashCloud.personalityDashInsightsV3DashGeneratedMod.ProfileConstants.ContentLanguage.JA with String = js.native
  /* "ko" */ val KO: typings.watsonDashDeveloperDashCloud.personalityDashInsightsV3DashGeneratedMod.ProfileConstants.ContentLanguage.KO with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContentLanguage with String] = js.native
}

