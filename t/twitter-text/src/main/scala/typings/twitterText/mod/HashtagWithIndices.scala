package typings.twitterText.mod

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
    val __obj = js.Dynamic.literal(hashtag = hashtag.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashtagWithIndices]
  }
}

