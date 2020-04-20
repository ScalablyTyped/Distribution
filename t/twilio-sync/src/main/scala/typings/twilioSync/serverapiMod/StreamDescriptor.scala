package typings.twilioSync.serverapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamDescriptor extends js.Object {
  var date_expires: String
  var links: StreamLinks
  var sid: String
  var unique_name: String
  var url: String
}

object StreamDescriptor {
  @scala.inline
  def apply(date_expires: String, links: StreamLinks, sid: String, unique_name: String, url: String): StreamDescriptor = {
    val __obj = js.Dynamic.literal(date_expires = date_expires.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamDescriptor]
  }
}

