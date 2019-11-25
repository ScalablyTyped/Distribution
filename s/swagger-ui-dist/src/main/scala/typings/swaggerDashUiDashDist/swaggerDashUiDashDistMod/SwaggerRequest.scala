package typings.swaggerDashUiDashDist.swaggerDashUiDashDistMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerRequest
  extends /* k */ StringDictionary[js.Any] {
  var credentials: String
  var url: String
}

object SwaggerRequest {
  @scala.inline
  def apply(credentials: String, url: String, StringDictionary: /* k */ StringDictionary[js.Any] = null): SwaggerRequest = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SwaggerRequest]
  }
}

