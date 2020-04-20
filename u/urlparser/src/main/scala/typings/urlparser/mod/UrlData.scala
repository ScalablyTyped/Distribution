package typings.urlparser.mod

import typings.urlparser.AnonBase
import typings.urlparser.AnonHostname
import typings.urlparser.AnonParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlData extends js.Object {
  var host: AnonHostname
  var path: AnonBase
  var query: AnonParams
}

object UrlData {
  @scala.inline
  def apply(host: AnonHostname, path: AnonBase, query: AnonParams): UrlData = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlData]
  }
}

