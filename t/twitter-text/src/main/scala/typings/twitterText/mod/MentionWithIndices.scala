package typings.twitterText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionWithIndices extends EntityWithIndices {
  var indices: js.Tuple2[Double, Double]
  var screenName: String
}

object MentionWithIndices {
  @scala.inline
  def apply(indices: js.Tuple2[Double, Double], screenName: String): MentionWithIndices = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], screenName = screenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MentionWithIndices]
  }
}

