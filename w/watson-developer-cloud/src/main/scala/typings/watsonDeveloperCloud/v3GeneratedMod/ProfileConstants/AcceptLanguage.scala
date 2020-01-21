package typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcceptLanguage extends js.Object

/** The desired language of the response. For two-character arguments, regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can specify any combination of languages for the input and response content. */
@JSImport("watson-developer-cloud/personality-insights/v3-generated", "ProfileConstants.AcceptLanguage")
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AcceptLanguage with String] = js.native
  /* "ar" */ @js.native
  object AR extends TopLevel[AR with String]
  
  /* "de" */ @js.native
  object DE extends TopLevel[DE with String]
  
  /* "en" */ @js.native
  object EN extends TopLevel[EN with String]
  
  /* "es" */ @js.native
  object ES extends TopLevel[ES with String]
  
  /* "fr" */ @js.native
  object FR extends TopLevel[FR with String]
  
  /* "it" */ @js.native
  object IT extends TopLevel[IT with String]
  
  /* "ja" */ @js.native
  object JA extends TopLevel[JA with String]
  
  /* "ko" */ @js.native
  object KO extends TopLevel[KO with String]
  
  /* "pt-br" */ @js.native
  object PT_BR extends TopLevel[PT_BR with String]
  
  /* "zh-cn" */ @js.native
  object ZH_CN extends TopLevel[ZH_CN with String]
  
  /* "zh-tw" */ @js.native
  object ZH_TW extends TopLevel[ZH_TW with String]
  
}

