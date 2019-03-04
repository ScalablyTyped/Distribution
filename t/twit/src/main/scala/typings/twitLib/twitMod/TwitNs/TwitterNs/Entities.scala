package typings
package twitLib.twitMod.TwitNs.TwitterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entities extends js.Object {
  var hashtags: js.Array[HashtagEntity]
  var media: js.Array[MediaEntity]
  var urls: js.Array[UrlEntity]
  var user_mentions: js.Array[UserMentionEntity]
}

object Entities {
  @scala.inline
  def apply(
    hashtags: js.Array[HashtagEntity],
    media: js.Array[MediaEntity],
    urls: js.Array[UrlEntity],
    user_mentions: js.Array[UserMentionEntity]
  ): Entities = {
    val __obj = js.Dynamic.literal(hashtags = hashtags, media = media, urls = urls, user_mentions = user_mentions)
  
    __obj.asInstanceOf[Entities]
  }
}

