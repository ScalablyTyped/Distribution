package typings.twilioChat.sessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionLinks extends js.Object {
  var mediaServiceUrl: String = js.native
  var myChannelsUrl: String = js.native
  var publicChannelsUrl: String = js.native
  var syncListUrl: String = js.native
  var typingUrl: String = js.native
  var usersUrl: String = js.native
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
  @scala.inline
  implicit class SessionLinksOps[Self <: SessionLinks] (val x: Self) extends AnyVal {
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
    def setMediaServiceUrl(value: String): Self = this.set("mediaServiceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setMyChannelsUrl(value: String): Self = this.set("myChannelsUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicChannelsUrl(value: String): Self = this.set("publicChannelsUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setSyncListUrl(value: String): Self = this.set("syncListUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypingUrl(value: String): Self = this.set("typingUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsersUrl(value: String): Self = this.set("usersUrl", value.asInstanceOf[js.Any])
  }
  
}

