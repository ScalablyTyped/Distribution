package typings.twit.twitMod.TwitterNs

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
    val __obj = js.Dynamic.literal(indices = indices, text = text)
  
    __obj.asInstanceOf[HashtagEntity]
  }
}

