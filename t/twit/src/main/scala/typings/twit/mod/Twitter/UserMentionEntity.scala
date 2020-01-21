package typings.twit.mod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserMentionEntity extends js.Object {
  var id: Double
  var id_str: String
  var indices: js.Tuple2[Double, Double]
  var name: String
  var screen_name: String
}

object UserMentionEntity {
  @scala.inline
  def apply(id: Double, id_str: String, indices: js.Tuple2[Double, Double], name: String, screen_name: String): UserMentionEntity = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], id_str = id_str.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], screen_name = screen_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserMentionEntity]
  }
}

