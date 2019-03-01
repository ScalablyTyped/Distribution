package typings
package xdomainLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDomainCookies extends js.Object {
  var master: java.lang.String
  var slave: java.lang.String
}

object XDomainCookies {
  @scala.inline
  def apply(master: java.lang.String, slave: java.lang.String): XDomainCookies = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("master")(master)
    __obj.updateDynamic("slave")(slave)
    __obj.asInstanceOf[XDomainCookies]
  }
}

