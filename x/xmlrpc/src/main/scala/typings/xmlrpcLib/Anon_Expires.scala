package typings
package xmlrpcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expires extends js.Object {
  var expires: stdLib.Date
  var secure: scala.Boolean
}

object Anon_Expires {
  @scala.inline
  def apply(expires: stdLib.Date, secure: scala.Boolean): Anon_Expires = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expires")(expires)
    __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[Anon_Expires]
  }
}

