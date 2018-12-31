package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the destination of logged messages from LoggingChannel instances. */
@JSGlobal("Windows.Foundation.Diagnostics.LoggingSession")
@js.native
class LoggingSession protected () extends js.Object {
  /**
    * Initializes a new instance of the LoggingSession class.
    * @param name The name of the logging session.
    */
  def this(name: java.lang.String) = this()
  /** Gets the name of the logging session. */
  var name: java.lang.String = js.native
  /**
    * Adds a logging channel to the current logging session.
    * @param loggingChannel The logging channel to add.
    */
  def addLoggingChannel(loggingChannel: ILoggingChannel): scala.Unit = js.native
  /**
    * Adds a logging channel with the specified logging level to the current logging session.
    * @param loggingChannel The logging channel to add.
    * @param maxLevel The logging level for loggingChannel.
    */
  def addLoggingChannel(loggingChannel: ILoggingChannel, maxLevel: LoggingLevel): scala.Unit = js.native
  /** Ends the current logging session. */
  def close(): scala.Unit = js.native
  /**
    * Removes the specified logging channel from the current logging session.
    * @param loggingChannel The logging channel to remove.
    */
  def removeLoggingChannel(loggingChannel: ILoggingChannel): scala.Unit = js.native
  /**
    * Saves the current logging session to a file.
    * @param folder The folder that contains the log file.
    * @param fileName The name of the log file.
    * @return When this method completes, it returns the new file as a StorageFile .
    */
  def saveToFileAsync(folder: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFolder, fileName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
}

