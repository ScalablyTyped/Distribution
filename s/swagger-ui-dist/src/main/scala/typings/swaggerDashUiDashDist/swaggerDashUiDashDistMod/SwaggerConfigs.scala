package typings.swaggerDashUiDashDist.swaggerDashUiDashDistMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerConfigs
  extends /* k */ StringDictionary[js.Any] {
  def requestInterceptor(request: SwaggerRequest): SwaggerRequest
}

object SwaggerConfigs {
  @scala.inline
  def apply(
    requestInterceptor: SwaggerRequest => SwaggerRequest,
    StringDictionary: /* k */ StringDictionary[js.Any] = null
  ): SwaggerConfigs = {
    val __obj = js.Dynamic.literal(requestInterceptor = js.Any.fromFunction1(requestInterceptor))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SwaggerConfigs]
  }
}

