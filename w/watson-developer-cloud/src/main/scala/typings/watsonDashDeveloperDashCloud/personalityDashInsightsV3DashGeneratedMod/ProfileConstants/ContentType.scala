package typings.watsonDashDeveloperDashCloud.personalityDashInsightsV3DashGeneratedMod.ProfileConstants

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentType extends js.Object

/** The type of the input. For more information, see **Content types** in the method description. Default: `text/plain`. */
@JSImport("watson-developer-cloud/personality-insights/v3-generated", "ProfileConstants.ContentType")
@js.native
object ContentType extends js.Object {
  @js.native
  sealed trait APPLICATION_JSON extends ContentType
  
  @js.native
  sealed trait TEXT_HTML extends ContentType
  
  @js.native
  sealed trait TEXT_PLAIN extends ContentType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContentType with String] = js.native
  /* "application/json" */ @js.native
  object APPLICATION_JSON extends TopLevel[APPLICATION_JSON with String]
  
  /* "text/html" */ @js.native
  object TEXT_HTML extends TopLevel[TEXT_HTML with String]
  
  /* "text/plain" */ @js.native
  object TEXT_PLAIN extends TopLevel[TEXT_PLAIN with String]
  
}

