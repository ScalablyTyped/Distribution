package typings
package urlparserLib.urlparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlData extends js.Object {
  var host: urlparserLib.Anon_Hostname
  var path: urlparserLib.Anon_Base
  var query: urlparserLib.Anon_Params
}

object UrlData {
  @scala.inline
  def apply(
    host: urlparserLib.Anon_Hostname,
    path: urlparserLib.Anon_Base,
    query: urlparserLib.Anon_Params,
    toString: () => java.lang.String
  ): UrlData = {
    val __obj = js.Dynamic.literal(host = host, path = path, query = query, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[UrlData]
  }
}

