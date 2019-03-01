package typings
package twitterDashTextLib.twitterDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashtagWithIndices extends EntityWithIndices {
  var hashtag: java.lang.String
  var indices: js.Tuple2[scala.Double, scala.Double]
}

object HashtagWithIndices {
  @scala.inline
  def apply(hashtag: java.lang.String, indices: js.Tuple2[scala.Double, scala.Double]): HashtagWithIndices = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hashtag")(hashtag)
    __obj.updateDynamic("indices")(indices)
    __obj.asInstanceOf[HashtagWithIndices]
  }
}

