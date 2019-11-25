package typings.twit.twitMod.Twitter

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
    val __obj = js.Dynamic.literal(hashtags = hashtags.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], user_mentions = user_mentions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Entities]
  }
}

