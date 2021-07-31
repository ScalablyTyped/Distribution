package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a set of printing instructions that you want to run on the journal printer station. */
@js.native
trait JournalPrintJob extends StObject {
  
  /**
    * Runs the print job on the journal printer station asynchronously.
    * @return The operation to run the print job. This operation returns true if the print job succeeds; otherwise, the operation returns false.
    */
  def executeAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /**
    * Adds an instruction to the print job to print the specified text on the journal printer station.
    * @param data The text to print on the journal printer.
    */
  def print(data: String): Unit = js.native
  
  /** Adds an instruction to the print job to print a newline character on the journal printer station. */
  def printLine(): Unit = js.native
  /**
    * Adds an instruction to the print job to print the specified line of text on the journal printer station.
    * @param data The line of text to print.
    */
  def printLine(data: String): Unit = js.native
}
