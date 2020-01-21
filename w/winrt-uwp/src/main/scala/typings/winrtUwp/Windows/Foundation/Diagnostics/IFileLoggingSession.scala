package typings.winrtUwp.Windows.Foundation.Diagnostics

import typings.winrtUwp.Windows.Foundation.IClosable
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the destination of logged messages from LoggingChannel instances. */
@js.native
trait IFileLoggingSession extends IClosable {
  /** Gets the name of the logging session. */
  var name: String = js.native
  /**
    * Adds a logging channel to the current logging session.
    * @param loggingChannel The logging channel to add.
    */
  def addLoggingChannel(loggingChannel: ILoggingChannel): Unit = js.native
  /**
    * Adds a logging channel with the specified logging level to the current logging session.
    * @param loggingChannel The logging channel to add.
    * @param maxLevel The logging level for loggingChannel.
    */
  def addLoggingChannel(loggingChannel: ILoggingChannel, maxLevel: LoggingLevel): Unit = js.native
  /**
    * Ends the current logging session and saves it to a file.
    * @return When this method completes, it returns the new file as a StorageFile .
    */
  def closeAndSaveToFileAsync(): IPromiseWithIAsyncOperation[StorageFile] = js.native
  /**
    * Removes the specified logging channel from the current logging session.
    * @param loggingChannel The logging channel to remove.
    */
  def removeLoggingChannel(loggingChannel: ILoggingChannel): Unit = js.native
}

