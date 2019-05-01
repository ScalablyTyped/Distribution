package typings
package twilioDashChatLib.libChannelMod.ChannelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMediaOptions extends js.Object {
  var contentType: java.lang.String
  var media: java.lang.String | nodeLib.Buffer
}

object SendMediaOptions {
  @scala.inline
  def apply(contentType: java.lang.String, media: java.lang.String | nodeLib.Buffer): SendMediaOptions = {
    val __obj = js.Dynamic.literal(contentType = contentType, media = media.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendMediaOptions]
  }
}

