package typings.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Dialog log message details. */
trait DialogLogMessage extends js.Object {
  /** The severity of the log message. */
  var level: String
  /** The text of the log message. */
  var message: String
}

object DialogLogMessage {
  @scala.inline
  def apply(level: String, message: String): DialogLogMessage = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DialogLogMessage]
  }
}

