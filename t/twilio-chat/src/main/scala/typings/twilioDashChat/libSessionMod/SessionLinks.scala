package typings.twilioDashChat.libSessionMod

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
    val __obj = js.Dynamic.literal(mediaServiceUrl = mediaServiceUrl, myChannelsUrl = myChannelsUrl, publicChannelsUrl = publicChannelsUrl, syncListUrl = syncListUrl, typingUrl = typingUrl, usersUrl = usersUrl)
  
    __obj.asInstanceOf[SessionLinks]
  }
}

