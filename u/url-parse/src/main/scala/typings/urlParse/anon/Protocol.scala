package typings.urlParse.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Protocol extends js.Object {
  var protocol: String = js.native
  var rest: String = js.native
  var slashes: Boolean = js.native
}

object Protocol {
  @scala.inline
  def apply(protocol: String, rest: String, slashes: Boolean): Protocol = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protocol]
  }
  @scala.inline
  implicit class ProtocolOps[Self <: Protocol] (val x: Self) extends AnyVal {
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
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setRest(value: String): Self = this.set("rest", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlashes(value: Boolean): Self = this.set("slashes", value.asInstanceOf[js.Any])
  }
  
}

