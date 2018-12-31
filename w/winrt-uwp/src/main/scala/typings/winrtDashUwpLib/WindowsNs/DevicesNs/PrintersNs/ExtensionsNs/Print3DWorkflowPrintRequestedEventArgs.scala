package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about the print request to the app that initiated the request. */
@JSGlobal("Windows.Devices.Printers.Extensions.Print3DWorkflowPrintRequestedEventArgs")
@js.native
abstract class Print3DWorkflowPrintRequestedEventArgs () extends js.Object {
  /** Gets the status of the print request. */
  var status: Print3DWorkflowStatus = js.native
  /**
    * Sets the extended status of the print request.
    * @param value The extended status of the print request.
    */
  def setExtendedStatus(value: Print3DWorkflowDetail): scala.Unit = js.native
  /**
    * Sets the latest model data, including any updates made by the Print3DWorkflow .
    * @param source The latest model data, including any updates made by the Print3DWorkflow .
    */
  def setSource(source: js.Any): scala.Unit = js.native
  /**
    * Indicates if the data model has been updated by the Print3DWorkflow .
    * @param value Returns true if the data model has been updated; otherwise, false.
    */
  def setSourceChanged(value: scala.Boolean): scala.Unit = js.native
}

