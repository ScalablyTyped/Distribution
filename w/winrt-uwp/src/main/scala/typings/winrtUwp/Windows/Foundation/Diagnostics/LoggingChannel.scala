package typings.winrtUwp.Windows.Foundation.Diagnostics

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.loggingenabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a source of log messages. */
@js.native
trait LoggingChannel extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loggingenabled(`type`: loggingenabled, listener: TypedEventHandler[ILoggingChannel, _]): Unit = js.native
  
  /** Ends logging on the current logging channel. */
  def close(): Unit = js.native
  
  /** Gets a value that indicates whether at least one session is logging events from this channel. */
  var enabled: Boolean = js.native
  
  /** Returns the provider identifier for this channel. */
  var id: String = js.native
  
  /**
    * Indicates whether at least one session is listening for events from the channel.
    * @return Returns true if at least one session is listening for events from the channel, and otherwise false.
    */
  def isEnabled(): Boolean = js.native
  /**
    * Indicates whether at least one session is listening for events with the specified event severity level from the channel.
    * @param level The event severity level.
    * @return Returns true if at least one session is listening for events with the specified level from the channel, and otherwise false.
    */
  def isEnabled(level: LoggingLevel): Boolean = js.native
  /**
    * Indicates whether at least one session is listening for events with the specified level and keywords from this channel.
    * @param level The event severity level.
    * @param keywords The keywords. Each bit of the keywords value represents an event category.
    * @return Returns true if at least one session is listening for events with the specified level and keywords from the channel, and otherwise false.
    */
  def isEnabled(level: LoggingLevel, keywords: Double): Boolean = js.native
  
  /** Gets the minimum level at which any session is listening to events from this channel. */
  var level: LoggingLevel = js.native
  
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
    * @param level The level of detail for this event.
    */
  def logEvent(eventName: String, fields: LoggingFields, level: LoggingLevel): Unit = js.native
  /**
    * Logs an event with the specified name, fields, level, and options.
    * @param eventName The name for this event.
    * @param fields The fields for this event. May be null.
    * @param level The level of detail for this event.
    * @param options The options for this event. Pass null to use the default options. The options are for advanced scenarios. The default values are designed to work well for most events.
    */
  def logEvent(eventName: String, fields: LoggingFields, level: LoggingLevel, options: LoggingOptions): Unit = js.native
  
  /**
    * Logs a message to the current LoggingChannel .
    * @param eventString The message to log.
    */
  def logMessage(eventString: String): Unit = js.native
  /**
    * Logs a message to the current LoggingChannel with the specified LoggingLevel .
    * @param eventString The message to log.
    * @param level The logging level.
    */
  def logMessage(eventString: String, level: LoggingLevel): Unit = js.native
  
  /**
    * Logs data to the current LoggingChannel .
    * @param value1 The string to associate with value2.
    * @param value2 The value to associate with value1.
    */
  def logValuePair(value1: String, value2: Double): Unit = js.native
  /**
    * Logs data to the current LoggingChannel with the specified LoggingLevel .
    * @param value1 The string to associate with value2.
    * @param value2 The value to associate with value1.
    * @param level The logging level.
    */
  def logValuePair(value1: String, value2: Double, level: LoggingLevel): Unit = js.native
  
  /** Gets the name of the current LoggingChannel . */
  var name: String = js.native
  
  /** Raised when the logging channel is attached to a LoggingSession or other event tracing and debugging tools. */
  def onloggingenabled(ev: js.Any with WinRTEvent[ILoggingChannel]): Unit = js.native
  /** Raised when the logging channel is attached to a LoggingSession or other event tracing and debugging tools. */
  @JSName("onloggingenabled")
  var onloggingenabled_Original: TypedEventHandler[ILoggingChannel, _] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loggingenabled(`type`: loggingenabled, listener: TypedEventHandler[ILoggingChannel, _]): Unit = js.native
  
  /**
    * Writes an activity start event and creates a LoggingActivity object.
    * @param startEventName The name for this event.
    * @return Returns an object that represents the new activity.
    */
  def startActivity(startEventName: String): LoggingActivity = js.native
  /**
    * Writes an activity start event with the specified fields and creates a LoggingActivity object.
    * @param startEventName The name for this event.
    * @param fields The fields for this event.
    * @return Returns an object that represents the new activity.
    */
  def startActivity(startEventName: String, fields: LoggingFields): LoggingActivity = js.native
  /**
    * Writes an activity start event with the specified fields and level, and creates a LoggingActivity object.
    * @param startEventName The name for this event.
    * @param fields The fields for this event. May be null .
    * @param level The level of detail for this event.
    * @return Returns an object that represents the new activity.
    */
  def startActivity(startEventName: String, fields: LoggingFields, level: LoggingLevel): LoggingActivity = js.native
  /**
    * Writes an activity start event with the specified fields, level, and options, and creates a LoggingActivity object.
    * @param startEventName The name for this event.
    * @param fields The fields for this event. May be null.
    * @param level The level of detail for this event.
    * @param options The options for this event. Pass null to use the default options. The options are for advanced scenarios. The default values are designed to work well for most events.
    * @return Returns an object that represents the new activity.
    */
  def startActivity(startEventName: String, fields: LoggingFields, level: LoggingLevel, options: LoggingOptions): LoggingActivity = js.native
}
