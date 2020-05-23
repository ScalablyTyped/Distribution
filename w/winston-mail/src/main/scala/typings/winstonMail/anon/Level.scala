package typings.winstonMail.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  var level: String
  var message: String
  var meta: js.Any
}

object Level {
  @scala.inline
  def apply(level: String, message: String, meta: js.Any): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
}

