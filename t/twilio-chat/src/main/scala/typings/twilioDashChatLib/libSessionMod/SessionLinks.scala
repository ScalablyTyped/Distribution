package typings
package twilioDashChatLib.libSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionLinks extends js.Object {
  var mediaServiceUrl: java.lang.String
  var myChannelsUrl: java.lang.String
  var publicChannelsUrl: java.lang.String
  var syncListUrl: java.lang.String
  var typingUrl: java.lang.String
  var usersUrl: java.lang.String
}

object SessionLinks {
  @scala.inline
  def apply(
    mediaServiceUrl: java.lang.String,
    myChannelsUrl: java.lang.String,
    publicChannelsUrl: java.lang.String,
    syncListUrl: java.lang.String,
    typingUrl: java.lang.String,
    usersUrl: java.lang.String
  ): SessionLinks = {
    val __obj = js.Dynamic.literal(mediaServiceUrl = mediaServiceUrl, myChannelsUrl = myChannelsUrl, publicChannelsUrl = publicChannelsUrl, syncListUrl = syncListUrl, typingUrl = typingUrl, usersUrl = usersUrl)
  
    __obj.asInstanceOf[SessionLinks]
  }
}

