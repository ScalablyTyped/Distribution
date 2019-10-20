package typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcceptLanguage extends js.Object

/** The desired language of the response. For two-character arguments, regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can use different languages for **Content-Language** and **Accept-Language**. */
@JSImport("watson-developer-cloud/tone-analyzer/v3-generated", "ToneConstants.AcceptLanguage")
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
  
  /* "ar" */ val AR: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage.AR with String = js.native
  /* "de" */ val DE: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage.DE with String = js.native
  /* "en" */ val EN: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage.EN with String = js.native
  /* "es" */ val ES: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage.ES with String = js.native
  /* "fr" */ val FR: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage.FR with String = js.native
  /* "it" */ val IT: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage.IT with String = js.native
  /* "ja" */ val JA: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage.JA with String = js.native
  /* "ko" */ val KO: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage.KO with String = js.native
  /* "pt-br" */ val PT_BR: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage.PT_BR with String = js.native
  /* "zh-cn" */ val ZH_CN: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage.ZH_CN with String = js.native
  /* "zh-tw" */ val ZH_TW: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage.ZH_TW with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AcceptLanguage with String] = js.native
}

