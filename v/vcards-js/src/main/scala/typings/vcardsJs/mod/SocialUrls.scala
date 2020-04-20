package typings.vcardsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocialUrls extends js.Object {
  var facebook: String
  var flickr: String
  var linkedIn: String
  var twitter: String
}

object SocialUrls {
  @scala.inline
  def apply(facebook: String, flickr: String, linkedIn: String, twitter: String): SocialUrls = {
    val __obj = js.Dynamic.literal(facebook = facebook.asInstanceOf[js.Any], flickr = flickr.asInstanceOf[js.Any], linkedIn = linkedIn.asInstanceOf[js.Any], twitter = twitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialUrls]
  }
}

