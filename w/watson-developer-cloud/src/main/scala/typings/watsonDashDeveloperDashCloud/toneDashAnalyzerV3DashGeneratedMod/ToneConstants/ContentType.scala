package typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentType extends js.Object

/** The type of the input. A character encoding can be specified by including a `charset` parameter. For example, 'text/plain;charset=utf-8'. */
@JSImport("watson-developer-cloud/tone-analyzer/v3-generated", "ToneConstants.ContentType")
@js.native
object ContentType extends js.Object {
  @js.native
  sealed trait APPLICATION_JSON extends ContentType
  
  @js.native
  sealed trait TEXT_HTML extends ContentType
  
  @js.native
  sealed trait TEXT_PLAIN extends ContentType
  
  /* "application/json" */ val APPLICATION_JSON: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.ContentType.APPLICATION_JSON with String = js.native
  /* "text/html" */ val TEXT_HTML: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.ContentType.TEXT_HTML with String = js.native
  /* "text/plain" */ val TEXT_PLAIN: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.ContentType.TEXT_PLAIN with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContentType with String] = js.native
}

