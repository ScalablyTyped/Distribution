package typings
package swaggerDashUiDashDistLib.swaggerDashUiDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerConfigs
  extends /* k */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  def requestInterceptor(request: SwaggerRequest): SwaggerRequest
}

object SwaggerConfigs {
  @scala.inline
  def apply(
    requestInterceptor: SwaggerRequest => SwaggerRequest,
    StringDictionary: /* k */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): SwaggerConfigs = {
    val __obj = js.Dynamic.literal(requestInterceptor = js.Any.fromFunction1(requestInterceptor))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SwaggerConfigs]
  }
}

