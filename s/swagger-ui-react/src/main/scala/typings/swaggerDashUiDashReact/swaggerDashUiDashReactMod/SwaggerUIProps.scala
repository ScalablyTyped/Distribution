package typings.swaggerDashUiDashReact.swaggerDashUiDashReactMod

import typings.swaggerDashUiDashReact.System
import typings.swaggerDashUiDashReact.swaggerDashUiDashReactStrings.full
import typings.swaggerDashUiDashReact.swaggerDashUiDashReactStrings.list
import typings.swaggerDashUiDashReact.swaggerDashUiDashReactStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerUIProps extends js.Object {
  var docExpansion: list | full | none
  var onComplete: js.UndefOr[js.Function1[/* system */ System, Unit]] = js.undefined
  var requestInterceptor: js.UndefOr[js.Function1[/* req */ Request, Request | js.Promise[Request]]] = js.undefined
  var responseInterceptor: js.UndefOr[js.Function1[/* res */ Response, Response | js.Promise[Response]]] = js.undefined
  var spec: js.UndefOr[js.Object] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object SwaggerUIProps {
  @scala.inline
  def apply(
    docExpansion: list | full | none,
    onComplete: /* system */ System => Unit = null,
    requestInterceptor: /* req */ Request => Request | js.Promise[Request] = null,
    responseInterceptor: /* res */ Response => Response | js.Promise[Response] = null,
    spec: js.Object = null,
    url: String = null
  ): SwaggerUIProps = {
    val __obj = js.Dynamic.literal(docExpansion = docExpansion.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (requestInterceptor != null) __obj.updateDynamic("requestInterceptor")(js.Any.fromFunction1(requestInterceptor))
    if (responseInterceptor != null) __obj.updateDynamic("responseInterceptor")(js.Any.fromFunction1(responseInterceptor))
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwaggerUIProps]
  }
}

