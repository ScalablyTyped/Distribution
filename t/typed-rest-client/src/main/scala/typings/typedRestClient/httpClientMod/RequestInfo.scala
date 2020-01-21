package typings.typedRestClient.httpClientMod

import typings.node.httpMod.RequestOptions
import typings.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInfo extends js.Object {
  var httpModule: js.Any
  var options: RequestOptions
  var parsedUrl: Url
}

object RequestInfo {
  @scala.inline
  def apply(httpModule: js.Any, options: RequestOptions, parsedUrl: Url): RequestInfo = {
    val __obj = js.Dynamic.literal(httpModule = httpModule.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parsedUrl = parsedUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequestInfo]
  }
}

