package typings.watsonDashDeveloperDashCloud.personalityDashInsightsV3DashGeneratedMod.ProfileConstants

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
  
  /* "application/json" */ val APPLICATION_JSON: typings.watsonDashDeveloperDashCloud.personalityDashInsightsV3DashGeneratedMod.ProfileConstants.ContentType.APPLICATION_JSON with String = js.native
  /* "text/html" */ val TEXT_HTML: typings.watsonDashDeveloperDashCloud.personalityDashInsightsV3DashGeneratedMod.ProfileConstants.ContentType.TEXT_HTML with String = js.native
  /* "text/plain" */ val TEXT_PLAIN: typings.watsonDashDeveloperDashCloud.personalityDashInsightsV3DashGeneratedMod.ProfileConstants.ContentType.TEXT_PLAIN with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContentType with String] = js.native
}

