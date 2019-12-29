package typings.twilioDashNotifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-notifications/lib/logger", JSImport.Namespace)
@js.native
object libLoggerMod extends js.Object {
  @js.native
  class Logger () extends js.Object {
    var prefix: js.Any = js.native
    def debug(args: js.Any*): Unit = js.native
    def error(args: js.Any*): Unit = js.native
    def info(args: js.Any*): Unit = js.native
    def setLevel(level: js.Any): Unit = js.native
    def trace(args: js.Any*): Unit = js.native
    def warn(args: js.Any*): Unit = js.native
  }
  
  var log: Logger = js.native
  /* static members */
  @js.native
  object Logger extends js.Object {
    def scope(): Logger = js.native
    def scope(prefix: String): Logger = js.native
  }
  
}

