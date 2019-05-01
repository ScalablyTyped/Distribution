package typings
package twilioDashSyncLib.libStreamsServerapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamDescriptor extends js.Object {
  var date_expires: java.lang.String
  var links: StreamLinks
  var sid: java.lang.String
  var unique_name: java.lang.String
  var url: java.lang.String
}

object StreamDescriptor {
  @scala.inline
  def apply(
    date_expires: java.lang.String,
    links: StreamLinks,
    sid: java.lang.String,
    unique_name: java.lang.String,
    url: java.lang.String
  ): StreamDescriptor = {
    val __obj = js.Dynamic.literal(date_expires = date_expires, links = links, sid = sid, unique_name = unique_name, url = url)
  
    __obj.asInstanceOf[StreamDescriptor]
  }
}

