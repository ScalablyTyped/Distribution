package typings.twitterDashText.twitterDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashtagWithIndices extends EntityWithIndices {
  var hashtag: String
  var indices: js.Tuple2[Double, Double]
}

object HashtagWithIndices {
  @scala.inline
  def apply(hashtag: String, indices: js.Tuple2[Double, Double]): HashtagWithIndices = {
    val __obj = js.Dynamic.literal(hashtag = hashtag, indices = indices)
  
    __obj.asInstanceOf[HashtagWithIndices]
  }
}

