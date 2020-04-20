package typings.twilioChat.sessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionLinks extends js.Object {
  var mediaServiceUrl: String
  var myChannelsUrl: String
  var publicChannelsUrl: String
  var syncListUrl: String
  var typingUrl: String
  var usersUrl: String
}

object SessionLinks {
  @scala.inline
  def apply(
    mediaServiceUrl: String,
    myChannelsUrl: String,
    publicChannelsUrl: String,
    syncListUrl: String,
    typingUrl: String,
    usersUrl: String
  ): SessionLinks = {
    val __obj = js.Dynamic.literal(mediaServiceUrl = mediaServiceUrl.asInstanceOf[js.Any], myChannelsUrl = myChannelsUrl.asInstanceOf[js.Any], publicChannelsUrl = publicChannelsUrl.asInstanceOf[js.Any], syncListUrl = syncListUrl.asInstanceOf[js.Any], typingUrl = typingUrl.asInstanceOf[js.Any], usersUrl = usersUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionLinks]
  }
}

