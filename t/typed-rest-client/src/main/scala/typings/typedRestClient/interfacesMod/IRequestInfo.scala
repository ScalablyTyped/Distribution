package typings.typedRestClient.interfacesMod

import typings.node.httpMod.RequestOptions
import typings.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestInfo extends js.Object {
  var httpModule: js.Any
  var options: RequestOptions
  var parsedUrl: Url
}

object IRequestInfo {
  @scala.inline
  def apply(httpModule: js.Any, options: RequestOptions, parsedUrl: Url): IRequestInfo = {
    val __obj = js.Dynamic.literal(httpModule = httpModule.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parsedUrl = parsedUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestInfo]
  }
}

