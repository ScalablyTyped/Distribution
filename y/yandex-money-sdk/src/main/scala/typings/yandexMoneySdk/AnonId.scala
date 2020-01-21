package typings.yandexMoneySdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: String
  var pan_fragment: String
  var `type`: String
}

object AnonId {
  @scala.inline
  def apply(id: String, pan_fragment: String, `type`: String): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pan_fragment = pan_fragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

