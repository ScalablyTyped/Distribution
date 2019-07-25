package typings
package swaggerDashUiDashDistLib.swaggerDashUiDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerRequest
  extends /* k */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var credentials: java.lang.String
  var url: java.lang.String
}

object SwaggerRequest {
  @scala.inline
  def apply(
    credentials: java.lang.String,
    url: java.lang.String,
    StringDictionary: /* k */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): SwaggerRequest = {
    val __obj = js.Dynamic.literal(credentials = credentials, url = url)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SwaggerRequest]
  }
}

