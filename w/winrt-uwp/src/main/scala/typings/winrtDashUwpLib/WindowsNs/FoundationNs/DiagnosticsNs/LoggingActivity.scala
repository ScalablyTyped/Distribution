package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates Event Tracing for Windows (ETW) events that mark the start and end of a group of related events. */
@JSGlobal("Windows.Foundation.Diagnostics.LoggingActivity")
@js.native
class LoggingActivity protected () extends js.Object {
  /**
                   * Initializes a new instance of the LoggingActivity class for the specified LoggingChannel in Windows 8.1 compatibility mode.
                   * @param activityName The name of the logging activity.
                   * @param loggingChannel The logging channel.
                   */
  def this(activityName: java.lang.String, loggingChannel: ILoggingChannel) = this()
  /**
                   * Initializes a new instance of the LoggingActivity class for the specified LoggingChannel and LoggingLevel in Windows 8.1 compatibility mode.
                   * @param activityName The name of the logging activity.
                   * @param loggingChannel The logging channel.
                   * @param level The logging level.
                   */
  def this(activityName: java.lang.String, loggingChannel: ILoggingChannel, level: LoggingLevel) = this()
  /** Returns the channel associated with this activity. */
  var channel: LoggingChannel = js.native
  /** Gets the identifier for the current logging activity. */
  var id: java.lang.String = js.native
  /** Gets the name of the current logging activity. */
  var name: java.lang.String = js.native
  /** Ends the current logging activity. */
  def close(): scala.Unit = js.native
  /**
                   * Indicates whether at least one session is listening for events from the channel associated with this activity.
                   * @return Returns true if at least one session is listening for events from the channel associated with this activity, and otherwise false.
                   */
  def isEnabled(): scala.Boolean = js.native
  /**
                   * Indicates whether at least one session is listening for events with the specified event severity level from the channel associated with this activity.
                   * @param level The event severity level.
                   * @return Returns true if at least one session is listening for events with the specified level from the channel associated with this activity, and otherwise false.
                   */
  def isEnabled(level: LoggingLevel): scala.Boolean = js.native
  /**
                   * Indicates whether at least one session is listening for events with the specified level and keywords from the channel associated with this activity.
                   * @param level The event severity level.
                   * @param keywords The keywords. Each bit of the keywords value represents an event category.
                   * @return Returns true if at least one session is listening for events with the specified level and keywords from the channel associated with this activity, and otherwise false.
                   */
  def isEnabled(level: LoggingLevel, keywords: scala.Double): scala.Boolean = js.native
  /**
                   * Logs an event with the specified name.
                   * @param eventName The name for this event.
                   */
  def logEvent(eventName: java.lang.String): scala.Unit = js.native
  /**
                   * Logs an event with the specified name and fields.
                   * @param eventName The name for this event.
                   * @param fields The fields for this event. May be null.
                   */
  def logEvent(eventName: java.lang.String, fields: LoggingFields): scala.Unit = js.native
  /**
                   * Logs an event with the specified name, fields, and level.
                   * @param eventName The name for this event.
                   * @param fields The fields for this event. May be null.
                   * @param level The severity level for this event.
                   */
  def logEvent(eventName: java.lang.String, fields: LoggingFields, level: LoggingLevel): scala.Unit = js.native
  /**
                   * Logs an event with the specified name, fields, level, and options.
                   * @param eventName The name for this event.
                   * @param fields The fields for this event. May be null.
                   * @param level The severity level for this event.
                   * @param options The options for this event. Pass null to use the default options. The options are for advanced scenarios. The default values are designed to work well for most events.
                   */
  def logEvent(eventName: java.lang.String, fields: LoggingFields, level: LoggingLevel, options: LoggingOptions): scala.Unit = js.native
  /**
                   * Writes an activity start event and creates a LoggingActivity object.
                   * @param startEventName The name for the start event.
                   * @return An object the represents the new activity.
                   */
  def startActivity(startEventName: java.lang.String): LoggingActivity = js.native
  /**
                   * Writes an activity start event with fields and creates a LoggingActivity object.
                   * @param startEventName The name for the start event.
                   * @param fields The fields for this event.
                   * @return An object that represents the new activity.
                   */
  def startActivity(startEventName: java.lang.String, fields: LoggingFields): LoggingActivity = js.native
  /**
                   * Writes an activity start event with the specified fields and level and creates a LoggingActivity object.
                   * @param startEventName The name for the start event.
                   * @param fields The fields for this event. May be null .
                   * @param level The level of detail for this event.
                   * @return An object that represents the new activity.
                   */
  def startActivity(startEventName: java.lang.String, fields: LoggingFields, level: LoggingLevel): LoggingActivity = js.native
  /**
                   * Writes an activity start event with the specified fields, level, and options, and creates a LoggingActivity object.
                   * @param startEventName The name for this event.
                   * @param fields The fields for this event. May be null.
                   * @param level The level of detail for this event.
                   * @param options The options for this event. Pass null to use the default options. The options are for advanced scenarios. The default values are designed to work well for most events.
                   * @return An object that represents the new activity.
                   */
  def startActivity(
    startEventName: java.lang.String,
    fields: LoggingFields,
    level: LoggingLevel,
    options: LoggingOptions
  ): LoggingActivity = js.native
  /**
                   * Marks the activity as closed/disposed and generates a stop event with the specified event name.
                   * @param stopEventName The name for the stop event.
                   */
  def stopActivity(stopEventName: java.lang.String): scala.Unit = js.native
  /**
                   * Marks the activity as closed/disposed and generates a stop event with the specified event name and fields.
                   * @param stopEventName The name for this event.
                   * @param fields The fields for this event. May be null.
                   */
  def stopActivity(stopEventName: java.lang.String, fields: LoggingFields): scala.Unit = js.native
  /**
                   * Marks the activity as closed/disposed and generates a stop event with the specified event name, fields, and options.
                   * @param stopEventName The name for the stop event.
                   * @param fields The fields for this event. May be null.
                   * @param options The options for this event. Pass null to use the default options. The options are for advanced scenarios. The default values are designed to work well for most events.
                   */
  def stopActivity(stopEventName: java.lang.String, fields: LoggingFields, options: LoggingOptions): scala.Unit = js.native
}

