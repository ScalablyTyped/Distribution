package typings.wxServerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var _id: String | Double
  var stats: Anon01
}

object AnonId {
  @scala.inline
  def apply(_id: String | Double, stats: Anon01): AnonId = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonId]
  }
}

