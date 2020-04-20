package typings.twilioSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: js.Object
  var key: String
  var revision: Double
}

object AnonData {
  @scala.inline
  def apply(data: js.Object, key: String, revision: Double): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

