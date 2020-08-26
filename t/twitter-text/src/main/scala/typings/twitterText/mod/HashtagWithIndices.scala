package typings.twitterText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashtagWithIndices extends EntityWithIndices {
  var hashtag: String = js.native
  var indices: js.Tuple2[Double, Double] = js.native
}

object HashtagWithIndices {
  @scala.inline
  def apply(hashtag: String, indices: js.Tuple2[Double, Double]): HashtagWithIndices = {
    val __obj = js.Dynamic.literal(hashtag = hashtag.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashtagWithIndices]
  }
  @scala.inline
  implicit class HashtagWithIndicesOps[Self <: HashtagWithIndices] (val x: Self) extends AnyVal {
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
    def setHashtag(value: String): Self = this.set("hashtag", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndices(value: js.Tuple2[Double, Double]): Self = this.set("indices", value.asInstanceOf[js.Any])
  }
  
}

