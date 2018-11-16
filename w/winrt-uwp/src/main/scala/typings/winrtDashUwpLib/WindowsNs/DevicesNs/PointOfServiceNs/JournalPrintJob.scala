package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a set of printing instructions that you want to run on the journal printer station. */
@JSGlobal("Windows.Devices.PointOfService.JournalPrintJob")
@js.native
abstract class JournalPrintJob () extends js.Object {
  /**
                   * Runs the print job on the journal printer station asynchronously.
                   * @return The operation to run the print job. This operation returns true if the print job succeeds; otherwise, the operation returns false.
                   */
  def executeAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
                   * Adds an instruction to the print job to print the specified text on the journal printer station.
                   * @param data The text to print on the journal printer.
                   */
  def print(data: java.lang.String): scala.Unit = js.native
  /** Adds an instruction to the print job to print a newline character on the journal printer station. */
  def printLine(): scala.Unit = js.native
  /**
                   * Adds an instruction to the print job to print the specified line of text on the journal printer station.
                   * @param data The line of text to print.
                   */
  def printLine(data: java.lang.String): scala.Unit = js.native
}

