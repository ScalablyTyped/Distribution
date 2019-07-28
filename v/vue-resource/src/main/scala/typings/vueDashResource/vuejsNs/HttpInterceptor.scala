package typings.vueDashResource.vuejsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpInterceptor extends js.Object {
  var request: js.UndefOr[js.Function1[/* request */ HttpOptions, HttpOptions]] = js.undefined
  var response: js.UndefOr[js.Function1[/* response */ HttpResponse, HttpResponse]] = js.undefined
}

object HttpInterceptor {
  @scala.inline
  def apply(
    request: /* request */ HttpOptions => HttpOptions = null,
    response: /* response */ HttpResponse => HttpResponse = null
  ): HttpInterceptor = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(js.Any.fromFunction1(request))
    if (response != null) __obj.updateDynamic("response")(js.Any.fromFunction1(response))
    __obj.asInstanceOf[HttpInterceptor]
  }
}

