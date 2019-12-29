package typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentLanguage extends js.Object

/** The language of the input text for the request: English or French. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The input content must match the specified language. Do not submit content that contains both languages. You can use different languages for **Content-Language** and **Accept-Language**. * **`2017-09-21`:** Accepts `en` or `fr`. * **`2016-05-19`:** Accepts only `en`. */
@JSImport("watson-developer-cloud/tone-analyzer/v3-generated", "ToneConstants.ContentLanguage")
@js.native
object ContentLanguage extends js.Object {
  @js.native
  sealed trait EN extends ContentLanguage
  
  @js.native
  sealed trait FR extends ContentLanguage
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContentLanguage with String] = js.native
  /* "en" */ @js.native
  object EN extends TopLevel[EN with String]
  
  /* "fr" */ @js.native
  object FR extends TopLevel[FR with String]
  
}

