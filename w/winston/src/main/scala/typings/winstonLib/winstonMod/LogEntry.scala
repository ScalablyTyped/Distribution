package typings
package winstonLib.winstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEntry
  extends /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var level: java.lang.String
  var message: java.lang.String
}

object LogEntry {
  @scala.inline
  def apply(
    level: java.lang.String,
    message: java.lang.String,
    StringDictionary: /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): LogEntry = {
    val __obj = js.Dynamic.literal(level = level, message = message)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LogEntry]
  }
}

