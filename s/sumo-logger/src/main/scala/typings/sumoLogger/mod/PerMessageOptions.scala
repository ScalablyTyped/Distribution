package typings.sumoLogger.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerMessageOptions extends js.Object {
  /** Override a session key set in the `config` call. */
  var sessionKey: String = js.native
  /**
    * Defaults to `new Date()` called when processing the log call.
    * Use this when the event being logged occurred
    * at a different time than when the log was sent.
    */
  var timestamp: Date = js.native
  /** Override client URL set in the config call. (Node version only) */
  var url: String = js.native
}

object PerMessageOptions {
  @scala.inline
  def apply(sessionKey: String, timestamp: Date, url: String): PerMessageOptions = {
    val __obj = js.Dynamic.literal(sessionKey = sessionKey.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerMessageOptions]
  }
  @scala.inline
  implicit class PerMessageOptionsOps[Self <: PerMessageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSessionKey(value: String): Self = this.set("sessionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

