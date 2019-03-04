package typings
package winstonDashMailLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Level extends js.Object {
  var level: java.lang.String
  var message: java.lang.String
  var meta: js.Any
}

object Anon_Level {
  @scala.inline
  def apply(level: java.lang.String, message: java.lang.String, meta: js.Any): Anon_Level = {
    val __obj = js.Dynamic.literal(level = level, message = message, meta = meta)
  
    __obj.asInstanceOf[Anon_Level]
  }
}

