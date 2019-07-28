package typings.winston.winstonMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEntry
  extends /* optionName */ StringDictionary[js.Any] {
  var level: String
  var message: String
}

object LogEntry {
  @scala.inline
  def apply(level: String, message: String, StringDictionary: /* optionName */ StringDictionary[js.Any] = null): LogEntry = {
    val __obj = js.Dynamic.literal(level = level, message = message)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LogEntry]
  }
}

