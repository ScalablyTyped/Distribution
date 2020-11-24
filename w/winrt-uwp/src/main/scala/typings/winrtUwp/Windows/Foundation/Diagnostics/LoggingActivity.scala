package typings.winrtUwp.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Creates Event Tracing for Windows (ETW) events that mark the start and end of a group of related events. */
@js.native
trait LoggingActivity extends js.Object {
  
  /** Returns the channel associated with this activity. */
  var channel: LoggingChannel = js.native
  
  /** Ends the current logging activity. */
  def close(): Unit = js.native
  
  /** Gets the identifier for the current logging activity. */
  var id: String = js.native
  
  /**
    * Indicates whether at least one session is listening for events from the channel associated with this activity.
    * @return Returns true if at least one session is listening for events from the channel associated with this activity, and otherwise false.
    */
  def isEnabled(): Boolean = js.native
  /**
    * Indicates whether at least one session is listening for events with the specified event severity level from the channel associated with this activity.
    * @param level The event severity level.
    * @return Returns true if at least one session is listening for events with the specified level from the channel associated with this activity, and otherwise false.
    */
  def isEnabled(level: LoggingLevel): Boolean = js.native
  /**
    * Indicates whether at least one session is listening for events with the specified level and keywords from the channel associated with this activity.
    * @param level The event severity level.
    * @param keywords The keywords. Each bit of the keywords value represents an event category.
    * @return Returns true if at least one session is listening for events with the specified level and keywords from the channel associated with this activity, and otherwise false.
    */
  def isEnabled(level: LoggingLevel, keywords: Double): Boolean = js.native
  
  /**
    * Logs an event with the specified name.
    * @param eventName The name for this event.
    */
  def logEvent(eventName: String): Unit = js.native
  /**
    * Logs an event with the specified name and fields.
    * @param eventName The name for this event.
    * @param fields The fields for this event. May be null.
    */
  def logEvent(eventName: String, fields: LoggingFields): Unit = js.native
  /**
    * Logs an event with the specified name, fields, and level.
    * @param eventName The name for this event.
    * @param fields The fields for this event. May be null.
    * @param level The severity level for this event.
    */
  def logEvent(eventName: String, fields: LoggingFields, level: LoggingLevel): Unit = js.native
  /**
    * Logs an event with the specified name, fields, level, and options.
    * @param eventName The name for this event.
    * @param fields The fields for this event. May be null.
    * @param level The severity level for this event.
    * @param options The options for this event. Pass null to use the default options. The options are for advanced scenarios. The default values are designed to work well for most events.
    */
  def logEvent(eventName: String, fields: LoggingFields, level: LoggingLevel, options: LoggingOptions): Unit = js.native
  
  /** Gets the name of the current logging activity. */
  var name: String = js.native
  
  /**
    * Writes an activity start event and creates a LoggingActivity object.
    * @param startEventName The name for the start event.
    * @return An object the represents the new activity.
    */
  def startActivity(startEventName: String): LoggingActivity = js.native
  /**
    * Writes an activity start event with fields and creates a LoggingActivity object.
    * @param startEventName The name for the start event.
    * @param fields The fields for this event.
    * @return An object that represents the new activity.
    */
  def startActivity(startEventName: String, fields: LoggingFields): LoggingActivity = js.native
  /**
    * Writes an activity start event with the specified fields and level and creates a LoggingActivity object.
    * @param startEventName The name for the start event.
    * @param fields The fields for this event. May be null .
    * @param level The level of detail for this event.
    * @return An object that represents the new activity.
    */
  def startActivity(startEventName: String, fields: LoggingFields, level: LoggingLevel): LoggingActivity = js.native
  /**
    * Writes an activity start event with the specified fields, level, and options, and creates a LoggingActivity object.
    * @param startEventName The name for this event.
    * @param fields The fields for this event. May be null.
    * @param level The level of detail for this event.
    * @param options The options for this event. Pass null to use the default options. The options are for advanced scenarios. The default values are designed to work well for most events.
    * @return An object that represents the new activity.
    */
  def startActivity(startEventName: String, fields: LoggingFields, level: LoggingLevel, options: LoggingOptions): LoggingActivity = js.native
  
  /**
    * Marks the activity as closed/disposed and generates a stop event with the specified event name.
    * @param stopEventName The name for the stop event.
    */
  def stopActivity(stopEventName: String): Unit = js.native
  /**
    * Marks the activity as closed/disposed and generates a stop event with the specified event name and fields.
    * @param stopEventName The name for this event.
    * @param fields The fields for this event. May be null.
    */
  def stopActivity(stopEventName: String, fields: LoggingFields): Unit = js.native
  /**
    * Marks the activity as closed/disposed and generates a stop event with the specified event name, fields, and options.
    * @param stopEventName The name for the stop event.
    * @param fields The fields for this event. May be null.
    * @param options The options for this event. Pass null to use the default options. The options are for advanced scenarios. The default values are designed to work well for most events.
    */
  def stopActivity(stopEventName: String, fields: LoggingFields, options: LoggingOptions): Unit = js.native
}
