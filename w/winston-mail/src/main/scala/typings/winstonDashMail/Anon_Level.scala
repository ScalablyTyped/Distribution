package typings.winstonDashMail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Level extends js.Object {
  var level: String
  var message: String
  var meta: js.Any
}

object Anon_Level {
  @scala.inline
  def apply(level: String, message: String, meta: js.Any): Anon_Level = {
    val __obj = js.Dynamic.literal(level = level, message = message, meta = meta)
  
    __obj.asInstanceOf[Anon_Level]
  }
}

