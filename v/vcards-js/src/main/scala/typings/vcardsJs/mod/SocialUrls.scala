package typings.vcardsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocialUrls extends js.Object {
  var facebook: String = js.native
  var flickr: String = js.native
  var linkedIn: String = js.native
  var twitter: String = js.native
}

object SocialUrls {
  @scala.inline
  def apply(facebook: String, flickr: String, linkedIn: String, twitter: String): SocialUrls = {
    val __obj = js.Dynamic.literal(facebook = facebook.asInstanceOf[js.Any], flickr = flickr.asInstanceOf[js.Any], linkedIn = linkedIn.asInstanceOf[js.Any], twitter = twitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialUrls]
  }
  @scala.inline
  implicit class SocialUrlsOps[Self <: SocialUrls] (val x: Self) extends AnyVal {
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
    def setFacebook(value: String): Self = this.set("facebook", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlickr(value: String): Self = this.set("flickr", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkedIn(value: String): Self = this.set("linkedIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwitter(value: String): Self = this.set("twitter", value.asInstanceOf[js.Any])
  }
  
}

