package typings.twit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: Double
  var id_str: String
}

object AnonId {
  @scala.inline
  def apply(id: Double, id_str: String): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], id_str = id_str.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonId]
  }
}

