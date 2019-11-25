package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Log message details. */
trait LogMessage
  extends /** LogMessage accepts additional properties. */
/* propName */ StringDictionary[js.Any] {
  /** The severity of the log message. */
  var level: String
  /** The text of the log message. */
  var msg: String
}

object LogMessage {
  @scala.inline
  def apply(
    level: String,
    msg: String,
    StringDictionary: /** LogMessage accepts additional properties. */
  /* propName */ StringDictionary[js.Any] = null
  ): LogMessage = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LogMessage]
  }
}

