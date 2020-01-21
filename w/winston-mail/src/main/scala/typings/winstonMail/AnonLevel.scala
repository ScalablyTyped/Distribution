package typings.winstonMail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevel extends js.Object {
  var level: String
  var message: String
  var meta: js.Any
}

object AnonLevel {
  @scala.inline
  def apply(level: String, message: String, meta: js.Any): AnonLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLevel]
  }
}

