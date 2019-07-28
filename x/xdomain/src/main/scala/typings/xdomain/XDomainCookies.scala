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
    val __obj = js.Dynamic.literal(master = master, slave = slave)
  
    __obj.asInstanceOf[XDomainCookies]
  }
}

