package typings.vimeo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  var method: String
  var path: String
  var query: js.UndefOr[String] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(method: String, path: String, headers: js.Object = null, query: String = null): RequestOptions = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

