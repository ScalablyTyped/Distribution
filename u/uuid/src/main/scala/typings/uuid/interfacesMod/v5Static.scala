package typings.uuid.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait v5Static extends js.Object {
  // https://github.com/uuidjs/uuid/blob/master/src/v35.js#L22
  var DNS: String = js.native
  // https://github.com/uuidjs/uuid/blob/master/src/v35.js#L23
  var URL: String = js.native
}

object v5Static {
  @scala.inline
  def apply(DNS: String, URL: String): v5Static = {
    val __obj = js.Dynamic.literal(DNS = DNS.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[v5Static]
  }
  @scala.inline
  implicit class v5StaticOps[Self <: v5Static] (val x: Self) extends AnyVal {
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
    def setDNS(value: String): Self = this.set("DNS", value.asInstanceOf[js.Any])
    @scala.inline
    def setURL(value: String): Self = this.set("URL", value.asInstanceOf[js.Any])
  }
  
}

