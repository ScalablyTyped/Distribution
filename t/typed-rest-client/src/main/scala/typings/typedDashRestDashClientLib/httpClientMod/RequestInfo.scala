package typings
package typedDashRestDashClientLib.httpClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInfo extends js.Object {
  var httpModule: js.Any
  var options: nodeLib.httpMod.RequestOptions
  var parsedUrl: nodeLib.urlMod.Url
}

object RequestInfo {
  @scala.inline
  def apply(httpModule: js.Any, options: nodeLib.httpMod.RequestOptions, parsedUrl: nodeLib.urlMod.Url): RequestInfo = {
    val __obj = js.Dynamic.literal(httpModule = httpModule, options = options, parsedUrl = parsedUrl)
  
    __obj.asInstanceOf[RequestInfo]
  }
}

