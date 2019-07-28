package typings.twilioDashSync.libStreamsServerapiMod

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
    val __obj = js.Dynamic.literal(date_expires = date_expires, links = links, sid = sid, unique_name = unique_name, url = url)
  
    __obj.asInstanceOf[StreamDescriptor]
  }
}

