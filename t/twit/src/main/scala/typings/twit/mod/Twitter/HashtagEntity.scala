package typings.twit.mod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashtagEntity extends js.Object {
  var indices: js.Tuple2[Double, Double]
  var text: String
}

object HashtagEntity {
  @scala.inline
  def apply(indices: js.Tuple2[Double, Double], text: String): HashtagEntity = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HashtagEntity]
  }
}

