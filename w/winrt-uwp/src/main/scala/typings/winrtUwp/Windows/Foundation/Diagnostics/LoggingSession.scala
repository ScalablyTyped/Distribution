package typings.winrtUwp.Windows.Foundation.Diagnostics

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.IStorageFolder
import typings.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the destination of logged messages from LoggingChannel instances. */
@js.native
trait LoggingSession extends StObject {
  
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
  
  /** Ends the current logging session. */
  def close(): Unit = js.native
  
  /** Gets the name of the logging session. */
  var name: String = js.native
  
  /**
    * Removes the specified logging channel from the current logging session.
    * @param loggingChannel The logging channel to remove.
    */
  def removeLoggingChannel(loggingChannel: ILoggingChannel): Unit = js.native
  
  /**
    * Saves the current logging session to a file.
    * @param folder The folder that contains the log file.
    * @param fileName The name of the log file.
    * @return When this method completes, it returns the new file as a StorageFile .
    */
  def saveToFileAsync(folder: IStorageFolder, fileName: String): IPromiseWithIAsyncOperation[StorageFile] = js.native
}
