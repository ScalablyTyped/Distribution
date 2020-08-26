package typings.webgme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DSN extends js.Object {
  var DSN: String = js.native
  var enable: Boolean = js.native
  var ravenOptions: Null | String = js.native
}

object DSN {
  @scala.inline
  def apply(DSN: String, enable: Boolean): DSN = {
    val __obj = js.Dynamic.literal(DSN = DSN.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSN]
  }
  @scala.inline
  implicit class DSNOps[Self <: DSN] (val x: Self) extends AnyVal {
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
    def setDSN(value: String): Self = this.set("DSN", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def setRavenOptions(value: String): Self = this.set("ravenOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setRavenOptionsNull: Self = this.set("ravenOptions", null)
  }
  
}

