package typings.xdomain

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDomainCookies extends js.Object {
  var master: String
  var slave: String
}

object XDomainCookies {
  @scala.inline
  def apply(master: String, slave: String): XDomainCookies = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], slave = slave.asInstanceOf[js.Any])
    __obj.asInstanceOf[XDomainCookies]
  }
}

