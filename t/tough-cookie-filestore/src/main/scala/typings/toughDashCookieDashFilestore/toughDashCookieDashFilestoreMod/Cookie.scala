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
    val __obj = js.Dynamic.literal(domain = domain, key = key, path = path)
  
    __obj.asInstanceOf[Cookie]
  }
}

