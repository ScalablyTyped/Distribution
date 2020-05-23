package typings.winrtUwp.global.Windows.Foundation.Diagnostics

import typings.winrtUwp.Windows.Foundation.Diagnostics.ILoggingChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates Event Tracing for Windows (ETW) events that mark the start and end of a group of related events. */
@JSGlobal("Windows.Foundation.Diagnostics.LoggingActivity")
@js.native
class LoggingActivity protected ()
  extends typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingActivity {
  /**
    * Initializes a new instance of the LoggingActivity class for the specified LoggingChannel in Windows 8.1 compatibility mode.
    * @param activityName The name of the logging activity.
    * @param loggingChannel The logging channel.
    */
  def this(activityName: String, loggingChannel: ILoggingChannel) = this()
  /**
    * Initializes a new instance of the LoggingActivity class for the specified LoggingChannel and LoggingLevel in Windows 8.1 compatibility mode.
    * @param activityName The name of the logging activity.
    * @param loggingChannel The logging channel.
    * @param level The logging level.
    */
  def this(
    activityName: String,
    loggingChannel: ILoggingChannel,
    level: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingLevel
  ) = this()
}

