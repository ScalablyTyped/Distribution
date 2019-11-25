package typings.urlparser.urlparserMod

import typings.urlparser.Anon_Base
import typings.urlparser.Anon_Hostname
import typings.urlparser.Anon_Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlData extends js.Object {
  var host: Anon_Hostname
  var path: Anon_Base
  var query: Anon_Params
}

object UrlData {
  @scala.inline
  def apply(host: Anon_Hostname, path: Anon_Base, query: Anon_Params): UrlData = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UrlData]
  }
}

