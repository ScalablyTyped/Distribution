package typings.toughDashCookieDashFilestore.toughDashCookieDashFilestoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  var domain: String
  var key: String
  var path: String
}

object Cookie {
  @scala.inline
  def apply(domain: String, key: String, path: String): Cookie = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Cookie]
  }
}

