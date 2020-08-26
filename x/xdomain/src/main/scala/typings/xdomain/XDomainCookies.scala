package typings.xdomain

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XDomainCookies extends js.Object {
  var master: String = js.native
  var slave: String = js.native
}

object XDomainCookies {
  @scala.inline
  def apply(master: String, slave: String): XDomainCookies = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], slave = slave.asInstanceOf[js.Any])
    __obj.asInstanceOf[XDomainCookies]
  }
  @scala.inline
  implicit class XDomainCookiesOps[Self <: XDomainCookies] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaster(value: String): Self = this.set("master", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlave(value: String): Self = this.set("slave", value.asInstanceOf[js.Any])
  }
  
}

