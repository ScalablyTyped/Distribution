package typings
package toughDashCookieDashFilestoreLib.toughDashCookieDashFilestoreMod.FileCookieStoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  var domain: java.lang.String
  var key: java.lang.String
  var path: java.lang.String
}

object Cookie {
  @scala.inline
  def apply(domain: java.lang.String, key: java.lang.String, path: java.lang.String): Cookie = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Cookie]
  }
}

