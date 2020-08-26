package typings.twilioSync.serverapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamDescriptor extends js.Object {
  var date_expires: String = js.native
  var links: StreamLinks = js.native
  var sid: String = js.native
  var unique_name: String = js.native
  var url: String = js.native
}

object StreamDescriptor {
  @scala.inline
  def apply(date_expires: String, links: StreamLinks, sid: String, unique_name: String, url: String): StreamDescriptor = {
    val __obj = js.Dynamic.literal(date_expires = date_expires.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamDescriptor]
  }
  @scala.inline
  implicit class StreamDescriptorOps[Self <: StreamDescriptor] (val x: Self) extends AnyVal {
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
    def setDate_expires(value: String): Self = this.set("date_expires", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinks(value: StreamLinks): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def setSid(value: String): Self = this.set("sid", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnique_name(value: String): Self = this.set("unique_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

