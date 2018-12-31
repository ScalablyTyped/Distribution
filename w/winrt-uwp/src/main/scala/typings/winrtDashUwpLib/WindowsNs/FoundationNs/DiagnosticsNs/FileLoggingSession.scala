package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the destination of logged messages from LoggingChannel instances. */
@JSGlobal("Windows.Foundation.Diagnostics.FileLoggingSession")
@js.native
class FileLoggingSession protected () extends js.Object {
  /**
    * Initializes a new instance of the FileLoggingSession class.
    * @param name The name of the logging session.
    */
  def this(name: java.lang.String) = this()
  /** Gets the name of the logging session. */
  var name: java.lang.String = js.native
  /** Raised when a log file is saved. */
  @JSName("onlogfilegenerated")
  var onlogfilegenerated_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IFileLoggingSession, LogFileGeneratedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_logfilegenerated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.logfilegenerated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IFileLoggingSession, LogFileGeneratedEventArgs]
  ): scala.Unit = js.native
  /**
    * Adds a logging channel to the current logging session.
    * @param loggingChannel The logging channel to add.
    */
  def addLoggingChannel(loggingChannel: ILoggingChannel): scala.Unit = js.native
  /**
    * Adds a logging channel to the current logging session. The logging channel only accepts events that have a logging level at or above the specified logging level.
    * @param loggingChannel The logging channel to add.
    * @param maxLevel The minimum logging level that an event must have to be accepted by the session.
    */
  def addLoggingChannel(loggingChannel: ILoggingChannel, maxLevel: LoggingLevel): scala.Unit = js.native
  /** Ends the current logging session. */
  def close(): scala.Unit = js.native
  /**
    * Ends the current logging session and saves it to a file.
    * @return When this method completes, it returns the new file as a StorageFile . Returns NULL if there are no events in the session or if logging has just rolled over into a new file that doesn't contain events yet.
    */
  def closeAndSaveToFileAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
  /** Raised when a log file is saved. */
  def onlogfilegenerated(ev: LogFileGeneratedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[IFileLoggingSession]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_logfilegenerated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.logfilegenerated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IFileLoggingSession, LogFileGeneratedEventArgs]
  ): scala.Unit = js.native
  /**
    * Removes the specified logging channel from the current logging session.
    * @param loggingChannel The logging channel to remove.
    */
  def removeLoggingChannel(loggingChannel: ILoggingChannel): scala.Unit = js.native
}

