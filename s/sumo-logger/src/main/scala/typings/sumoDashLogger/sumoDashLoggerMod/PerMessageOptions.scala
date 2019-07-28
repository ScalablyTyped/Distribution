package typings.sumoDashLogger.sumoDashLoggerMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerMessageOptions extends js.Object {
  /** Override a session key set in the `config` call. */
  var sessionKey: String
  /**
    * Defaults to `new Date()` called when processing the log call.
    * Use this when the event being logged occurred
    * at a different time than when the log was sent.
    */
  var timestamp: Date
  /** Override client URL set in the config call. (Node version only) */
  var url: String
}

object PerMessageOptions {
  @scala.inline
  def apply(sessionKey: String, timestamp: Date, url: String): PerMessageOptions = {
    val __obj = js.Dynamic.literal(sessionKey = sessionKey, timestamp = timestamp, url = url)
  
    __obj.asInstanceOf[PerMessageOptions]
  }
}

