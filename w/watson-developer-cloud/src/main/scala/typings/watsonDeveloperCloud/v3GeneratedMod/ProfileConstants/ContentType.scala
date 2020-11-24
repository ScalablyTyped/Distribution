package typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContentType extends js.Object
/** The type of the input. For more information, see **Content types** in the method description. Default: `text/plain`. */
@JSImport("watson-developer-cloud/personality-insights/v3-generated", "ProfileConstants.ContentType")
@js.native
object ContentType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContentType with String] = js.native
  
  @js.native
  sealed trait APPLICATION_JSON extends ContentType
  /* "application/json" */ @js.native
  object APPLICATION_JSON extends TopLevel[APPLICATION_JSON with String]
  
  @js.native
  sealed trait TEXT_HTML extends ContentType
  /* "text/html" */ @js.native
  object TEXT_HTML extends TopLevel[TEXT_HTML with String]
  
  @js.native
  sealed trait TEXT_PLAIN extends ContentType
  /* "text/plain" */ @js.native
  object TEXT_PLAIN extends TopLevel[TEXT_PLAIN with String]
}
